package br.com.workercompras.integration

import br.com.workercompras.model.Address
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable

@FeignClient(name = "viacep", url = "https://viacep.com.br/ws/")
interface CepIntegration {

    @GetMapping("/{cep}/json/")
    fun findCep(@PathVariable cep: String): Address
}