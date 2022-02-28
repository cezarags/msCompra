package br.com.workercompras.mapper

import br.com.workercompras.model.Card
import br.com.workercompras.model.Order
import java.math.BigDecimal
import java.time.Instant.now
import java.time.LocalDate
import java.time.LocalDateTime
import java.util.*

class OrderViewMapper: Mapper<String, Order> {

    override fun mapper(t: String): Order {
        return  Order(
            id =  1,
            value = BigDecimal.ONE,
            product = "",
            name = "tete",
            datePurchase = Date("2021-05-10"),
            cep = "te",
            cpfClient = 1,
            email = "",
           card = Card(
               numberCard = "",
               availableLimit = BigDecimal.ZERO
            )
        )
    }
}


