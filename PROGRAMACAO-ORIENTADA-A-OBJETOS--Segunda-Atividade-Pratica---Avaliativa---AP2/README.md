# Sistema de Gerenciamento de Veículos

Este projeto é uma atividade avaliativa sobre **Programação Orientada a Objetos (POO)** em Java.  
O objetivo é aplicar os conceitos de **herança**, **classes abstratas** e **métodos de acesso**.

---

## 🧱 Estrutura do Projeto

```
/src
 ├── Veiculo.java
 ├── Carro.java
 ├── Moto.java
 └── Main.java
```

---

## ⚙️ Execução

1. Compile os arquivos:
   ```bash
   javac src/*.java
   ```

2. Execute o programa:
   ```bash
   java src/Main
   ```

---

## 📄 Descrição das Classes

- **Veiculo** → Classe abstrata base.
- **Carro** → Herda de Veiculo e adiciona `numeroPortas`.
- **Moto** → Herda de Veiculo e adiciona `cilindrada`.
- **Main** → Cria instâncias e exibe informações.

---

## 🧠 Conceitos Utilizados

- **Herança**
- **Encapsulamento**
- **Classes abstratas**
- **Métodos de acesso (get/set)**

---

## 🧾 Exemplo de Saída

```
Carro: Toyota Corolla (2022), 4 portas.
Moto: Honda CB 500 (2021), 500 cilindradas.
```
