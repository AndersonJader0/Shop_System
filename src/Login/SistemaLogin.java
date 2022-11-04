package src.Login;

import java.util.Scanner;

public class SistemaLogin {
    public static void Logar() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("---------------------------------------------------------");
        System.out.println("*******  Selecione a opção que deseja efetuar  *******");
        System.out.println("------------------------------------------------------");
        System.out.println("1 - Login");
        System.out.println("2 - Cadastro");
        int opcao = keyboard.nextInt();

        if (opcao == 1) {
            System.out.println("Digite a senha: ");
            int senha = keyboard.nextInt();
            Usuario.login(senha);
        } else {
            System.out.println("-------Cadastro------");
            System.out.println("Senha: ");
            int senhaCadastro = keyboard.nextInt();
            System.out.println("Confirmar senha: ");
            int confirmarSenha = keyboard.nextInt();
            if (senhaCadastro == confirmarSenha) {
                Usuario.cadastrar(senhaCadastro);
            }else{
                System.out.println("As senhas não são iguais!");
                Logar();
            }
        }
    }
}
