package br.com.workercompras.consumer

import br.com.workercompras.model.Order
import br.com.workercompras.service.CepService
import br.com.workercompras.service.SendEmail
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import org.springframework.amqp.core.Message

import org.springframework.amqp.rabbit.annotation.RabbitListener
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter
import org.springframework.context.annotation.Bean


import org.springframework.messaging.handler.annotation.Payload
import org.springframework.stereotype.Component
import java.math.BigDecimal
import java.security.PrivateKey


@Component
data class Consumer(
    val emailService: SendEmail,
    val cepService: CepService

){
    @RabbitListener(queues = ["\${queue.name}"])
    fun consumer(@Payload message:  Message){
        val order = jacksonObjectMapper().readValue(message.body, Order::class.java)
        emailService.send(order)
        println("Recebimento de evento ${order.id}")
        cepService.SearchCep("05568113")


    }
}