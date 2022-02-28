package br.com.worker.validator

import org.springframework.amqp.rabbit.annotation.EnableRabbit
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@EnableRabbit
@SpringBootApplication
class ValidatorApplication

fun main(args: Array<String>) {
	runApplication<ValidatorApplication>(*args)
}
