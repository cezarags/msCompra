package br.com.mscompra.service.impl

import br.com.mscompra.integration.rabbitmq.Producer
import br.com.mscompra.model.Order
import br.com.mscompra.repository.OrderRepository
import org.springframework.stereotype.Service

@Service
class OrderServiceImpl(
    val orderRepository: OrderRepository,
    val producer: Producer
): OrderService {

    override fun saveOrder(order: Order): Order {
       var order = orderRepository.save(order)
        producer.sendProducer(order)
        return order

    }
}