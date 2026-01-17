public class Pessoa {
    private String nome;
    private String telefone;

    public Pessoa(String nome, String telefone) throws Validacao {
        setNome(nome);      
        setTelefone(telefone); 
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setNome(String nome) throws Validacao {
        if (!nome.matches("[a-zA-ZáéíóúÁÉÍÓÚãõçÃÕÇâêîôûÂÊÎÔÛ ]+")) {
            throw new Validacao("Nome inválido! O nome deve conter apenas letras.");
        }
        this.nome = nome;
    }

    public void setTelefone(String telefone) throws Validacao {
        if (!telefone.matches("\\d{10,11}")) {
            throw new Validacao("Telefone inválido! O telefone deve conter apenas números e ter 10 ou 11 dígitos.");
        }
        this.telefone = telefone;
    }
    
}
