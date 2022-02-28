package br.com.mscompra.integration.rabbitmq


import br.com.mscompra.model.Order
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import org.springframework.amqp.core.MessageProperties
import org.springframework.amqp.core.MessageProperties.CONTENT_TYPE_JSON
import org.springframework.amqp.rabbit.core.RabbitTemplate
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter
import org.springframework.amqp.support.converter.SimpleMessageConverter
import org.springframework.stereotype.Service
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import kotlin.math.max


@Service
class Producer (
    val rabbitTemplate: RabbitTemplate,
    val rabbitmqConfig: RabbitmqConfig,
    val mapper: ObjectMapper
) {


    @PostMapping
    fun sendProducer(order: Order ){
        println(rabbitmqConfig.queueName.toString())
        rabbitTemplate.convertAndSend(rabbitmqConfig.queueName, mapper.writeValueAsBytes(order))
    }

}