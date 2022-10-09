package src.Entities;

public class Drink extends Product{
    private String type;

    //método construtor
    public Drink (String name, double unitValue, String type) {
        super(name, unitValue);
        this.type = type;
    }
    //encapsulamento (getters and setters)

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    public String toString(){
        return super.toString() + "\nTipo do produto: " + getType();
    }
}
