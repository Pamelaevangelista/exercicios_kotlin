//Posso também verificar se x está dentro de um intervalo de valores.
fun main (){
    val x = 7

    when(x) {
        in 1..10 -> println("x está no intervalo")
        else -> println("x está fora do intervalo")
    }
}