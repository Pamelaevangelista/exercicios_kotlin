//Se você não usar withIndex(), precisará gerenciar os índices manualmente.

fun main() {
    val lista = listOf(1, 2, 3, 4)

    for ( i in lista.indices) { //Percorre os índices da lista
        println("Índice: $i \t valor: ${lista[i]}")

    }
}