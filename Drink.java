public class Drink extends Product{
    private String type;

    //método construtor
    public Drink (int codigo, String nome, String tipo) {
        super(codigo, nome);
        this.type = tipo;
    }
    //encapsulamento (getters and setters)

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
}
