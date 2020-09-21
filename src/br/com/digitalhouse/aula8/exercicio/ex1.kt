package br.com.digitalhouse.aula8.exercicio

fun main(){
    val lista = ArrayList<String>()
    lista.add("Pato")
    lista.add("Cachorro")
    lista.add("Gato")

    try {
        println("O terceiro elemento: ${lista[3]}")
    }catch (ex: Exception){
        println("O erro foi por causa: ${ex.message}")
        println("A causa foi: ${ex.cause}")
    }
}