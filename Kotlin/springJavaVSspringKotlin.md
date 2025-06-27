# 🔄 Equivalência: Anotações Spring/Java vs Recursos Kotlin

Este guia mostra como as anotações comuns usadas em Java (especialmente com Spring ou Lombok) se traduzem em recursos nativos da linguagem Kotlin.

---

## ✅ 1. `@Override` → `override`

| Java (Spring/POO)        | Kotlin (nativo)     |
|--------------------------|---------------------|
| `@Override`              | `override`          |

```java
@Override
public void run() { }
```

```kotlin
override fun run() { }
```

---

## ✅ 2. `@Final` (implícito em Java) → `open` em Kotlin

| Java                        | Kotlin (por padrão tudo é `final`) |
|----------------------------|-------------------------------------|
| Classe herdável por padrão | Deve usar `open` para permitir herança |

```kotlin
open class Animal
```

---

## ✅ 3. `@Getter`, `@Setter`, `@Data`, `@ToString`, `@EqualsAndHashCode` → `data class`

| Lombok (Java)                        | Kotlin                          |
|-------------------------------------|---------------------------------|
| `@Data`                             | `data class`                    |
| `@Getter`, `@Setter`                | `val`, `var`                    |

```kotlin
data class Usuario(val nome: String, val idade: Int)
```

---

## ✅ 4. `@NoArgsConstructor` / `@AllArgsConstructor` → valores padrão no construtor

| Java (Lombok)                    | Kotlin                                 |
|----------------------------------|----------------------------------------|
| `@NoArgsConstructor`             | Construtor com valores padrão          |
| `@AllArgsConstructor`            | Construtor gerado automaticamente      |

```kotlin
data class Pessoa(val nome: String = "", val idade: Int = 0)
```

---

## ✅ 5. `@Builder` → Named arguments ou DSL

| Java com Lombok                 | Kotlin nativo                          |
|--------------------------------|----------------------------------------|
| `@Builder`                     | Named parameters                       |

```kotlin
val p = Pessoa(nome = "Ana", idade = 28)
```

---

## ✅ 6. `@Slf4j`, `@Log4j2` → Logger nativo ou KotlinLogging

```kotlin
import org.slf4j.LoggerFactory

val log = LoggerFactory.getLogger(javaClass)
```

Ou com a lib KotlinLogging:

```kotlin
import mu.KotlinLogging

private val log = KotlinLogging.logger {}
```

---

## 🧠 Resumo rápido

| Anotação Java / Lombok  | Equivalente Kotlin                     |
|--------------------------|----------------------------------------|
| `@Override`              | `override`                             |
| `@Final` (implícito)     | `open`                                 |
| `@Getter` / `@Setter`    | `val` / `var`                          |
| `@Data`                  | `data class`                           |
| `@NoArgsConstructor`     | Construtor com valores padrão          |
| `@AllArgsConstructor`    | Gerado automaticamente                 |
| `@Builder`               | Named args / DSL / plugins externos    |
| `@Slf4j`, `@Log4j2`      | LoggerFactory / KotlinLogging          |

> ⚠️ Kotlin elimina muito do "boilerplate" de Java com recursos nativos da linguagem.
---

## ✅ 7. `@Component`, `@Service`, `@Repository` → Mesmas anotações em Kotlin

Em Kotlin, essas anotações continuam sendo usadas normalmente com Spring.

```kotlin
import org.springframework.stereotype.Service

@Service
class UsuarioService {
    fun listarUsuarios(): List<String> = listOf("Ana", "João")
}
```

Outros exemplos:

```kotlin
@Component
class MeuComponente

@Repository
class MeuRepositorio
```

---

## ✅ 8. `@Autowired` → Injeção por construtor (sem anotação)

Kotlin incentiva fortemente a **injeção via construtor**, que dispensa o uso de `@Autowired`.

```kotlin
@Service
class ProdutoService(private val produtoRepository: ProdutoRepository) {
    // Spring injeta automaticamente o repositório via construtor
}
```

Se ainda assim quiser usar campo (não recomendado), pode fazer:

```kotlin
@Autowired
lateinit var produtoRepository: ProdutoRepository
```

---

## ✅ 9. `@Transactional` → Igual em Kotlin

A anotação `@Transactional` funciona normalmente em Kotlin:

```kotlin
import org.springframework.transaction.annotation.Transactional

@Service
class CompraService(
    private val pedidoRepository: PedidoRepository
) {

    @Transactional
    fun finalizarCompra(pedidoId: Long) {
        val pedido = pedidoRepository.findById(pedidoId).get()
        pedido.finalizar()
        // transação será commitada se não lançar exceção
    }
}
```

---

## 🧠 Dica extra: Boas práticas com Spring + Kotlin

| Prática recomendada         | Por que?                                       |
|-----------------------------|------------------------------------------------|
| Injeção por construtor      | Mais legível, testável e idiomática            |
| `val` em vez de `var`       | Reflete imutabilidade sempre que possível      |
| Evitar `@Autowired` em campo| Prefira construtores ou `@Configuration`       |
| Evitar Lombok               | Kotlin já cobre quase todas as necessidades    |