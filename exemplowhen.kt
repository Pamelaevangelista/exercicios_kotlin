//Se eu quiser, por exemplo, testar se a variável x tem valor 1 ou 2:
fun main (){
    val x = 1

    when (x) {
        0,1 -> println("x == 0 ou x == 1")
        else -> println("x tem outro valor")
    }
}