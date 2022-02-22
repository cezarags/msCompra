package br.com.workercompras.mapper

interface Mapper<T,U> {

    fun mapper(t: T) :U

}
