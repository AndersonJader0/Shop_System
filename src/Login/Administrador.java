package src.Login;

public class Administrador extends Usuario{
    private static final int SENHA_ADM = 12;
    private int counterAdms = 0;

    public Administrador(int senha){
        super(senha);
        counterAdms += 1;
    }
}
