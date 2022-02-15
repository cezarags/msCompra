package br.com.mscompra.api

import br.com.mscompra.model.Order
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RequestMapping("/v1")
interface ApiOrder {

    @PostMapping("/createOrder")
    fun placeOrder (@RequestBody order: Order): ResponseEntity<Order>
}