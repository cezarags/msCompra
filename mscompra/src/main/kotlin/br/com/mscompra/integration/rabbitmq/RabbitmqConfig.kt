package br.com.mscompra.integration.rabbitmq


import com.rabbitmq.client.impl.recovery.RecoveredQueueNameSupplier
import org.springframework.amqp.core.Queue
import org.springframework.beans.factory.annotation.Value

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
data class RabbitmqConfig(
    @Value("\${queue.name}")
    val queueName: String
) {
    @Bean
    fun queue(): Queue{
        return  Queue(queueName, true)
    }
}