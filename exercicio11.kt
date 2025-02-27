/*Tendo como dado de entrada a altura (h) de uma pessoa, construa um 
algoritmo que calcule seu peso ideal, utilizando as seguintes fórmulas:
a) Para homens: (72.7*h) - 58
b) Para mulheres: (62.1*h) - 44.7*/

fun main(){
    val altura: Double
    val peso_homem: Double
    val peso_mulher: Double

    println("Informe a altura: (em metros)")
    altura = readLine()!!.toDouble()

    peso_homem = (72.7 * altura) - 58
    peso_mulher = (62.1 * altura) - 44.7

    println("Informe o seu gênero(homem, mulher ou outros):  ")
    val genero = readLine()!!.lowercase()
    
    //Exibir o peso ideal com base na escolha do usauário
    when (genero){
        "homem" -> println("o peso ideal para homens é:  %.2f".format(peso_homem))
        "mulher" -> println("o peso ideal para mulheres é:  %.2f".format(peso_mulher))
        "outros" -> {
            //se o usuário escolher " outros", mostra amabos os pesos ideais
            println("o peso ideal para homens é:  %.2f".format(peso_homem))
            println("o peso ideal para mulheres é:  %.2f".format(peso_mulher))
        }
        else -> println("Por favor,informe as alternativas: 'homem', 'mulher' ou ''outros")
    }
}