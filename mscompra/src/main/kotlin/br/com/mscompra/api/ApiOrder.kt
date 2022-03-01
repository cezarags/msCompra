package br.com.mscompra.api

import br.com.mscompra.model.Order
import org.springframework.http.ResponseEntity
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import javax.validation.Valid


@RequestMapping("/v1")
interface ApiOrder {

    @PostMapping("/createOrder")
    fun placeOrder (@RequestBody @Valid order: Order): ResponseEntity<Order>


    @GetMapping("/get")
    fun getString(): String
}