package br.com.mscompra.model

import com.fasterxml.jackson.annotation.JsonFormat
import com.fasterxml.jackson.databind.annotation.JsonNaming
import java.math.BigDecimal
import java.util.Date
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "tb_order")
data class Order(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,
    val name: String,
    val product: Long,
    val value: BigDecimal,
    @JsonFormat(pattern = "yyyy-mm-dd")
    val datePurchase: Date,
    val cpfClient: Long,
    val cep: String
)