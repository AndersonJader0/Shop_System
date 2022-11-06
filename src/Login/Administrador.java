package src.Login;

public class Administrador extends Usuario{
    private static final int SENHA_ADM = 12;
    private int counterAdms = 0;

    public Administrador(int senha,String nome, int idade, String cpf, int numeroCelular, char genero, String email){
        super(senha,nome,idade,cpf,numeroCelular,genero,email);
        counterAdms += 1;
    }
}
