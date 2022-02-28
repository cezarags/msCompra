package br.com.workercompras.service

import br.com.workercompras.model.Order
import br.com.workercompras.producer.OrderProducer
import org.slf4j.LoggerFactory
import org.springframework.mail.SimpleMailMessage
import org.springframework.mail.javamail.JavaMailSender
import org.springframework.stereotype.Service

@Service
class SendEmail(
    val javaMailSender: JavaMailSender,
    val orderProducer: OrderProducer
) {

    private val log = LoggerFactory.getLogger(SendEmail::class.java)

    fun send(order: Order) {
        var msg = SimpleMailMessage()
        msg.setTo(order.email)
        msg.setSubject("Compra Recebida")
        msg.setText("Este é um e-mail de confirmação de compra recebida, " +
                "Agora vamos analisar seu pedido.")
        javaMailSender.send(msg)
        log.info("Cliente notificado  com sucesso")

        log.info("Preparando o pedido Producer")
        orderProducer.sendOrder(order)




    }
}