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
        String usuario = cpf;

        String[] letras = new String[12];
        String[] letras2 = new String [2];

        int i2 = 0;
        for (int i = 1; i <= 11; i++) {
            String letra = usuario.substring(i2, i);
            letras[i2] = letra;
            System.out.println(letra);
            i2++;
        }if(i2 == 10){
            int soma = Integer.parseInt(letras[0] + letras[1] + letras[2] +
                    letras[3] + letras[4] + letras[5] +
                    letras [6] + letras[7] + letras[8] +
                    letras[9] + letras[10] + letras[11]);
            int i4 = 0;
            for(int i3 = 1; i3 <= 2; i3++) {
                String soma2 = String.valueOf(soma);
                String cpfAutenticacao = soma2.substring(i4, i3);
                letras2[i3] = cpfAutenticacao;
                i4++;
            }if(Objects.equals(letras[0], letras[1])){
                System.out.println("Cpf válido!");
            }else{
                System.out.println("Cpf inválido!");
            }
        }
    }

    private static String substring(int i, int i1) {
        return null;
    }
}