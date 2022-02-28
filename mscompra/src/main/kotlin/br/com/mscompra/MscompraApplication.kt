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
 /*
 1 - Worker de compras busca o cartao do cliente
 2 - Monta o Payload com os dados do cartão
 3 - Envia o payload cpara o WorkerAutorizador


 1 - WorkerAuthorizador recebe o payload
 2 - valida o cartão
 3 - Valida se o cartão tem limite disponivel
 4 - Valida se o limite disponivel é > valor_producto
 5 - Aprova ou reprova a compra conform regras acima
  */