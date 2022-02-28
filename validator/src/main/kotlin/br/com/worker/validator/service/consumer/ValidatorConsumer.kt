package br.com.worker.validator.service.consumer

import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import org.slf4j.LoggerFactory
import br.com.worker.validator.model.Order
import org.springframework.amqp.rabbit.annotation.RabbitListener
import org.springframework.messaging.handler.annotation.Payload
import org.springframework.stereotype.Component

@Component
class ValidatorConsumer {

    private val log = LoggerFactory.getLogger(ValidatorConsumer::class.java)

    @RabbitListener(queues = ["\${queue.name}"])
    fun consumer(@Payload order: String){
        var order  = jacksonObjectMapper().readValue(order, Order::class.java)
        log.info("Pedido recebido pelo validador: {}", order)


    }
}