package com.kotlin.kotlin.objetosComplementares;

// Classe que representa uma pessoa
class Person {

    // 🔹 Companion Object: semelhante ao 'static' em Java
    // Tudo aqui pertence à classe Person, não à instância
    companion object {

        // Constante pública: pode ser acessada diretamente como Person.KEY
        const val KEY = "12345678"

        // Constante privada: só pode ser acessada dentro do companion object
        private val KEY_2 = "1234567890"

        // Função pública que retorna a junção das duas chaves
        // Pode ser chamada como Person.getKey()
        fun getKey(): String {
            return KEY + KEY_2
        }
    }
}

fun main() {

    // Acessa a constante KEY sem precisar instanciar a classe
    val key = Person.KEY

    // Cria uma instância da classe Person (não obrigatória neste caso)
    val jose = Person()

    // Chama a função getKey() diretamente da classe (sem usar jose)
    val obtainKey = Person.getKey()

    // Apenas para ver os valores no terminal (opcional)
    println("KEY: $key")
    println("KEY completa: $obtainKey")
}
