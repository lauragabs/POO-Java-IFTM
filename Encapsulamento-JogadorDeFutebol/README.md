# Atividade de Encapsulamento - Jogador de Futebol

Este projeto contém uma atividade prática de encapsulamento em Java, onde foram implementadas duas classes: `JogadorDeFutebol` e `App`. O objetivo é gerenciar informações sobre um jogador de futebol e calcular o tempo até a sua aposentadoria, de acordo com a posição que ocupa no campo.

## Estrutura do Projeto

O projeto é composto por duas classes principais:

- **`JogadorDeFutebol`**: Representa o jogador, contendo atributos como nome, data de nascimento, altura, peso, nacionalidade e posição. Esta classe também possui métodos para calcular a idade e exibir os dados do jogador.
- **`App`**: Classe principal que utiliza a `JogadorDeFutebol` para coletar informações do usuário, calcular o tempo até a aposentadoria do jogador e exibir todas as informações coletadas.

## Funcionalidades

### 1. Classe `JogadorDeFutebol`
- **Atributos**:
  - `nome` (privado)
  - `anoNascimento`
  - `altura`
  - `peso`
  - `nacionalidade`
  - `posicao`

- **Métodos**:
  - `calcularIdade()`: Calcula a idade do jogador com base no ano de nascimento.
  - `exibeDados()`: Exibe todos os dados do jogador no formato:
    ```
    Nome: Fulano
    Ano de Nascimento: xxxx
    Altura: 1,80 m
    Peso: 85,0 kg
    Nacionalidade: Brasileiro
    Posição: Meio de Campo
    ```

### 2. Classe `App`
- **Métodos**:
  - `leDados()`: Coleta as informações do jogador, como nome, ano de nascimento, altura, peso, nacionalidade e posição.
  - `calculaAposentadoria()`: Calcula o tempo até a aposentadoria do jogador de acordo com a sua posição:
    - **Atacante**: Aposenta aos 35 anos.
    - **Defesa**: Aposenta aos 40 anos.
    - **Meio de Campo**: Aposenta aos 38 anos.
    
    Retorna uma String informando quantos anos faltam para o jogador se aposentar ou se ele já está aposentado.

## Como Executar o Programa

1. Compile as classes `App` e `JogadorDeFutebol`.
2. Execute a classe `App`, que solicitará as informações do jogador e exibirá:
   - Todos os dados do jogador.
   - O cálculo do tempo até a aposentadoria.

