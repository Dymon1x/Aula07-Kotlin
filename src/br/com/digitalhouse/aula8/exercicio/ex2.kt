package br.com.digitalhouse.aula8.exercicio

fun main(){
// para tirar o MASTER da raiz - (rm -rf .git)
    try {
        val lista2 = ArrayList<String>(null)
        lista2.add("Pato")
        lista2.add("Cachorro")
        lista2.add("Gato")
//        println("O 2ª posição é: ${lista2[2]}") // acontecerá o erro null
        println("O 5ª posição é: ${lista2[5]}")
    }catch (ex: Exception){
        println("A exception é: ${ex.message}")
        println("A causa foi: ${ex.cause}")
    }
}