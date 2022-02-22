package br.com.workercompras.model

import com.fasterxml.jackson.annotation.JsonFormat
import java.math.BigDecimal
import java.util.*

data class Order (

    val id: Long,
    val name: String,
    val product: String,
    val value: BigDecimal,
    @JsonFormat(pattern = "yyyy-mm-dd")
    val datePurchase: Date,
    val cpfClient: Long,
    val cep: String,
    val email: String
)
