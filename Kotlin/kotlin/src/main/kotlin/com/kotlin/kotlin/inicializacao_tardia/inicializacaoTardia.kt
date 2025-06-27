package com.kotlin.kotlin.inicializacao_tardia;

public class inicializacaoTardia {

fun main() {

    // 🔸 lateinit permite declarar uma variável que será inicializada depois
    // Só funciona com tipos de referência (ex: String, List, etc), e com var
    lateinit var a: String

    // Inicialização tardia — se tentar usar 'a' antes disso, gera exceção
    a = "kotlin lateinit"
    println(a) // imprime: kotlin lateinit

    // 🔸 lazy: inicialização sob demanda — executado apenas quando 'b' for usado pela primeira vez
    val b: String by lazy {
        println("Inicializando b...")
        "kotlin lazy"
    }
    println(b) // imprime: Inicializando b... \n kotlin lazy

    // 🔸 Delegates.notNull(): exige inicialização antes de qualquer uso
    // Alternativa ao lateinit para tipos primitivos (não pode usar lateinit com Int, Double, Boolean, etc)
    var c: Int by Delegates.notNull()
    var d: Boolean by Delegates.notNull()
    var e: Double by Delegates.notNull()

    c = 10 // se não fizesse isso antes de usar, daria IllegalStateException
    println(c)
}
}
