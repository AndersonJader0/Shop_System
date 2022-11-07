package src.testeAutenticacao;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class CpfAutentico2 {
    public static void main(String[] args) {
        verificarCpf();
    }

    public static void verificarCpf() {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Digite o cpf: ");
        String cpf = keyboard.next();

        String usuario = cpf;

        String[] numeros = new String[11];
        int[] numeroCpf1 = new int[6];
        int[] numeroCpf2 = new int[5];
        int[] cpfCalculo = new int[11];

        int i2 = 0;
        for (int i = 1; i <= 11; i++) {
            String letra = usuario.substring(i2, i);
            numeros[i2] = letra;
            //System.out.println(numeros[i2]);
            i2++;
            int counter2 = 0;
            int counter3;
            if (i == 11) {
                for (int counter = 1; counter <= 6; counter++) {
                    numeroCpf1[counter2] = parseInt((numeros[counter2]));
                    //System.out.println(numeroCpf1[counter2]);

                    counter2++;
                    if (counter == 6) {
                        counter2 = 0;
                        for (counter3 = 6; counter3 <= 10; counter3++) {
                            numeroCpf2[counter2] = parseInt((numeros[counter3]));
                            //System.out.println(numeroCpf2[counter2]);
                            counter2++;

                            if (counter3 == 10) {
                                int soma = (numeroCpf1[0] + numeroCpf1[1] + numeroCpf1[2] +
                                        numeroCpf1[3] + numeroCpf1[4] + numeroCpf1[5] +
                                        numeroCpf2[0] + numeroCpf2[1] + numeroCpf2[2] +
                                        numeroCpf2[3] + numeroCpf2[4]);
                                String soma2 = String.valueOf(soma);
                                int number1 = Integer.parseInt(soma2.substring(0, 1));
                                int number2 = Integer.parseInt(soma2.substring(1, 2));
                                // System.out.println(number1);
                                // System.out.println(number2);

                                if (number1 == number2) {
                                    System.out.println("Cpf válido!");
                                } else {
                                    System.out.println("Cpf inválido!");
                                    System.out.println("");
                                    verificarCpf();
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}