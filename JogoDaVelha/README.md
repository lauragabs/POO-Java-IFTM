# Jogo da Velha - Java

Este projeto implementa o clássico **Jogo da Velha** para dois jogadores em Java. A implementação usa uma matriz 3x3 para representar o tabuleiro do jogo e permite que os jogadores façam suas jogadas alternadamente.

## Funcionalidades

O programa possui as seguintes funções principais:

1. **Interface do Jogo** (`int interface(int jogadas)`)
    - Exibe o estado atual do tabuleiro antes de cada jogada.
    - Mostra qual é o jogador da vez.
    - Permite a leitura da jogada que será feita.


2. **Validação de Jogada** (`boolean validacao(int posicao)`)
    - Verifica se a jogada escolhida pelo jogador é válida (se a posição está disponível e corresponde a um número de 1 a 9).
    - Retorna `true` se for válida, ou `false` caso contrário.


3. **Restrição de Jogada** (`void restricao()`)
    - Caso a jogada não seja válida, exibe uma mensagem informando que a jogada é inválida.


4. **Verificação de Empate** (`boolean empate(int jogadas)`)
    - Verifica se o jogo terminou em empate (situação de "velha").
    - Retorna `true` se todas as posições forem ocupadas e não houver vencedor.


5. **Verificação de Vitória** (`boolean vitoria()`)
    - Verifica se a jogada atual gerou uma condição de vitória para algum jogador.
    - Retorna `true` se houver um vencedor.


6. **Mensagem de Fim de Jogo** (`void exibeFim(int resultado)`)
    - Exibe uma mensagem informando se o jogo terminou em empate ("velha") ou se algum jogador venceu.


7. **Atualização do Tabuleiro** (`void atualizarTabuleiro(int posicao)`)
    - Atualiza o tabuleiro com a jogada do jogador atual na posição escolhida.

## Regras do Jogo

- O jogo é jogado em um tabuleiro 3x3, onde dois jogadores se revezam para preencher as células.
- O primeiro jogador a alinhar três símbolos (horizontalmente, verticalmente ou diagonalmente) vence o jogo.
- Se todas as células forem preenchidas sem um vencedor, o jogo termina em empate.

## Instruções para Executar

1. **Clone ou baixe o repositório** com os arquivos do projeto para o seu computador.
 

2. **Navegue até o diretório do projeto** no terminal ou prompt de comando.


3. **Compile o arquivo Java principal** utilizando o seguinte comando:

```bash
javac JogoDaVelha.java
```
4. Execute o programa com o comando abaixo:

```bash
java JogoDaVelha
```
5. O programa começará a executar e exibirá o tabuleiro inicial. Você deve inserir o número da posição desejada para jogar.

6. O jogo continuará até que haja um vencedor ou um empate (situação de "velha").

## Exemplo de Execução

```lua
Tabuleiro Atual:
1  2  3
4  5  6
7  8  9
Jogador "X", é a sua vez de jogar!
Escolha uma posição: _
```

## Estrutura do Projeto

O projeto contém uma única classe que implementa a lógica completa do jogo da velha:

- `JogoDaVelha.java`: Implementa o controle de fluxo do jogo, a exibição do tabuleiro, a verificação de jogadas e o sistema de vitória/empate.

## Requisitos

- **Java 8+** deve estar instalado no seu sistema para compilar e executar o jogo.

## Melhorias Futuras

- Adicionar uma interface gráfica para o jogo.
- Implementar uma versão onde o jogador possa jogar contra a máquina (IA).

## Licença

Este projeto está sob a licença MIT. Sinta-se à vontade para contribuir ou modificar como preferir!
