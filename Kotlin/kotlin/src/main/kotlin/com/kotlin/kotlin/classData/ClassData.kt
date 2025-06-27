package com.kotlin.kotlin.classData;

public class ClassData {
// Classe comum (não é data class)
class UserClass(val name: String, val age: Int)

// Data class — fornece automaticamente: toString, equals, copy, destructuring
data class UserDataClass(val name: String, val age: Int)

fun main() {

    // Criando uma instância de classe comum
    val userClass = UserClass(name = "João", age = 20)

    // Criando uma instância de data class
    val userDataClass = UserDataClass(name = "João 2", age = 21)

    // toString() em uma classe comum exibe o endereço de memória
    println(userClass.toString()) // Ex: aula.UserClass@1a2b3c

    // toString() em uma data class exibe os valores dos atributos
    println(userDataClass.toString()) // Ex: UserDataClass(name=João 2, age=21)

    // Comparando duas instâncias de data class com os mesmos valores
    val jose = UserDataClass(name = "José", age = 30)
    val maria = UserDataClass(name = "Maria", age = 40)
    val jose2 = UserDataClass(name = "José", age = 30)

    // userClass2 aponta para o mesmo objeto que userClass (comparação por referência)
    val userClass2 = userClass

    // equals() em data class compara os VALORES
    println(jose == jose2) // true — mesmo conteúdo

    // equals() em classe comum compara apenas a REFERÊNCIA
    println(userClass == userClass2) // true — porque são o mesmo objeto
    // Se fosse outra instância com mesmos valores, seria false

    // copy() permite criar um clone com alteração de valores
    val copyMaria = maria.copy(age = 50)
    println(copyMaria) // UserDataClass(name=Maria, age=50)

    // Desestruturação (só funciona em data class)
    val (name, age) = jose
    println(name) // José
    println(age)  // 30
}

}
