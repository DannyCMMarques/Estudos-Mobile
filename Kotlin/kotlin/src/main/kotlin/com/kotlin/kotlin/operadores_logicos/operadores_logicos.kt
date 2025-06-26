

fun operadores() {

    val a = true
    val b = false

    val c = true

    // operador E (&&)

    val result = a && b
    val result2 = a && c

    println(result)
    println(result2)

    // operador OU (||)

    val result3 = a || b
    val result4 = a || c

    println(result3)
    println(result4)

    // operador NÃO (!)

    val e = true
    val f = !e //false

    println("Operador NÃO:")
    println(f)

    val num1 = 10
    val num2 = 5

    println("Operador IGUAL A e DIFERENTE DE:")

    // operador de igualdade (==)
    println(num1 == num2)
    //operador DESIGUALDADE, DIFERENTE DE (!=)
    println(num2 != num1)

    // operadores É DO TIPO e NÃO É DO TIPO (is e !is)

    val num: Any = 1
    val numText: Any = "1"

    println("Operadores É DO TIPO:")
    println(num is String)
    println(numText is String)

    println("Operadores NÃO É DO TIPO:")
    println(num !is String)
    println(numText !is String)

    // operadores PERTENCE e NÃO PERTENCE (in e !in)

    val range = 1..10
    val x = 5
    val y = 15

    println("Operadores PERTENCE:")
    println(x in range)
    println(y in range)

    println("Operadores NÃo PERTENCE:")
    println(x !in range)
    println(y !in range)

}