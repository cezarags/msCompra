package br.com.mscompra.service.impl

import br.com.mscompra.model.Order
import org.springframework.stereotype.Service

@Service
interface OrderService {

    fun saveOrder(order: Order): Order
}