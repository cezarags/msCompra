package br.com.mscompra.controller

import br.com.mscompra.api.ApiOrder
import br.com.mscompra.model.Order
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.RestController

@RestController
class OrderController:ApiOrder {

    override fun placeOrder(order: Order) : ResponseEntity<Order> {
        return ResponseEntity.ok(order)
    }
}