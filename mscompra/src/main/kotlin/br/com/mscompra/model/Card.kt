package br.com.mscompra.model
import java.math.BigDecimal
import java.util.*
import java.util.random.RandomGenerator
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id


@Entity
data class Card (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id : Long,
    val numberCard: String? = UUID.randomUUID().toString(),
    val availableLimit: BigDecimal? = BigDecimal.ZERO
        )
