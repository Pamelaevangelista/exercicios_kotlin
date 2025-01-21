/*Para definir funções em Kotlin utilizamos a palavra fun , seguida do nome
da função, seus argumentos e seu retorno.

Exemplo de função que possui retorno*/

// definição da função somar
fun somar(n1: Int, n2: Int): Int {
    return n1 + n2 // Retorna a soma de n1 e n2 
}

fun main (){
    //chamando a função somar com os valores 5 e 7
    val resultado = somar(5, 7)

    //Imprimindo o resultado
    println("A soma de 5 e 7 é: $resultado")
}