package br.com.mscompra.service.impl

import br.com.mscompra.model.Order
import br.com.mscompra.repository.OrderRepository
import org.springframework.stereotype.Service

@Service
class OrderServiceImpl(
    val orderRepository: OrderRepository
): OrderService {

    override fun saveOrder(order: Order): Order {
      return orderRepository.save(order)

    }
}