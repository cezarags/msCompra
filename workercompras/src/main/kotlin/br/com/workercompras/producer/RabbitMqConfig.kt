package br.com.workercompras.producer

import org.springframework.amqp.core.Queue
import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class RabbitMqConfig (
        @Value("\${queue.name.pendente}")
        val queueName: String)
{
        @Bean
        fun queue(): Queue {
            return Queue(queueName, true)

        }
}