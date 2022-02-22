package br.com.workercompras.service

import org.springframework.mail.SimpleMailMessage
import org.springframework.mail.javamail.JavaMailSender
import org.springframework.stereotype.Service

@Service
class SendEmail(
    val javaMailSender: JavaMailSender
) {
    fun send(email: String) {
        var msg = SimpleMailMessage()
        msg.setTo(email)
        msg.setSubject("Compra Recebida")
        msg.setText("Este é um e-mail de confirmação de compra recebida, " +
                "Agora vamos analisar seu pedido.")
        javaMailSender.send(msg)








    }
}