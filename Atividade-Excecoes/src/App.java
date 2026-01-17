import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);

        try {
            Login login = new Login();

            System.out.print("Digite o usuário: ");
            String usuario = scanner.nextLine();

            System.out.print("Digite a senha: ");
            String senha = scanner.nextLine();

            login.validarCredenciais(usuario, senha);
            System.out.println("Login realizado com sucesso!");

            System.out.print("Digite o nome da pessoa: ");
            String nome = scanner.nextLine();

            System.out.print("Digite o telefone da pessoa: ");
            String telefone = scanner.nextLine();

            Pessoa pessoa = new Pessoa(nome, telefone);

            System.out.println("\nCadastro realizado com sucesso!");
            System.out.println("Nome: " + pessoa.getNome());
            System.out.println("Telefone: " + pessoa.getTelefone());

        } catch (Validacao e) {
            System.out.println("Erro: " + e.getMessage());
        }
        
        scanner.close();
           
    }
}
