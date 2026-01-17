
# **Projeto: Sobrecarga de Métodos**

Este repositório contém dois exemplos didáticos desenvolvidos para demonstrar o conceito de **sobrecarga de métodos** em Java. A sobrecarga de métodos permite que uma classe tenha vários métodos com o mesmo nome, mas com diferentes assinaturas (quantidade ou tipos de parâmetros).

## Estrutura do Projeto

O projeto está dividido em duas pastas principais, **Exemplo1** e **Exemplo2**, cada uma contendo sua implementação independente.

---

### **Exemplo 1**
#### Descrição
O **Exemplo1** implementa a sobrecarga de métodos com foco na **soma de números**. Ele demonstra como criar métodos com o mesmo nome (`somar`) que aceitam diferentes tipos e quantidades de parâmetros.

#### Estrutura
- **Classe `Adicao1`**  
  Contém métodos sobrecarregados para somar:
  - Dois números inteiros.
  - Três números inteiros.
  - Dois números de ponto flutuante (`double`).

- **Classe `Dados1`**  
  Centraliza os dados utilizados nos cálculos.

- **Classe `Main`**  
  Contém o método `main`, que realiza a chamada dos métodos sobrecarregados da classe `Adicao1` e exibe os resultados no console.

#### Objetivo
Ensinar como reutilizar o mesmo método para diferentes necessidades, reduzindo o esforço de nomeação e organizando o código.

---

### **Exemplo 2**
#### Descrição
O **Exemplo2** expande os conceitos vistos no primeiro exemplo, aplicando a sobrecarga de métodos em um contexto mais **orientado a objetos**. Ele introduz mais classes e cenários para ilustrar como diferentes métodos podem ser usados em situações variadas.

#### Estrutura
- **Classe `Adicao2`**  
  Similar à `Adicao1`, mas com métodos mais variados para cálculo.

- **Classe `Dados1`**  
  Gerencia dados de entrada em cenários mais complexos.

- **Classe `Main`**  
  Realiza chamadas dos métodos sobrecarregados de `Adicao2` e demonstra a flexibilidade da sobrecarga.

#### Objetivo
Explorar como a sobrecarga de métodos pode ser utilizada para atender a diferentes requisitos, como cálculos variados, sem modificar o nome principal do método.