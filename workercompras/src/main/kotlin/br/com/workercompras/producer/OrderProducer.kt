package br.com.workercompras.producer


import br.com.workercompras.model.Card
import br.com.workercompras.model.Order
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import org.slf4j.LoggerFactory
import org.springframework.amqp.rabbit.core.RabbitTemplate
import org.springframework.boot.json.GsonJsonParser
import org.springframework.stereotype.Service
import java.math.BigDecimal



@Service
class OrderProducer(
    private val rabbitTemplate: RabbitTemplate,
    private val rabbitMqConfig: RabbitMqConfig


) {

    private val log = LoggerFactory.getLogger(OrderProducer::class.java)

    fun sendOrder(order: Order) {

        rabbitTemplate.convertAndSend(rabbitMqConfig.queueName, jacksonObjectMapper().writeValueAsString(order))
        log.info(
            " Pedido montado com sucesso em Worker Compras - Pedido Producer: {}",
            jacksonObjectMapper().writeValueAsString(order))

    }
}

