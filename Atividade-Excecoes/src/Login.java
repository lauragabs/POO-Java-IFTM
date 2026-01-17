public class Login {

    private String usuarioValido = "admin";
    private String senhaValida = "12345";

    public void validarCredenciais(String usuario, String senha) throws Validacao {
        if (!usuario.equals(usuarioValido) || !senha.equals(senhaValida)) {
            throw new Validacao("Usuário ou senha inválidos!");
        }
    }
    
}
