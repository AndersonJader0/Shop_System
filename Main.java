import java.util.Scanner;
public class Main {
    public static void main(String[]args) {
        Scanner teclado = new Scanner(System.in);

        int resposta;

        System.out.println("Qual opção desejada: "
                + "\n1 - Cadastrar produto:"
                + "\n2 - Consultar produto:"
                + "\n3 - Retirar produto:"
                + "\n4 - Incluir produto:"
                + "\n5 - Apagar produto:"
                + "\n6 - Sair");

        resposta = teclado.nextInt();

    }

}
