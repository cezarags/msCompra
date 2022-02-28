package br.com.worker.validator.model

import java.math.BigDecimal

data class Card (
    var numberCard : String,
    var availableLimit: BigDecimal
        )
