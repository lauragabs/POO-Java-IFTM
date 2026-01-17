# Atividade de Encapsulamento 

1 - Crie uma classe chamada JogadorDeFutebol contendo os atributos públicos nome,
posição, data de nascimento, nacionalidade, altura e peso. Crie o construtor para
inicializar todos os atributos e um método chamado calculaIdade( ) que retorna a
idade do jogador. Crie o método que exibe todos os dados na forma:

Nome: Fulano
Ano de Nascimento: xxxx
Altura: 1,80 m
Peso: 85,0 kg
Nacionalidade: Brasileiro
Posição: Meio de Campo


2 - Crie a classe chamada App contendo o método main( ) que instancia a classe
JogadorDeFutebol uma vez. Essa classe contém o método de leitura dos dados
chamado leDados( ) e o método que mostra quanto tempo (em anos) falta para o
jogador se aposentar sabendo que, em média, se o jogador for atacante ele aposenta
aos 35 anos, se for da defesa ele aposenta aos 40 anos e se for meio de campo ele
aposenta aos 38 anos. Esse método deve retornar uma String na forma:

Faltam xx anos para o jogador Fulano se aposentar.


## Respostas às Questões

**b) O que acontece ao tornar o atributo `nome` privado? Explique.**

Ao tornar o atributo `nome` privado, ele não fica acessível fora da classe `JogadorDeFutebol`, resultando em um erro de acesso na classe `App`. O erro ocorre porque o atributo `nome` foi declarado como privado, o que impede o acesso direto a ele fora da classe onde foi declarado.

**c) Solução com um método getter**

Para corrigir o problema de acesso ao atributo privado `nome`, foi implementado um método `getNome()` na classe `JogadorDeFutebol`. O getter permite que outras classes acessem o valor do nome, mantendo o encapsulamento e o controle de acesso sobre o atributo.
