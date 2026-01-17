import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        double a, b, c;
        Scanner s = new Scanner(System.in);
        System.out.println("Digite 3 coeficientes da equacao com A diferente de zero");
        
        System.out.print("Digite o coeficiente A: ");
        a = s.nextDouble();
        System.out.print("Digite o coeficiente B: ");
        b = s.nextDouble();
        System.out.print("Digite o coeficiente C: ");
        c = s.nextDouble();

        EqGrau2 equacao = new EqGrau2(a, b, c);
        double delta = equacao.delta();

        if (delta < 0) {
            System.out.println("A equacao nao tem solução real.");
        } else {
            double x1 = equacao.calcularX1();
            double x2 = equacao.calcularX2();
            System.out.println("As raízes da equação são:");
            System.out.println("X1 = " + x1);
            System.out.println("X2 = " + x2);
        }

        s.close();
    }
}
