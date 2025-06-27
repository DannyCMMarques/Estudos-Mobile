package com.kotlin.kotlin.setMap;

public class setMap {
fun main() {

    // ========================
    // 🔶 SET (conjunto)
    // ========================

    // Um Set não permite elementos duplicados. Aqui, o número 2 será ignorado na repetição
    val set = setOf(1, 2, 3, 2) // Resultado: [1, 2, 3]

    // Set com múltiplos tipos e elementos duplicados (que serão ignorados)
    val setRandom = setOf(1, 2, 3, "kotlin", "kotlin", "bernardo", 4.0, 5f, 0..100, 1, 2, 19, "kotlin2")

    // MutableSet permite modificações (adicionar/remover elementos)
    val setMutable = mutableSetOf(1, 2, 3, "kotlin", "kotlin2", 4.0, 5.0)

    // Adiciona o número 10 ao conjunto
    setMutable.add(10)

    // Remove o número 1 do conjunto
    setMutable.remove(1)

    // Exibe o conjunto mutável resultante
    println(setMutable)

    // HashSet é uma implementação específica de Set com busca mais rápida
    val hasSet = hashSetOf(1, 2, 3)

    // ========================
    // 🔶 MAP (dicionário/chave-valor)
    // ========================

    // Map imutável com chaves do tipo Int e valores do tipo String
    val map = mapOf<Int, String>(
        Pair(1, "Kotlin"),   // Forma tradicional
        1 to "kotlin 2",     // Sobrescreve a chave 1
        2 to "kotlin 2",
        3 to "kotlin 3",
        1 to "kotlin 3"      // Sobrescreve novamente a chave 1
    )

    // Exibe o mapa completo
    println(map)

    // Exibe apenas as chaves
    println(map.keys)

    // Exibe apenas os valores
    println(map.values)

    // Exibe pares de chave-valor (entries)
    println(map.entries)

    // MutableMap permite modificação e pode conter chaves/valores de tipos variados
    val mapMutable = mutableMapOf(
        1 to "kotlin",            // Int -> String
        "kotlin" to 1,            // String -> Int
        1f to 1,                  // Float -> Int
        0..10 to 1                // IntRange -> Int
    )

    // Exibe o mapa mutável
    println(mapMutable)

    // HashMap é uma implementação otimizada para inserção e busca
    val hasMap = hashMapOf(1 to "kotlin")
}

}
