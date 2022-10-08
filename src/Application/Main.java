package src.Application;

import java.util.Scanner;
public class Main {
    public static void main(String[]args) {
        Scanner teclado = new Scanner(System.in);

        int resposta;

        System.out.println("""
                -----------------------------------------------------
                -----------Controle de estoque da Newsstand----------\s
                -----------------------------------------------------
                ******* Selecione a opção que deseja utilizar *******
                | 1 - Cadastrar produto.:                            |
                | 2 - Consultar produto.:                            |
                | 3 - Retirar produto.:                              |
                | 4 - Incluir produto.:                              |
                | 5 - Apagar produto.:                               |
                | 6 - Sair.                                          |
                -----------------------------------------------------""");

        resposta = teclado.nextInt();

    }
}