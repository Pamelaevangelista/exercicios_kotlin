/*O for é amplamente utilizado para iterar listas, sendo adequado
quando sabemos o número de interações que o programa precisa fazer
Iterar: é o processo de repetir um conjunto de instruções ou um
bloco de código várias vezes até que uma condição específica seja
atendida*/

fun main() {
    //criando uma lista de números
    val lista = listOf(1, 2, 3, 4)

    //Iterando sobre a lista com um loop for
    for (i in lista) {
        println("Item: $i") // Imprime o item atual da lista
    }
}