package com.kotlin.kotlin.classes;

import lombok.val;



    // Classe Person representa uma pessoa com nome, sobrenome e idade
class Person(
    // Atributo público e imutável (val) com valor padrão "Desconhecido"
    val name: String = "Desconhecido",

    // Parâmetro usado apenas dentro da classe, não é um atributo acessível fora dela
    lastName: String,

    // Atributo público e imutável com valor padrão 0
    val age: Int = 0
) {

    // fullName é um atributo calculado a partir de name e lastName
    val fullName: String = "$name $lastName"

    // password é um atributo privado, visível apenas dentro da classe
    // Ele gera uma senha aleatória concatenando o nome com um número
    private val password: String = name + Random.nextInt(100)

    // Método privado usado apenas internamente para exibir a senha
    private fun usePassword() {
        println(password)
    }

    // Método público que representa a ação de "trabalhar"
    // Ele usa a senha internamente e imprime uma mensagem
    fun work() {
        usePassword()
        println("$name, $age trabalhando...")
    }
}

// Função principal que cria instâncias da classe e chama seus métodos
fun main() {

    // Cria uma instância da classe Person com todos os parâmetros
    val jose: Person = Person(name = "José", lastName = "Silva", age = 20)

    // Cria uma instância da classe com nome e sobrenome, mas usa o valor padrão para idade
    val maria: Person = Person(name = "Maria", lastName = "Rodrigues")

    // Chama o método work para cada pessoa
    jose.work()
    maria.work()

    // Acessa o atributo público fullName e imprime
    println(jose.fullName)
    println(maria.fullName)
}


