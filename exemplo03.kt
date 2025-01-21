/* O tipo de booleano possui funções para essas operações. São elas and,or e not */

fun main () {
    val b1 = true
    val b2 = false
    val c1 = b1.and(b2) // Retorno será false
    val c2 = b1.or(b2) // Retorno será true 
    val c3 = b1.not() // Retorno será false
    println("$c1 $c2 $c3")
}