fun main () {

    //lista de preços dos produtos
    val precos = listOf(100.0, 200.0, 300.0, 400.0)

    //lsita para armazenar os preços com desconto 
    val precosComDesconto = mutableListOf<Double>()

    //Iterando sobre a lista de preços com índices 
    for ((indice, preco) in precos.withIndex()) {
        val desconto = when (indice) {
            0 -> 0.10 // 10% de desconto para o primeiro produto
            1 -> 0.15 //15% de desconto para o segundo produto
            else -> 0.20 // 20% de descont par os demais produtos 
        }
        // Calculando o preço com desconto
        val precoComDesconto = preco * (1 - desconto)
        precosComDesconto.add(precoComDesconto) //Adiciona o preço com desconto à nova lista 

    } 
//Imprimindo os preços originais e os preços com desconto
println("Preços originais: $precos")
println("Preços com desconto: $precosComDesconto")
}