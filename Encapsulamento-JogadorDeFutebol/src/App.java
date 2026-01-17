import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        JogadorDeFutebol jogador = leDados();
        jogador.exibeDados();
        System.out.println(calculaAposentadoria(jogador));    }

    public static  JogadorDeFutebol leDados() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do jogador:");
        String nome = scanner.nextLine();
        System.out.println("Digite o ano de Nascimento do jogador:");
        int anoNascimento = scanner.nextInt();
        System.out.println("Digite a altura(M) do Jogador: "); 
        double altura = scanner.nextDouble();
        System.out.println("Digite o peso(KG) do  Jogador: ");
        double peso = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Digite a nacionalidade do  jogador:");
        String nacionalidade = scanner.nextLine();
        System.out.println("Digite a posicao  do jogador:");
        String posicao = scanner.nextLine();
        System.out.println(" ");

        scanner.close();

        return  new JogadorDeFutebol(nome, anoNascimento, altura, peso, nacionalidade, posicao);
    }

    public static String  calculaAposentadoria (JogadorDeFutebol jogador) {
        int idadeAtual = jogador.calcularIdade();
        int idadeAposentadoria = 0 ;

        if (jogador.posicao.equals("atacante")) {
            idadeAposentadoria = 35;
        } else if (jogador.posicao.equals("defesa")) {
            idadeAposentadoria = 40;
        } else if (jogador.posicao.equals("meio de campo")) {
            idadeAposentadoria = 38;
        } else {
            return "Posicao desconhecida";
        }

        int anosRestante =  idadeAposentadoria - idadeAtual;

        if(anosRestante>0){
            return "Faltam "+anosRestante+" anos para o Jogador "  + jogador.getNome() + " se aposentar.";
        }else {
            return "O jogador "+ jogador.getNome() + " ja esta aposentado.";
        }
    }

}
