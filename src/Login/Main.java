package src.Login;

public class Main {
    public static void main(String[] args) {
        String usuario = "11122233345";

        String[] letras = new String[12];

        int i2 = 0;
        for (int i = 1; i <= 11; i++) {
            String letra = usuario.substring(i2, i);
            i2++;
            letras[i2] = letra;
            System.out.println(letra);
        }
    }
}
