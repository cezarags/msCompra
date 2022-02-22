package br.com.workercompras

import org.springframework.amqp.rabbit.annotation.EnableRabbit
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@EnableRabbit
@SpringBootApplication
class WorkercomprasApplication

fun main(args: Array<String>) {
	runApplication<WorkercomprasApplication>(*args)
}
