package src.Login;

import java.util.Objects;

import static src.Application.Main.operations;

public class Usuario {
    private static int senha;

    public Usuario(int senha) {
        this.senha = senha;
    }

    public static void cadastrar(int senhaCadastro) {
        Usuario usuario = new Usuario(senhaCadastro);
        System.out.println("Cadastro realizado com sucesso!");
        SistemaLogin.Logar();
    }

    public static void login(int login) {
        if (Objects.equals(login, senha)) {
            operations();
        } else {
            System.out.println("Não foi possível realizar o login!");
            SistemaLogin.Logar();
        }
    }
}