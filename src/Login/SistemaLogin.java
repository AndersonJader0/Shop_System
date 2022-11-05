package src.Login;

import src.Loja.SystemShop;

import java.util.Objects;
import java.util.Scanner;

import static src.Application.Main.operations;
import static src.Loja.SystemShop.shopInterface;

public class SistemaLogin {

    private static char genero;
    private static int senhaAdm = 12;
    static Scanner keyboard = new Scanner(System.in);

    public static void Logar() {
        System.out.println("---------------------------------------------------------");
        System.out.println("*******  Selecione a opção que deseja efetuar  *******");
        System.out.println("------------------------------------------------------");
        System.out.println("1 - Login");
        System.out.println("2 - Cadastro");
        System.out.println("3 - Sair");
        int opcao = keyboard.nextInt();

        if (opcao == 1) {
            System.out.println("Digite a senha: ");
            int login = keyboard.nextInt();

            if (login == senhaAdm) {
                operations();
            } else {
                Usuario.login(login);
            }
        } else if (opcao == 2) {
            System.out.println("------------Cadastro------------");

            System.out.println("Nome: ");
            String nome = keyboard.next();

            System.out.println("Email: ");
            String email = keyboard.next();

            System.out.println("Confirmar email: ");
            String confirmarEmail = keyboard.next();

            if (Objects.equals(email, confirmarEmail)) {

                System.out.println("""
                        Gênero:\s
                        M - Masculino
                        F - Feminino""");
                genero = keyboard.next().charAt(0);
            }else {
                System.out.println("Os emails não estão iguais!");
               cadastrarEmail();
            }
                System.out.println("Cpf: ");
                String cpf = keyboard.next();

                System.out.println("Senha: ");
                int senhaCadastro = keyboard.nextInt();
                System.out.println("Confirmar senha: ");
                int confirmarSenha = keyboard.nextInt();
                if (senhaCadastro == confirmarSenha) {
                    System.out.println("Digite a idade: ");
                    int idade = keyboard.nextInt();
                    if(idade >= 18){
                        System.out.println("Numero do celular: ");
                        int numeroCelular = keyboard.nextInt();

                        Usuario usuario = new Usuario(senhaCadastro,nome,idade,cpf,numeroCelular,genero,email);
                    }else{
                        System.out.println("É necesserário ter 18 anos ou mais para registrar uma conta!");
                    }
                } else {
                    System.out.println("As senhas não são iguais!");
                    Logar();
                }
            } else if (opcao == 3) {
                System.exit(0);
            }
        }
    public static void cadastrarEmail(){
        System.out.println("Email: ");
        String email = keyboard.next();
        System.out.println("Confirmar email: ");
        String confirmarEmail = keyboard.next();
    }
    public static void verificarCpf(String cpf){
        char[] caracteres = new char[11];

        for (int i = 1; i <= 8; i++) {
            String caracter = SistemaLogin.substring(0,1);
        }
    }

    private static String substring(int i, int i1) {
        return null;
    }
}