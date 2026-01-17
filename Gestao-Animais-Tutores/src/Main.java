import java.util.*;

public class Main {
    private static HashMap<String, Animal> animaisMap = new HashMap<>();
    private static HashSet<String> tutoresSet = new HashSet<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;
        do {
            System.out.println("Menu:");
            System.out.println("1. Adicionar um animal");
            System.out.println("2. Remover um animal pelo registro");
            System.out.println("3. Imprimir os dados dos animais");
            System.out.println("4. Buscar Animal pelo nome do Tutor");
            System.out.println("5. Listar tutores");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();
            
            System.out.println("--------------------------");

            switch (opcao) {
                case 1:
                    adicionarAnimal();
                    break;
                case 2:
                    removerAnimal();
                    break;
                case 3:
                    imprimirAnimais();
                    break;
                case 4:
                    buscarAnimalPorTutor();
                    break;
                case 5:
                    listarTutores();
                    break;
                case 6:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 6);
    }

    public static void adicionarAnimal() {
        Animal animal = new Animal();
        System.out.print("Digite o nome do animal: ");
        animal.setNome(scanner.nextLine());
        System.out.print("Digite a idade do animal: ");
        animal.setIdade(scanner.nextInt());
        scanner.nextLine();  
        System.out.print("Digite o nome do tutor: ");
        animal.setNomeTutor(scanner.nextLine());
        System.out.print("Digite o registro do animal: ");
        animal.setRegistro(scanner.nextLine());
        System.out.println(" ");
        
        animaisMap.put(animal.getRegistro(), animal);
        tutoresSet.add(animal.getNomeTutor());
        System.out.println("Animal adicionado com sucesso!");
        System.out.println("--------------------------");
    }

    public static void removerAnimal() {
        System.out.print("Digite o registro do animal a ser removido: ");
        String registro = scanner.nextLine();
        System.out.println(" ");
        if (animaisMap.remove(registro) != null) {
            System.out.println("Animal removido com sucesso!");
        } else {
            System.out.println("Animal não encontrado.");
        }
        System.out.println("--------------------------");
    }

    public static void imprimirAnimais() {
        if (animaisMap.isEmpty()) {
            System.out.println("Nenhum animal cadastrado.");
        } else {
            for (Animal animal : animaisMap.values()) {
                System.out.println(); 
                System.out.println("Nome: " + animal.getNome());
                System.out.println("Idade: " + animal.getIdade());
                System.out.println("Nome do Tutor: " + animal.getNomeTutor());
                System.out.println("Registro: " + animal.getRegistro());
                System.out.println(); 
            }
        }
    }

    public static void buscarAnimalPorTutor() {
        System.out.print("Digite o nome do tutor para buscar os animais: ");
        String nomeTutor = scanner.nextLine();
        System.out.println(); 

        boolean encontrou = false;
        
        for (Animal animal : animaisMap.values()) {
            if (animal.getNomeTutor().equalsIgnoreCase(nomeTutor)) {
                System.out.println("Nome: " + animal.getNome());
                System.out.println("Idade: " + animal.getIdade());
                System.out.println("Nome do Tutor: " + animal.getNomeTutor());
                System.out.println("Registro: " + animal.getRegistro());
                System.out.println(); 
                encontrou = true;
            }
        }

        if (!encontrou) {
            System.out.println("Nenhum animal encontrado para o tutor: " + nomeTutor);
        }
        System.out.println("--------------------------");
    }

    public static void listarTutores() {
        if (tutoresSet.isEmpty()) {
            System.out.println("Nenhum tutor cadastrado.");
        } else {
            System.out.println("Lista de tutores:");
            for (String tutor : tutoresSet) {
                System.out.println(tutor);
            }
        }
        System.out.println("--------------------------");
    }
}
