package src.Login;

import src.Loja.SystemShop;

import java.util.Objects;
public class Usuario {

    private static final int DDD = 13;
    private static int senha;

    private String nome;
    private int idade;
    private String cpf;
    private int numeroCelular;
    private char genero;
    private String email;


    public Usuario(int senha, String nome, int idade, String cpf, int numeroCelular, char genero, String email) {
        this.senha = senha;
        this.nome = nome;
        this.cpf = cpf;
        this.numeroCelular = numeroCelular;
        this.genero = genero;
        this.email = email;
    }

    public static void cadastrar(int senhaCadastro, String nome, int idade, String cpf, int numeroCelular, char genero, String email) {
        Usuario usuario = new Usuario(senhaCadastro, nome, idade, cpf, numeroCelular, genero, email);
        System.out.println("Cadastro realizado com sucesso!");
        SistemaLogin.Logar();
    }

    public static void login(int login) {
        if (Objects.equals(login, senha)) {
            //operations();
            SystemShop.shopInterface();
        } else {
            System.out.println("Não foi possível realizar o login!");
            SistemaLogin.Logar();
        }
    }
}