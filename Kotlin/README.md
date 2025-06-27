
# Kotlin

Kotlin é uma linguagem de programação moderna, **concisa**, **segura** e **interoperável com Java**. Ela roda na **JVM (Java Virtual Machine)** e é **open source**, sendo uma excelente opção para desenvolvimento Android e outras aplicações multiplataforma.
## 📚 Índice

- [🚀 Principais Vantagens](#-principais-vantagens)
- [📊 Comparativo Kotlin vs Java](#-comparativo-kotlin-vs-java)
- [✍️ Declaração de Variáveis em Kotlin](#️-declaração-de-variáveis-em-kotlin)
- [🔢 Exemplos de Tipos de Dados em Kotlin](#-exemplos-de-tipos-de-dados-em-kotlin)
- [🔧 Funções em Kotlin](#-funções-em-kotlin)
- [🧱 Classes em Kotlin](#-classes-em-kotlin)
- [🔤 Conceitos Básicos do Kotlin](#-conceitos-básicos-do-kotlin)
  - [1. Mutabilidade e Imutabilidade](#1-mutabilidade-e-imutabilidade)
  - [2. Tipos de Dados](#2-tipos-de-dados)
  - [3. Operadores Lógicos e de Comparação](#3-operadores-lógicos-e-de-comparação)
  - [4. Estruturas Condicionais](#4-estruturas-condicionais)
  - [5. Null Safety](#5-null-safety)
  - [6- Lazy, lateinit e delegates](#6--lazy-lateinit-e-delegates)
  - [7- Arrays e Listas](#7--arrays-e-listas)
  - [8- Sets e Maps](#8--sets-e-maps)
  - [9 - Laços de Repetição](#9---laços-de-repetição)
  - [10 - Funções em Kotlin (Avançado)](#10---funções-em-kotlin-avançado)
- [11 - Classes em Kotlin (Avançado)](#11---classes-em-kotlin-avançado)
    - [🔹 Criando Classes](#-criando-classes)
    - [🔹 Buscas e Atribuições Personalizadas](#-buscas-e-atribuições-personalizadas)
    - [🔹 Objetos Complementares (companion object)](#-objetos-complementares-companion-object)
    - [🔹 Classes Abertas e Herança](#-classes-abertas-e-herança)
    - [🔹 Classes de Dados (data class)](#-classes-de-dados-data-class)

    
## Principais Vantagens  

- ✅ **Interoperabilidade com Java**
- ✅ **Código conciso e expressivo**
- ✅ **Segurança contra nulidade** (null safety)
- ✅ **Open Source**
- ✅ **Ideal para desenvolvimento Android**

---

## 📊 Comparativo Kotlin vs Java

| Características            | Java                                    | Kotlin                                  |
|---------------------------|-----------------------------------------|------------------------------------------|
| Orientado a objetos       | ✅                                       | ✅ + suporte a **programação funcional** |
| NullPointerExceptions     | ✅ Propenso                              | ❌ Mais seguro com **null safety**       |
| Casting                   | Manual                                   | ✅ **Smart casts**                       |
| Data classes              | Manual (campos/classe)                   | ✅ Palavra-chave **`data`**             |
| Múltiplas threads         | Complexo                                 | ✅ **Corrotinas simples**               |
| Desenvolvimento Android   | ✅                                       | ✅ **Muito mais fácil**                 |

---

## Declaração de Variáveis em Kotlin

Kotlin possui duas formas principais de declarar variáveis:

- `val`: para valores **imutáveis** (constantes).
- `var`: para valores **mutáveis** (que podem ser alterados).

Além disso, **o tipo da variável é inferido automaticamente**, não sendo necessário especificá-lo.

### Exemplo:

```kotlin
val nome = "João"   // tipo inferido como String (não pode ser alterado depois)
var idade = 25      // tipo inferido como Int (pode ser alterado)
```

> Também é possível declarar explicitamente o tipo:

```kotlin
val nome: String = "João"
var idade: Int = 25
```

---

## 🔢 Exemplos de Tipos de Dados em Kotlin

```kotlin
fun main() {
    // numéricos
    val byte: Byte = -128
    val short: Short = 32_767
    val int: Int = 1_000_000
    val long: Long = 3182983192819213

    val float: Float = 3f
    val double: Double = 3.0

    // texto
    val char: Char = 'a'
    val string: String = "palavra"

    // boolean
    val boolean: Boolean = true
}
```

---

## 🔧 Funções em Kotlin

Em Kotlin, as funções são declaradas com a palavra-chave `fun`:

```kotlin
fun saudacao(nome: String): String {
    return "Olá, $nome!"
}
```

Funções também podem ter **corpos de expressão** para serem mais concisas:

```kotlin
fun dobro(x: Int) = x * 2
```

---

## 🧱 Classes em Kotlin

Declaração de uma classe simples com construtor primário:

```kotlin
class Pessoa(val nome: String, var idade: Int)

val pessoa = Pessoa("Maria", 30)
```

Também podemos utilizar classes `data` para representar dados:

```kotlin
data class Usuario(val id: Int, val nome: String)
```

---



## 🔤 Conceitos Básicos do Kotlin

### 1. Mutabilidade e Imutabilidade

Kotlin enfatiza a diferença entre variáveis mutáveis (`var`) e imutáveis (`val`), tornando o código mais seguro e previsível.

```kotlin
val linguagem = "Kotlin" // não pode ser reatribuída
var ano = 2025           // pode ser reatribuído
ano = 2026
```

> Em Java, o uso de `final` para imutabilidade é opcional e menos incentivado.

---

### 2. Tipos de Dados

Kotlin possui uma tipagem forte com suporte a inferência automática.

```kotlin
val numeroInteiro = 100           // Int
val numeroDecimal = 10.5          // Double
val caractere = 'A'               // Char
val texto = "Olá, Kotlin!"        // String
val booleano = true               // Boolean
```

> Diferente do Java, Kotlin não faz casting automático entre tipos numéricos. Você deve usar `toInt()`, `toDouble()` etc.

---


### 3. Operadores Lógicos e de Comparação

Kotlin utiliza os mesmos operadores lógicos básicos do Java, mas também possui operadores adicionais e mais expressivos.

#### ✅ Operadores Lógicos Básicos

```kotlin
val a = true
val b = false

println(a && b) // false
println(a || b) // true
println(!a)     // false
```

#### ❗ Operador "NÃO" (`!`)

Inverte o valor booleano:

```kotlin
val e = true
val f = !e
println("Operador NÃO:")
println(f) // false
```

---

#### 🔁 Operadores de Igualdade e Diferença

```kotlin
val num1 = 10
val num2 = 5

println("Operador IGUAL A e DIFERENTE DE:")
println(num1 == num2)   // false
println(num1 != num2)   // true
```

---

#### 🧠 Operadores de Tipo (`is` e `!is`)

Verificam se uma variável é (ou não é) de um tipo específico.

```kotlin
val num: Any = 1
val numText: Any = "1"

println("Operadores É DO TIPO:")
println(num is String)       // false
println(numText is String)   // true

println("Operadores NÃO É DO TIPO:")
println(num !is String)      // true
println(numText !is String)  // false
```

---

#### 📦 Operadores de Inclusão (`in` e `!in`)

Verificam se um valor está ou não dentro de um intervalo ou coleção.

```kotlin
val range = 1..10
val x = 5
val y = 15

println("Operadores PERTENCE:")
println(x in range)  // true
println(y in range)  // false

println("Operadores NÃO PERTENCE:")
println(x !in range) // false
println(y !in range) // true
```

Esses operadores tornam o código mais legível e seguro, sendo amplamente utilizados com `if`, `when`, e validações de tipo.


### 4. Estruturas Condicionais

#### `if` como expressão:

```kotlin
val idade = 18
val status = if (idade >= 18) "Adulto" else "Menor"
```

#### `when` como substituto do `switch`:

```kotlin
val nota = 8
val resultado = when {
    nota >= 7 -> "Aprovado"
    nota >= 5 -> "Recuperação"
    else -> "Reprovado"
}
```

> Kotlin torna o controle de fluxo mais poderoso e conciso.

---

### 5. Null Safety

Kotlin foi criado para reduzir `NullPointerException`.

```kotlin
val nome: String? = null
println(nome?.length) // chamada segura
```

#### Not null assertion:
```kotlin
val nome: String? = "João"
println(nome!!.length) // força que não é nulo (pode lançar exceção)
```

#### `let` com safe call:
```kotlin
nome?.let {
    println("Nome com valor: $it")
}
```

> Java precisa de `if (obj != null)` ou usar `Optional`.

---

---

### 6- Lazy, lateinit e delegates

#### 🔹 `lateinit`

```kotlin
lateinit var a: String
a = "valor atribuído depois"
println(a)
```

#### 🔹 `lazy`

```kotlin
val nome by lazy {
    println("Inicializando nome...")
    "Kotlin Lazy"
}
println(nome)
```

#### 🔹 `Delegates.notNull()`

```kotlin
import kotlin.properties.Delegates

var idade: Int by Delegates.notNull()
idade = 25
println(idade)
```

#### 🔹 `Delegates.observable`

```kotlin
var nome: String by Delegates.observable("Desconhecido") { prop, old, new ->
    println("Alterado de $old para $new")
}
nome = "Jhonathan"
```

#### 🔹 `Delegates.vetoable`

```kotlin
var idade: Int by Delegates.vetoable(0) { _, _, new ->
    new >= 18
}
idade = 16 // ignorado
idade = 20 // aceito
```

---

### 7- Arrays e Listas

Kotlin oferece tanto `Array` quanto `List` para representar coleções de elementos. A escolha entre eles depende de mutabilidade e necessidade de métodos utilitários.

---

#### 🔹 Array

- Estrutura de **tamanho fixo**.
- Pode ser mutável (os elementos podem ser alterados).
- Usado para armazenar elementos do mesmo tipo.
- Criado com `arrayOf()` ou `Array()`.

```kotlin
val numeros: Array<Int> = arrayOf(1, 2, 3)
numeros[0] = 10
println(numeros.joinToString()) // 10, 2, 3
```

---

#### 🔹 List (Imutável)

- Lista **imutável** por padrão (não pode adicionar/remover itens).
- Criada com `listOf()`.

```kotlin
val nomes = listOf("Ana", "Pedro", "Lucas")
println(nomes[1]) // Pedro
```

---

#### 🔹 MutableList

- Versão **mutável** da lista.
- Permite usar `.add()`, `.remove()`, `.clear()`, etc.
- Criada com `mutableListOf()`.

```kotlin
val frutas = mutableListOf("Banana", "Maçã")
frutas.add("Pera")
println(frutas) // [Banana, Maçã, Pera]
```

---

#### 🧠 Principais diferenças

| Característica     | Array                 | List                      | MutableList              |
|--------------------|-----------------------|---------------------------|---------------------------|
| Tamanho fixo       | ✅ Sim                | ❌ Não                    | ❌ Não                    |
| Mutabilidade       | ✅ Elementos mutáveis | ❌ Imutável               | ✅ Mutável                |
| Métodos avançados  | ❌ Poucos             | ✅ Muitos (`filter`, etc) | ✅ Muitos                 |
| Uso comum          | Baixo nível           | Alto nível / segurança    | Listas dinâmicas          |

> Prefira `List`/`MutableList` para código Kotlin idiomático.

---
### 8- Sets e Maps

Kotlin oferece `Set` e `Map` como parte da sua API de coleções. Eles são usados para armazenar dados **não duplicados** (Set) e **chave-valor** (Map).

---

#### 🔸 Set

- Um `Set` é uma coleção **sem elementos duplicados**.
- A ordem dos elementos **não é garantida**.
- Criado com `setOf()` (imutável) ou `mutableSetOf()` (mutável).

```kotlin
val set = setOf(1, 2, 3, 2) // [1, 2, 3]
val mutableSet = mutableSetOf(1, 2, 3)
mutableSet.add(4)
mutableSet.remove(2)
```

---

#### 🔸 HashSet

- Implementação eficiente de `Set` baseada em hashing.
- Usado com `hashSetOf()`.

```kotlin
val hash = hashSetOf("A", "B", "C", "A") // [A, B, C]
```

---

#### 🔸 Map

- Estrutura de dados que armazena **pares chave-valor**.
- Criado com `mapOf()` (imutável) ou `mutableMapOf()` (mutável).

```kotlin
val map = mapOf(1 to "um", 2 to "dois")

val mutableMap = mutableMapOf(
    1 to "Kotlin",
    "linguagem" to 2025,
    1.5f to true
)
mutableMap[3] = "Novo valor"
```

---

#### 🔸 HashMap

- Implementação eficiente de `Map` com inserções rápidas.
- Criado com `hashMapOf()`.

```kotlin
val hashMap = hashMapOf(1 to "a", 2 to "b")
```

---

#### 🧠 Principais diferenças

| Estrutura | Imutável por padrão? | Permite duplicados? | Mutável com `mutableSetOf`/`mutableMapOf` |
|-----------|-----------------------|----------------------|-------------------------------------------|
| Set       | ✅                   | ❌                   | ✅                                         |
| Map       | ✅                   | ❌ (chaves únicas)    | ✅                                         |

> Use `Set` para listas únicas e `Map` para relacionar dados com chaves.

---


### 9 - Laços de Repetição

Kotlin oferece diversas formas de percorrer coleções e repetir blocos de código com eficiência e clareza. Os principais laços são `for`, `while`, `do/while`, além de recursos como `repeat` e laços aninhados com controle de fluxo (`break`, `continue` e `labels`).

---

#### 🔸 For

- Percorre elementos de uma coleção de forma simples.
- Pode ser usado com `in`, `withIndex()`, `forEach`, `forEachIndexed`.

```kotlin
val lista = listOf("A", "B", "C")

for (item in lista) {
    println(item)
}

lista.forEach { println(it) }

lista.forEachIndexed { index, item ->
    println("Index $index: $item")
}

for ((index, item) in lista.withIndex()) {
    if (index == 1) continue
    println("Index $index: $item")
}
```

---

#### 🔸 While

- Executa um bloco de código **enquanto** a condição for verdadeira.

```kotlin
var i = 1
while (i <= 3) {
    println(i)
    i++
}
```

---

#### 🔸 Do / While

- Garante que o bloco será executado **ao menos uma vez**.

```kotlin
var j = 1
do {
    println(j)
    j++
} while (j <= 3)
```

---

#### 🔸 Laços aninhados com label

- Permite interromper o laço **externo** usando `break@label`.

```kotlin
loop@ for (i in 1..3) {
    for (j in 1..3) {
        if (i == 2 && j == 2) break@loop
        println("i = $i | j = $j")
    }
}
```

---

#### 🔸 Repeat

- Repete um bloco de código um número fixo de vezes.

```kotlin
repeat(5) {
    println("Executando $it")
}
```

---

#### 🧠 Dicas importantes

| Laço        | Executa ao menos uma vez? | Usa índice? | Ideal para...             |
|-------------|----------------------------|-------------|----------------------------|
| `for`       | ❌                         | ✅           | Coleções e ranges         |
| `while`     | ❌                         | ✅           | Condições variáveis       |
| `do/while`  | ✅                         | ✅           | Quando precisa executar 1x |
| `repeat`    | ❌                         | ✅ (`it`)    | Execução fixa             |

> Use `for` para listas, `while` para condições, `do/while` para garantir execução e `repeat` para repetições simples.

---
### 10 - Funções em Kotlin (Avançado)

Kotlin oferece uma abordagem moderna e poderosa para declarar e usar funções, incluindo suporte nativo para funções anônimas, de ordem superior, extensões e infix.

---

#### 🔹 Funções Anônimas

São funções **sem nome explícito**, atribuídas geralmente a variáveis. Podem ser usadas diretamente como expressões.

```kotlin
fun main() {
    var sum = 2 + 2

    val funSum = { a: Int, b: Int ->
        sum = 100
        a + b
    }

    println(funSum(1, 2))  // imprime 3
    println(sum)           // imprime 100
}
```

---

#### 🔹 Funções de Ordem Superior

São funções que **recebem ou retornam outras funções**. Ideais para implementar lógica reutilizável.

```kotlin
fun sum(a: Int, b: Int) = a + b
fun subtract(a: Int, b: Int) = a - b
fun multiply(a: Int, b: Int) = a * b

fun mathOperation(a: Int, b: Int, op: (Int, Int) -> Int): Int {
    return op(a, b)
}

fun main() {
    val divide = { a: Int, b: Int -> a / b }

    println(mathOperation(10, 5, ::sum))       // 15
    println(mathOperation(10, 5, ::subtract))  // 5
    println(mathOperation(10, 5, ::multiply))  // 50
    println(mathOperation(10, 5, divide))      // 2
}
```

---

#### 🔹 Funções de Extensão

Permitem **adicionar funcionalidades a tipos existentes** sem modificá-los diretamente.

```kotlin
fun String.isPalindrome(): Boolean {
    return this == this.reversed()
}

fun Double.format(decimalDigits: Int): String {
    return "%.${decimalDigits}f".format(this)
}

fun main() {
    println("radar".isPalindrome())     // true
    println("banana".isPalindrome())    // false
    println(3.14159.format(2))          // "3.14"
}
```

---

#### 🔹 Funções Infix

Permitem usar chamadas de função como **operações naturais**, sem parênteses ou ponto.

```kotlin
infix fun Int.sum(num: Int): Int = this + num

class XY(val x: Int, val y: Int) {
    infix fun sum(other: XY): XY {
        return XY(this.x + other.x, this.y + other.y)
    }
}

fun main() {
    println(2 sum 2) // 4

    val xy = XY(3, 2) sum XY(2, 2)
    println("x: ${xy.x}, y: ${xy.y}") // x: 5, y: 4
}
```

---

### 🧠 Resumo Rápido

| Tipo de Função     | Descrição                                       | Exemplo                          |
|--------------------|--------------------------------------------------|----------------------------------|
| Anônima            | Sem nome, atribuída a uma variável               | `{ a, b -> a + b }`              |
| Ordem Superior     | Recebe/retorna outra função                      | `mathOperation(a, b, ::soma)`    |
| Extensão           | Adiciona funções a tipos existentes              | `"texto".isPalindrome()`         |
| Infix              | Chamadas de função mais naturais/sintéticas      | `2 sum 2`                        |
---


## 11 - Criando Classes

Kotlin permite a criação de classes com construtores simples, propriedades e lógica encapsulada.

---

#### 🔹 Declaração Básica

```kotlin
class Person(val name: String = "Desconhecido", lastName: String, val age: Int = 0) {

    val fullName: String = "$name $lastName"

    private val password: String = name + Random.nextInt(100)

    private fun usePassword() {
        println(password)
    }

    fun work() {
        usePassword()
        println("$name, $age trabalhando...")
    }
}

fun main() {
    val jose = Person(name = "José", lastName = "Silva", age = 20)
    val maria = Person(name = "Maria", lastName = "Rodrigues")

    jose.work()
    maria.work()
    println(jose.fullName)
}
```

---

### 12 - Buscas e Atribuições Personalizadas

Kotlin permite personalizar o comportamento de leitura (`get`) e escrita (`set`) de propriedades.

```kotlin
class Person(val name: String) {

    var age: Int = 0
        set(value) {
            if (value >= 0) field = value
            else println("Idade não pode ser negativa")
        }

    var height: Double = 0.0
        get() = Math.ceil(field)
}
```

---

### 13 - Objetos Complementares

Objetos `companion object` permitem declarar membros que pertencem à classe, como se fossem `static`.

```kotlin
class Person {
    companion object {
        const val KEY = "12345678"
        private val KEY_2 = "1234567890"

        fun getKey(): String {
            return KEY + KEY_2
        }
    }
}
```

---

### 14 - Classes Abertas

Classes podem ser estendidas usando `open`, e membros também devem ser `open` para sobrescrita.

```kotlin
open class Animal(val name: String) {
    open val age: Int = 0

    open fun sound() {
        println("$name: som")
    }
}

class Dog(override val age: Int) : Animal(name = "Cachorro") {
    override fun sound() {
        println("$name: AU!")
    }
}
```

---

### 15 - Classes de Dados

Data classes são ideais para representar dados imutáveis e já trazem `equals`, `toString`, `copy` e destructuring.

```kotlin
data class UserDataClass(val name: String, val age: Int)

fun main() {
    val jose = UserDataClass("José", 30)
    val maria = UserDataClass("Maria", 40)

    val copyMaria = maria.copy(age = 50)
    println(copyMaria)

    val (name, age) = jose
    println(name)
    println(age)
}
```

---