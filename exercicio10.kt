/*Faça um Programa que peça 2 números inteiros e um número real. Calcule 
e mostre:
a)o produto do dobro do primeiro com metade do segundo .
b)a soma do triplo do primeiro com o terceiro.
c)o terceiro elevado ao cubo.*/

fun main (){
    val num1: Int
    val num2: Int
    var num3: float
    val a: Int
    val b: float
    val c: float

    println("Informe dois números inteirios e um numero real")
    num1 = readLine()!!.toInt()
    num2 = readLine()!!.toInt()
    num3 = readLine()!!.toFloat()

    a = (2 * num1) * (num2/2)
    b = (3 * num1) + num3
    c = num3 * num3 * num3

    println("O produto do dobro do primeiro com metade do segundo? $a")
    println("A soma do triplo do primeiro com o terceiro: ")
    println("o terceiro elevado ao cubo: %.2f".format(c))//formatação de números depois da vírgula
}
