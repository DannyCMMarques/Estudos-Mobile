package com.kotlin.kotlin.propriedades_personalizadas;

// Classe que representa uma pessoa com nome, idade e altura
class Person(
    // 🔹 name é um atributo imutável (val), definido no construtor
    val name: String,
) {
    // 🔹 age é uma propriedade mutável com lógica de atribuição personalizada (setter)
    var age: Int = 0
        set(value) {
            // Se o valor for maior ou igual a zero, ele é atribuído normalmente
            // Senão, imprime uma mensagem de aviso
            if (value >= 0) field = value
            else println("Idade não pode ser negativa")
        }

    // 🔹 height é uma propriedade mutável com lógica de leitura personalizada (getter)
    var height: Double = 0.0
        get() = Math.ceil(field) // Retorna o valor arredondado para cima
        // Ex: 175.1 → 176.0, 180.0 → 180.0
}

fun main() {
    // Criamos uma pessoa com nome "João"
    val joao = Person(name = "João")

    // Atribuímos idade válida
    joao.age = 30

    // Atribuímos altura com casas decimais
    joao.height = 175.9

    // Imprime a idade (sem modificações)
    println(joao.age)          // 30

    // Imprime a altura, que será arredondada para cima
    println(joao.height)       // 176.0

    // Tentamos atribuir idade negativa → não aceita
    joao.age = -10             // "Idade não pode ser negativa"
}