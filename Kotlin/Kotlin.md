
# Kotlin

Kotlin é uma linguagem de programação moderna, **concisa**, **segura** e **interoperável com Java**. Ela roda na **JVM (Java Virtual Machine)** e é **open source**, sendo uma excelente opção para desenvolvimento Android e outras aplicações multiplataforma.

## 🚀 Principais Vantagens

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

## ✍️ Declaração de Variáveis em Kotlin

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
