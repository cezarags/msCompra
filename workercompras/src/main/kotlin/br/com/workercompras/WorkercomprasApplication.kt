package br.com.workercompras

import br.com.workercompras.service.CepService
import org.springframework.amqp.rabbit.annotation.EnableRabbit
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.openfeign.EnableFeignClients

@EnableRabbit
@SpringBootApplication
@EnableFeignClients
class WorkercomprasApplication



fun main(args: Array<String>) {
	runApplication<WorkercomprasApplication>(*args)


}
