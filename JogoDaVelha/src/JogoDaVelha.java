import java.util.Scanner;

public  class JogoDaVelha {

    static char[][] tabuleiro = {
            {'1', '2', '3'},
            {'4', '5', '6'},
            {'7', '8', '9'}
    };

    static char jogadorAtual = 'X';

    public static void main(String[] args) {
        boolean jogoAtivo = true;
        int jogadas = 0;

        while (jogoAtivo) {
            interFace(jogadas);

            Scanner scanner = new Scanner(System.in);
            int posicao = scanner.nextInt();

            if (validacao(posicao)) {
                atualizarTabuleiro(posicao);

                if (vitoria()) {
                    interFace(jogadas);
                    exibeFim(1);
                    jogoAtivo = false;
                } else if (empate(++jogadas)) {
                    interFace(jogadas);
                    exibeFim(0);
                    jogoAtivo = false;
                } else {
                    jogadorAtual = (jogadorAtual == 'X') ? 'O' : 'X';
                }
            } else {
                restricao();
            }

            scanner.close();
        }
    }

    public static int interFace(int jogadas) {
        System.out.println("Tabuleiro Atual:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(tabuleiro[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Jogador \"" + jogadorAtual + "\" é a sua vez de jogar!");
        System.out.print("Escolha uma posição: ");
        return jogadas;
    }

    public static void exibeFim(int resultado) {
        if (resultado == 1) {
            System.out.println("O jogador " + jogadorAtual + " venceu!");
        } else {
            System.out.println("Deu velha! Empate.");
        }
    }

    public static boolean validacao(int posicao) {
        switch (posicao) {
            case 1: return tabuleiro[0][0] == '1';
            case 2: return tabuleiro[0][1] == '2';
            case 3: return tabuleiro[0][2] == '3';
            case 4: return tabuleiro[1][0] == '4';
            case 5: return tabuleiro[1][1] == '5';
            case 6: return tabuleiro[1][2] == '6';
            case 7: return tabuleiro[2][0] == '7';
            case 8: return tabuleiro[2][1] == '8';
            case 9: return tabuleiro[2][2] == '9';
            default: return false;
        }
    }

    public static void restricao() {
        System.out.println("Jogada inválida! Tente novamente.");
    }

    public static void atualizarTabuleiro(int posicao) {
        switch (posicao) {
            case 1: tabuleiro[0][0] = jogadorAtual; break;
            case 2: tabuleiro[0][1] = jogadorAtual; break;
            case 3: tabuleiro[0][2] = jogadorAtual; break;
            case 4: tabuleiro[1][0] = jogadorAtual; break;
            case 5: tabuleiro[1][1] = jogadorAtual; break;
            case 6: tabuleiro[1][2] = jogadorAtual; break;
            case 7: tabuleiro[2][0] = jogadorAtual; break;
            case 8: tabuleiro[2][1] = jogadorAtual; break;
            case 9: tabuleiro[2][2] = jogadorAtual; break;
        }
    }

    public static boolean empate(int jogadas) {
        return jogadas == 9;
    }

    public static boolean vitoria() {
        for (int i = 0; i < 3; i++) {
            if (tabuleiro[i][0] == tabuleiro[i][1] && tabuleiro[i][1] == tabuleiro[i][2]) {
                return true;
            }
        }

        for (int i = 0; i < 3; i++) {
            if (tabuleiro[0][i] == tabuleiro[1][i] && tabuleiro[1][i] == tabuleiro[2][i]) {
                return true;
            }
        }

        if (tabuleiro[0][0] == tabuleiro[1][1] && tabuleiro[1][1] == tabuleiro[2][2]) {
            return true;
        }
        if (tabuleiro[0][2] == tabuleiro[1][1] && tabuleiro[1][1] == tabuleiro[2][0]) {
            return true;
        }

        return false;
    }
}