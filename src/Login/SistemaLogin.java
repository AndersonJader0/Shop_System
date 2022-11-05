package src.Login;

import src.Loja.SystemShop;

import java.util.Scanner;

import static src.Application.Main.operations;

public class SistemaLogin {
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
            System.out.println("-------Cadastro------");
            System.out.println("Senha: ");
            int senhaCadastro = keyboard.nextInt();
            System.out.println("Confirmar senha: ");
            int confirmarSenha = keyboard.nextInt();
            if (senhaCadastro == confirmarSenha) {
                Usuario.cadastrar(senhaCadastro);
            } else {
                System.out.println("As senhas não são iguais!");
                Logar();
            }
        } else if (opcao == 3) {
            System.exit(0);
        }
    }
}