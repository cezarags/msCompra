package br.com.mscompra.controller

import br.com.mscompra.api.ApiOrder
import br.com.mscompra.model.Order
import br.com.mscompra.service.impl.OrderService
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Service
import org.springframework.web.bind.annotation.RestController
import javax.validation.Valid

@RestController
class OrderController(
    val orderService: OrderService
):ApiOrder {

    override fun placeOrder(order: Order) : ResponseEntity<Order> {
        val orderSave = orderService.saveOrder(order)
        return ResponseEntity.ok(orderSave)
    }
}