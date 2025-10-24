# Sistema de Gestão Simples (Funcionários e Idosos)

Projeto inicial em Java para gerenciar, via console, registros de funcionários e idosos. Feito como exercício prático para aprender programação orientada a objetos, coleções e entrada/saída em Java.

---

## Tecnologias usadas
- Linguagem: Java (JDK)
- Bibliotecas da JDK: java.util.ArrayList, java.util.Scanner
- Entrada/Saída: System.out / Scanner
- Pacotes do projeto: App, Entidades

> Observação: este projeto não usa frameworks externos, bibliotecas de build (Maven/Gradle) nem bibliotecas de terceiros — é um projeto simples em Java puro.

---

## Estrutura do projeto (exemplo)
- src/
  - App/
    - Main.java — classe com menu e ponto de entrada
  - Entidades/
    - Funcionario.java
    - Idoso.java
    - GestorFuncionarios.java

---

## Como compilar e executar (linha de comando)
1. Navegue até a raiz do projeto.
2. Compile:
   - javac -d out src/Entidades/*.java src/App/*.java
3. Execute:
   - java -cp out App.Main

---

## Futuras atualizações (visão curta)
Este é o início do projeto — futuras atualizações previstas (resumido):
- Melhorias no gestor (CRUD completo: editar, remover, buscar).
- Validações de entrada (idade, CPF, campos obrigatórios).
- Persistência de dados (salvar/carregar em arquivo).
- Testes básicos (JUnit) e organização do projeto.
- Possível interface mais amigável no futuro (CLI aprimorada ou UI).

---

## Boas práticas sugeridas
- Padronizar nomes: classes em PascalCase e métodos/variáveis em camelCase.
- Usar Git com commits pequenos e branches por feature.
- Documentar métodos importantes com comentários / Javadoc.

---
