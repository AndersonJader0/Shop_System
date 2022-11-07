package src.JanelasInterativas;

public class ListaNomes {
    private int tamanho;
    private int qtde;
    private String nomes[];

    public ListaNomes(int tamanho) {
        nomes = new String[tamanho];
        qtde = 0;
    }

    public void adiciona(String nome) {
        nomes[qtde] = nome;
        qtde++;
    }

    public String texto() {
        String txt = "Lista de nomes:\n";
        for(int i=0; i< qtde;i++) {
            txt = txt + nomes[i] + "\n";
        }
        return txt;
    }

    public void imprime() {
        System.out.println("Lista de nomes:");
        for(int i=0; i< qtde;i++) {
            System.out.println(nomes[i]);
        }
    }
}