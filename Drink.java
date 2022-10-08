public class Drink extends Product{
    private String type;

    //método construtor
    public Drink (int code, String name, String type) {
        super(code, name);
        this.type = type;
    }
    //encapsulamento (getters and setters)

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
}
