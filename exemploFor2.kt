/*Método withIndex(): permite iterar sobre uma lista enquanto acessa
tanto o valor quanto o índice de cada elemento. Isso é útil em
situações onde você precisa saber a posição de um item na lista além
do próprio valor.*/

fun main() {
    //Criando uam lsita de números
    val lista = listOf(1, 2, 3, 4)

    //Iterando sobre a lista com índice usando WithIndex()
    for ((indice, valor) in lista.withIndex()) {
        println("Índice: $indice \t valor: $valor")
    }
}