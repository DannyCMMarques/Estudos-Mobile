package com.kotlin.kotlin.lacos_de_repeticao;

public class LacosDeRepeticao {
fun main() {

    // ---------- FOR ----------

    // Lista com diferentes tipos de dados
    val list = listOf("abc", "def", "ghi", false, 10.0)

    // 1. For clássico: percorre cada item da lista
    for (item in list) {
        println(item)
    }

    // 2. forEach: função de alta ordem para iterar a lista
    list.forEach { item ->
        println(item)
    }

    // 3. forEachIndexed: itera com índice e item
    list.forEachIndexed { index, item ->
        println("index: $index | item: $item")
    }

    // 4. withIndex() + destructuring: acessa índice e item
    for ((index, item) in list.withIndex()) {
        if (index == 3)
            continue // pula o item no índice 3 (não imprime)

        println("index: $index | item: $item")
    }

    // ---------- WHILE ----------

    var index = 1
    val maxLimit = 5

    // Loop while: executa enquanto a condição for verdadeira
    while (index <= maxLimit) {
        println("$index...")
        index++ // incrementa o índice
    }

    // ---------- DO-WHILE ----------

    var index2 = 1

    // do/while: executa o bloco ao menos uma vez
    do {
        println(index2)

        if (index2 == 3) {
            break // interrompe o laço quando index2 for 3
        }

        index2++
    } while (index2 <= 5)

    // ---------- LAÇOS ANINHADOS ----------

    // loop@ = label usada para referenciar qual laço será quebrado
    loop@ for (i in 1..3) {
        for (j in 1..3) {
            if (i == 2 && j == 2) {
                break@loop // quebra o laço externo
            }
            println("i = $i | j = $j")
        }
    }

    // ---------- REPEAT ----------

    var index3 = 1

    // repeat: executa o bloco de código um número fixo de vezes
    repeat(5) {
        println()
        index3++ // variável incrementada mas não usada no print
    }
}
}
