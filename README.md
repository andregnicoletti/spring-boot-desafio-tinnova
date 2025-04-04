# 🧪 Avaliação Técnica - Tinnova

Este projeto contém a resolução das questões propostas na avaliação técnica da Tinnova, utilizando **Java 17** e **Spring Boot 3.4.4**.

---

## 📁 Estrutura do Projeto

```bash
src/
└── main/
    └── java/
        └── com/
            └── tinnova/
                └── avaliacao/
                    ├── AvaliacaoApplication.java
                    ├── question1/
                    │   └── Question1.java
                    ├── question2/
                    │   └── Question2.java
                    └── question3/
                        └── Question3.java
└── test/
    └── java/
        └── com/
            └── tinnova/
                └── avaliacao/
                    ├── question1/
                    │   └── Question1Test.java
                    ├── question2/
                    │   └── Question2Test.java
                    └── question3/
                        └── Question3Test.java
```

---

## ✅ Questão 1 – Cálculo de Percentual de Votos

> Calcular o percentual de votos válidos, brancos e nulos com base no total de eleitores.

A classe `Question1` realiza esse cálculo com base em valores fixos.  
Ela fornece métodos para cada tipo de voto e também possui um `main` que imprime os percentuais.

### 🔍 Testes

```bash
./mvnw test
```

Resultado esperado:

```
[INFO] Tests run: 3, Failures: 0, Errors: 0, Skipped: 0
```

### ▶️ Execução manual

```bash
./mvnw compile exec:java -Dexec.mainClass="com.tinnova.avaliacao.question1.Question1"
```

---

## ✅ Questão 2 – Ordenação com Bubble Sort

> Implementar o algoritmo de ordenação Bubble Sort.

A classe `Question2` contém:
- Um array estático `ORIGINAL_ARRAY`
- O método `bubbleSort()` que ordena esse array
- Um `main()` que exibe o array original e o ordenado

### 🔍 Testes

```bash
./mvnw test
```

Resultado esperado:

```
[INFO] Tests run: 4, Failures: 0, Errors: 0, Skipped: 0
```

### ▶️ Execução manual

```bash
./mvnw compile exec:java -Dexec.mainClass="com.tinnova.avaliacao.question2.Question2"
```

Saída esperada:

```
Original array: [5, 3, 2, 4, 7, 1, 0, 6]
Ordered array:  [0, 1, 2, 3, 4, 5, 6, 7]
```

---

## ✅ Questão 3 – Cálculo de Fatorial

> Implementar o cálculo de fatorial de um número inteiro.

A classe `Question3` fornece:
- O método `factorial(long number)` que retorna o fatorial de um número
- Um método `main()` que recebe um número por argumento de linha de comando (opcional)

### 🔍 Testes

```bash
./mvnw test
```

Resultados esperados:
- `factorial(4)` → `24`
- `factorial(5)` → `120`
- `factorial(6)` → `720`

### ▶️ Execução manual

```bash
./mvnw compile exec:java -Dexec.mainClass="com.tinnova.avaliacao.question3.Question3" -Dexec.args="5"
```

Saída esperada:

```
Fatorial of : 5!
Result: 120
```
---

## ✅ Questão 4 – Soma dos múltiplos de 3 ou 5

> Calcular a soma de todos os múltiplos de 3 ou 5 abaixo de um número informado.

A classe `Question4` fornece:
- Um método `sumOfMultiplesOf3Or5(long number)` que retorna a soma dos múltiplos
- Um método `main()` que aceita um argumento para informar o número limite

### 🔍 Testes

```bash
./mvnw test
```

Teste incluído:
- `sumOfMultiplesOf3Or5(10)` → `23` (múltiplos: 3, 5, 6, 9)

### ▶️ Execução manual

```bash
./mvnw compile exec:java -Dexec.mainClass="com.tinnova.avaliacao.question4.Question4" -Dexec.args="10"
```

Saída esperada:

```
Input number: 10
Sum of multiples of 3 or 5: 23
```

---

## 💡 Tecnologias utilizadas

- Java 17
- Spring Boot 3.4.4
- Maven
- JUnit 5

---

## 📬 Contato

- Email: andregnicoletti@gmail.com
- LinkedIn: https://www.linkedin.com/in/andre-nicoletti