package com.kotlin.kotlin.listsAndArrays;

public class list_and_array {
fun main() {

    // ========================
    // 🔷 ARRAY
    // ========================
    println("array")

    // Declaração de um array de inteiros
    val array: Array<Int> = arrayOf(1, 2, 3, 4, 5)

    // Declaração de um array de strings
    val array2: Array<String> = arrayOf("1", "2", "3")

    // Exibe os elementos do array formatados com separador personalizado
    println(array.joinToString(prefix = "[", postfix = "]", separator = " | "))

    // Exibe os elementos do array de strings com separador padrão (vírgula)
    println(array2.joinToString())

    // Cria um segundo array de inteiros
    val array3: Array<Int> = arrayOf(6, 7, 8, 9, 10)

    // Soma os dois arrays (concatena os elementos)
    val arraySum = array.plus(array3)

    // Exibe o array resultante da concatenação
    println(arraySum.joinToString())

    // ========================
    // 🔷 LIST
    // ========================
    println("list")

    // Lista imutável com vários tipos (Int, String, Boolean, Range, Double)
    val list = listOf(2, 2, 4, "1", false, 1..3, 4.0, 5, 3, 1)

    // Lista mutável de inteiros
    val mutableList = mutableListOf(1, 2, 3)

    // Adiciona um novo elemento à lista mutável
    mutableList.add(4)

    // Exibe a lista mutável atualizada
    println(mutableList)

    // Filtra apenas os elementos do tipo Int da lista heterogênea
    val listInt : List<Int> = list.filterIsInstance<Int>()
    println(listInt)

    // Filtra os inteiros maiores que 2
    val listIntHigherThan2 = listInt.filter { it > 2 }
    println(listIntHigherThan2)

    // Lista bagunçada de inteiros e de strings
    val listIntMessy = listOf(9, 18, 70, -110, 3, 750, 8, 16, 32_550, 2)
    val listStringMessy = listOf("Bernardo", "Alice", "Jhonatan", "Roberto", "Clara")

    // Ordena a lista de inteiros e de strings
    println(listIntMessy.sorted())
    println(listStringMessy.sorted())

    // Inverte a ordem das listas
    println(listIntMessy.reversed())
    println(listStringMessy.reversed())

    // Encontra o maior e menor valor da lista de inteiros
    val intMax = listIntMessy.max()
    val intMin = listIntMessy.min()
    println(intMax)
    println(intMin)

    // Encontra o primeiro e o último número ímpar da lista original
    val findFirstOdd = list.find { it is Int && it % 2 != 0 }
    val findLastOdd = list.findLast { it is Int && it % 2 != 0 }
    println(findFirstOdd)
    println(findLastOdd)

    // Mapeia os valores para booleanos: true se maior que 10
    val booleanMapIntHigherThan10 = listIntMessy.map { it > 10 }
    println(booleanMapIntHigherThan10)

    // ========================
    // 🔷 MÉTODOS IMPORTANTES DE LIST
    // ========================

    println(list.first())                 // primeiro elemento da lista
    println(list.last())                  // último elemento da lista
    println(list.subList(0, 3))           // sublista do índice 0 ao 2
    println(list[3])                      // elemento na posição 3
    println(list.indexOf(4))              // retorna o índice do valor 4
    println(list.indices)                 // intervalo de índices disponíveis
    println(list.size)                    // tamanho total da lista
    println(list.isEmpty())               // verifica se a lista está vazia
    println(list.isNotEmpty())            // verifica se a lista não está vazia
    println(list.drop(2))                 // remove os dois primeiros elementos
    println(list.dropLast(2))             // remove os dois últimos elementos
    println(list.dropWhile { it is Int }) // remove enquanto for Int

    println(listInt.any { it < 0 })       // verifica se algum elemento é menor que 0
    println(listStringMessy.any { it.startsWith("Z") }) // algum começa com Z?

    println(list.all { it is Int })       // verifica se todos são Int
    println(list.zip(listInt))            // junta duas listas em pares (tuplas)
    println(list.elementAt(1))            // pega o elemento no índice 1
    println(list.getOrNull(10))           // tenta acessar o índice 10; retorna null se não existir

    // mapeia os elementos somando com seu índice
    println(listInt.mapIndexed { index, item -> index + item })
}

}
