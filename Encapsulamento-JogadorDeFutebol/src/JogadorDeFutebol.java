public class JogadorDeFutebol {

    private String  nome;
    public int anoNascimento;
    public double altura;
    public double peso;
    public String nacionalidade;
    public String posicao;

    public String getNome() {
        return nome;
    }

    public JogadorDeFutebol(String nome, int anoNascimento, double altura, double peso, String nacionalidade,
            String posicao) {
        this.nome = nome;
        this.anoNascimento = anoNascimento;
        this.altura = altura;
        this.peso = peso;
        this.nacionalidade = nacionalidade;
        this.posicao = posicao;
    }

    public int  calcularIdade() {
        int idade = 2024 - anoNascimento;
        return idade;
    }

    public void exibeDados(){
        System.out.println("Dados do  Jogador: ");
        System.out.println("Nome: " + nome);
        System.out.println("Ano de Nascimento: " + anoNascimento);
        System.out.println("Altura: "  + altura + "m");
        System.out.println("Peso: " + peso + "kg");
        System.out.println("Nacionalidade: " + nacionalidade);
        System.out.println("Posição: " + posicao);
        System.out.println(" ");
    }
    
}
