package br.com.workercompras.consumer

import br.com.workercompras.model.Order
import br.com.workercompras.service.SendEmail
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.fasterxml.jackson.module.kotlin.readValue
import org.springframework.amqp.core.Message
import org.springframework.amqp.rabbit.annotation.RabbitListener
import org.springframework.context.annotation.Bean

import org.springframework.messaging.handler.annotation.Payload
import org.springframework.stereotype.Component
import java.security.PrivateKey


@Component
class Consumer(
    val emailService: SendEmail
){

    @RabbitListener(queues = ["\${queue.name}"])
    fun consumer(@Payload order: String ){
        val order: Order = jacksonObjectMapper().readValue(order,Order::class.java)
        emailService.send(order.email)
        println("Recebimento de evento ${order.id}")

    }
}