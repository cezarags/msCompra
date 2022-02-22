package br.com.mscompra.integration.rabbitmq


import br.com.mscompra.model.Order
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import org.springframework.amqp.rabbit.core.RabbitTemplate
import org.springframework.stereotype.Service
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import kotlin.math.max


@Service
class Producer(
    val rabbitTemplate: RabbitTemplate,
    val rabbitmqConfig: RabbitmqConfig
) {


    @PostMapping
    fun sendProducer(order: Order ){
        println(rabbitmqConfig.queueName.toString())
        rabbitTemplate.convertAndSend(rabbitmqConfig.queueName, jacksonObjectMapper().writeValueAsString(order))
    }

}