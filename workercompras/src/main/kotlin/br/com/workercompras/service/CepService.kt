package br.com.workercompras.service

import br.com.workercompras.integration.CepIntegration
import br.com.workercompras.model.Address
import org.springframework.stereotype.Service

@Service
class CepService(
    val cepIntegration: CepIntegration
) {

    fun SearchCep(cep: String): Address{
       var address = cepIntegration.findCep(cep)
        println(address)
        return  address


    }
}