package br.com.mscompra.model


import com.fasterxml.jackson.annotation.JsonFormat
import java.math.BigDecimal
import java.util.Date
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table
import javax.validation.constraints.Min
import javax.validation.constraints.NotBlank
import kotlinx.serialization.Serializable

@Entity
@Table(name = "tb_order")
@Serializable
data class Order (

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,
    @NotBlank
    val name: String,
    @NotBlank
    @Min(1)
    val product: String,
    val value: BigDecimal,
    @JsonFormat(pattern = "yyyy-mm-dd")
    val datePurchase: Date,
    @NotBlank
    val cpfClient: Long,
    @NotBlank
    val cep: String,
    @NotBlank
    val email: String

)