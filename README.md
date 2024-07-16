# Estrutura Societária

Este projeto é uma aplicação Java de console que calcula o total de bens imóveis de uma empresa,
levando em consideração todos os seus sócios diretos e indiretos, evitando contagem duplicada e ciclos infinitos.

## Requisitos

- Java 17 ou superior
- Maven

## Estrutura do Projeto

estrutura-societaria
│ pom.xml

  └───src

    └───main

      └───java
  
      └───org
  
        └───example
  
          │ Main.java
  
          └───model
  
            │ │ Empresa.java
    
            │ │ Pessoa.java
    
            │ │ PessoaFisica.java
    
            │ │ PessoaJuridica.java
    
          └───utils
  
            │ Validador.java


## Classes

### Pessoa

Classe abstrata base para `PessoaFisica` e `PessoaJuridica` que armazena informações básicas e bens.

### PessoaFisica

Classe que representa uma pessoa física com CPF.

### PessoaJuridica

Classe que representa uma pessoa jurídica com CNPJ.

### Empresa

Classe que representa uma empresa e sua estrutura societária.

### Validador

Classe utilitária para validação de CPF e CNPJ.

### Main

Calcula o total de bens imóveis de uma empresa considerando sua estrutura societária.

## Execução

Para executar o projeto, use a classe "Main"

### Compilar o Projeto

Para compilar o projeto, use o Maven: 

```bash
mvn clean install
