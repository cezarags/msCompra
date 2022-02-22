package br.com.mscompra
import org.springframework.amqp.rabbit.annotation.EnableRabbit
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@EnableRabbit
@SpringBootApplication
class MscompraApplication

fun main(args: Array<String>) {
	runApplication<MscompraApplication>(*args)
}
