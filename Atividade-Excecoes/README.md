# Validação de Usuário, Senha, Nome e Telefone em Java

Este é um programa em Java que implementa a validação de login, nome e telefone utilizando conceitos de Programação Orientada a Objetos (POO). O código é dividido em múltiplas classes para garantir organização, reutilização e separação de responsabilidades.

## Funcionalidades

1. Validação de Login:
    - O usuário deve fornecer um nome de usuário e uma senha válidos para prosseguir.
    - Caso o login seja inválido, uma exceção personalizada é lançada.

2. Cadastro de Pessoa:
    - O usuário fornece o nome e o telefone da pessoa.
    - O nome deve conter apenas letras (com suporte a acentos e espaços).
    - O telefone deve conter apenas números e ter 10 ou 11 dígitos.
    - Exceções personalizadas são lançadas caso as entradas sejam inválidas.

3. Exibição de Dados:
    - Após validações bem-sucedidas, o programa exibe o nome e o telefone cadastrados.

## Estrutura do Projeto

O projeto é composto pelas seguintes classes:

### 1. Classe `Validacao`

Esta classe herda de Exception e é usada para criar exceções personalizadas com mensagens de erro.

**Exemplo:**

```java
throw new Validacao("Mensagem de erro personalizada");
```

### 2. Classe `Login`

Representa a funcionalidade de validação de credenciais de login.

- Método `validarCredenciais(String usuario, String senha)`:
    - Valida o usuário e a senha com base em valores predefinidos.
    - Lança uma exceção Validacao caso as credenciais estejam incorretas.

### 3. Classe `Pessoa`

Representa os dados de uma pessoa (nome e telefone) e inclui as validações necessárias para essas informações.

- Validação de Nome:
    - O nome deve conter apenas letras (a-z, A-Z), espaços e caracteres acentuados.
    - Expressão regular usada: `[a-zA-ZáéíóúÁÉÍÓÚãõçÃÕÇâêîôûÂÊÎÔÛ ]+`

- Validação de Telefone:
    - O telefone deve conter apenas números e ter 10 ou 11 dígitos.
    - Expressão regular usada: `\d{10,11}`

- Métodos:
    - `setNome(String nome)` e `setTelefone(String telefone)` para validação e definição dos valores.
    - `getNome()` e `getTelefone()` para acesso aos valores.

### 4. Classe `App`

A classe principal que gerencia o fluxo do programa:

1. Solicita o usuário e a senha.
2. Valida as credenciais com a classe Login.
3. Solicita o nome e o telefone da pessoa.
4. Valida os dados com a classe Pessoa.
5. Exibe as informações da pessoa cadastrada ou mostra mensagens de erro em caso de entradas inválidas.

## Requisitos para Execução

- Java Development Kit (JDK): Versão 8 ou superior.

- Um editor ou IDE como Eclipse, IntelliJ IDEA ou VS Code.
