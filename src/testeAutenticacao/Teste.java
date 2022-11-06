package src.testeAutenticacao;

import java.util.Scanner;

import java.util.Objects;

public class Teste {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Digite o cpf: ");
        String cpf = keyboard.next();
        verificarCpf(cpf);

    }
    public static void verificarCpf(String cpf){
        String usuario = cpf;

        String[] letras = new String[12];
        String[] letras2 = new String[2];
        int[] numerosCpf = new int[11];

        int i2 = 0;
        for (int i = 1; i <= 11; i++) {
            String letra = usuario.substring(i2, i);
            letras[i2] = letra;
            i2++;
            int counter2 = 0;
            if(i == 9){
                for(int counter = 1; counter <= 11; counter++) {
                    numerosCpf[counter2] = Integer.parseInt(letras[counter2]);
                    if(counter == 11){
                        int soma = numerosCpf[0] + numerosCpf[1] + numerosCpf[2] +
                                numerosCpf[3] + numerosCpf[4] + numerosCpf[5] +
                                numerosCpf[6] + numerosCpf[7] + numerosCpf[8] +
                                numerosCpf[9] + numerosCpf[10];
                        String soma2 = String.valueOf(soma);
                        letras2[0] =
                    }
                }



                System.out.println("verificando");
                int i4 = 0;
                for(int i3 = 1; i3 <= 2; i3++) {
                    String soma2 = String.valueOf(soma);
                    String cpfAutenticacao = soma2.substring(i4, i3);
                    letras2[i3] = cpfAutenticacao;
                    i4++;
                    if(Objects.equals(letras[0], letras[1])){
                        System.out.println("Cpf válido!");
                    }else{
                        System.out.println("Cpf inválido!");
                    }
                }
            }
        }
    }
}
