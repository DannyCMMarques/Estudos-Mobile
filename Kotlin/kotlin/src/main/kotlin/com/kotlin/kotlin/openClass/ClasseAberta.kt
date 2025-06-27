package com.kotlin.kotlin.openClass;

public class ClasseAberta {
// 🔹 A classe Animal é marcada como 'open' para poder ser herdada
open class Animal(val name: String) {

    // 🔹 Atributo 'age' pode ser sobrescrito por classes filhas
    open val age: Int = 0

    // 🔹 Método que pode ser sobrescrito em subclasses
    open fun sound() {
        println("$name: som") // comportamento genérico
    }
}

// 🔹 Classe Dog herda de Animal e sobrescreve age e sound
class Dog(override val age: Int) : Animal(name = "Cachorro") {

    // 🔹 Sobrescrevendo o método sound com comportamento específico
    override fun sound() {
        println("$name: AU!") // comportamento específico de cachorro
    }
}

fun main() {
    // Criando uma instância de Dog com idade 5
    val dog = Dog(age = 5)

    // Chamando o método sobrescrito
    dog.sound()         // imprime: Cachorro: AU!

    // Acessando o valor sobrescrito de age
    println(dog.age)    // imprime: 5
}
}
