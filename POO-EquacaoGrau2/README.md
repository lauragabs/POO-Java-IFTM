# Resolvedor de Equações do Segundo Grau

Este projeto é uma aplicação Java que resolve equações do segundo grau. O programa lê os coeficientes _a_ , _b_ e _c_  do usuário e calcula as raízes da equação, se existirem.

## Funcionalidades

- Cálculo do discriminante _delta_.
- Cálculo das raízes reais da equação, se _delta_ for maior ou igual a zero.
- Mensagem informativa caso não existam soluções reais.

## Estrutura do Projeto

O projeto consiste em duas classes principais:

### 1. `EqGrau2`

Esta classe representa a equação do segundo grau. Contém os seguintes métodos:

- **Construtor**: Inicializa os coeficientes da equação.
- **`delta()`**: Calcula o discriminante da equação.
- **`calcularX1()`**: Calcula a primeira raiz real.
- **`calcularX2()`**: Calcula a segunda raiz real.

### 2. `App`

A classe principal que executa o programa:

- Lê os coeficientes _a_ , _b_ e _c_ do usuário.
- Verifica se as raízes são reais.
- Exibe as raízes ou uma mensagem de erro caso não existam.

## Como Usar

1. Clone o repositório:

   ```bash
   git clone https://github.com/seuusuario/resolvedor-equacoes.git
   ```

2. Navegue até o diretório do projeto:

    ```bash
    cd resolvedor-equacoes
    ```

3. Compile o projeto:

    ```bash
    javac App.java EqGrau2.java
    ```

4. Execute a aplicação:

    ```bash
    java App
    ```
    
Siga as instruções na tela para inserir os coeficientes da equação.

## Exemplo de Uso

Ao executar o programa, a saída será similar a:

```plaintext
Digite 3 coeficientes da equação com A diferente de zero:
Digite o coeficiente A: 1
Digite o coeficiente B: 5
Digite o coeficiente C: 6
As raízes da equação são:
X1 = -2.0
X2 = -3.0
```

## Considerações

- O coeficiente _a_ deve ser diferente de zero para que a equação seja válida.
- Se o discriminante for menor que zero, o programa informará que não há soluções reais.

## Licença

Este projeto é licenciado sob a [MIT License](LICENSE).
