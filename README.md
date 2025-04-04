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
                    └── question1/
                        └── Question1.java
└── test/
    └── java/
        └── com/
            └── tinnova/
                └── avaliacao/
                    └── question1/
                        └── Question1Test.java
```

---

## ✅ Questão 1 – Cálculo de Percentual de Votos

> Calcular o percentual de votos válidos, brancos e nulos com base no total de eleitores.

### 📌 Lógica:
A classe `Question1` calcula os percentuais utilizando valores fixos e expõe três métodos:
- `percentValidVotes()`
- `percentBlankVotes()`
- `percentNullVotes()`

Também possui um método `main()` com saída direta no terminal para facilitar a execução.

Estes métodos são testados com **JUnit 5** na classe `Question1Test`.

---

## 🚀 Como executar a Questão 1

### 🧪 Executar testes unitários (recomendado)

Execute os testes com:

```bash
./mvnw test
```

Você verá uma saída semelhante a:

```
[INFO] Tests run: 3, Failures: 0, Errors: 0, Skipped: 0
```

Isso confirma que:
- Votos válidos = 80%
- Votos brancos = 15%
- Votos nulos = 5%

---

### ▶️ Executar pelo `main` (alternativa direta)

A classe `Question1` possui um método `main()` que imprime os percentuais diretamente no terminal.  
Para executar:

```bash
./mvnw compile exec:java -Dexec.mainClass="com.tinnova.avaliacao.question1.Question1"
```

---

## 💡 Tecnologias utilizadas

- Java 17
- Spring Boot 3.4.4
- Maven

---

## 📬 Contato

- Email: andregnicoletti@gmail.com
- LinkedIn: https://www.linkedin.com/in/andre-nicoletti