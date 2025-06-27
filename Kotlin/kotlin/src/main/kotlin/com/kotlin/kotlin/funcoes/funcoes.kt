package com.kotlin.kotlin.funcoes;

public class funcoes {
   // 🔸 Função Anônima
    fun exemploFuncaoAnonima() {
        var sum = 2 + 2

        // Função anônima que altera a variável 'sum' e retorna a soma de a + b
        val funSum = { a: Int, b: Int ->
            sum = 100
            a + b
        }

        println(funSum(1, 2))
        println("Valor de sum: $sum") // Mostra que foi alterado dentro da função
    }

    // 🔸 Funções de Ordem Superior
    fun exemploOrdemSuperior() {
        fun sum(a: Int, b: Int) = a + b
        fun subtract(a: Int, b: Int) = a - b
        fun multiply(a: Int, b: Int) = a * b

        // Função que recebe outra função como parâmetro
        fun mathOperation(a: Int, b: Int, op: (Int, Int) -> Int): Int {
            return op(a, b)
        }

        val divide = { a: Int, b: Int -> a / b }

        println(mathOperation(10, 5, ::sum))
        println(mathOperation(10, 5, ::subtract))
        println(mathOperation(10, 5, ::multiply))
        println(mathOperation(10, 5, divide))
    }

    // 🔸 Funções de Extensão
    fun exemploFuncoesExtensao() {
        // Função de extensão para verificar palíndromo
        fun String.isPalindrome(): Boolean {
            return this == this.reversed()
        }

        // Função de extensão para formatar Double
        fun Double.format(decimalDigits: Int): String {
            return "%.${decimalDigits}f".format(this)
        }

        println("radar".isPalindrome())     // true
        println("banana".isPalindrome())    // false
        println(3.14159.format(2))          // "3.14"
    }

    // 🔸 Funções Infix
    fun exemploFuncoesInfix() {
        // Infix extension function para somar dois Ints
        infix fun Int.sum(num: Int): Int = this + num

        class XY(val x: Int, val y: Int) {
            // Infix member function para somar dois objetos XY
            infix fun sum(other: XY): XY {
                return XY(this.x + other.x, this.y + other.y)
            }
        }

        println(2 sum 2) // 4

        val xy = XY(3, 2) sum XY(2, 2)
        println("x: ${xy.x}, y: ${xy.y}") // x: 5, y: 4
    }
}
