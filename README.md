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
                    └── question2/
                        └── Question2.java
└── test/
    └── java/
        └── com/
            └── tinnova/
                └── avaliacao/
                    ├── question1/
                    │   └── Question1Test.java
                    └── question2/
                        └── Question2Test.java
```

---

## ✅ Questão 1 – Cálculo de Percentual de Votos

> Calcular o percentual de votos válidos, brancos e nulos com base no total de eleitores.

A classe `Question1` realiza esse cálculo com base em valores fixos.  
Ela fornece métodos para cada tipo de voto e também possui um `main` que imprime os percentuais.

### 🔍 Testes

Executar:

```bash
./mvnw test
```

Resultado esperado:

```
[INFO] Tests run: 3, Failures: 0, Errors: 0, Skipped: 0
```

### ▶️ Executar com `main`

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

A classe `Question2Test` compara o array ordenado com o resultado esperado:

```bash
./mvnw test
```

Resultado esperado:

```
[INFO] Tests run: 4, Failures: 0, Errors: 0, Skipped: 0
```

### ▶️ Executar com `main`

```bash
./mvnw compile exec:java -Dexec.mainClass="com.tinnova.avaliacao.question2.Question2"
```

Saída esperada:

```
Original array: [5, 3, 2, 4, 7, 1, 0, 6]
Ordered array:  [0, 1, 2, 3, 4, 5, 6, 7]
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