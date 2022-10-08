package src.Entities;

public class Product {
    private int code, stock;
    private String name;
    private double unitValue;

    //método construtor (classe abstrata)

    public Product(int code, String name) {
        this.code = code;
        this.name = name;
    }
    //encapsulamento - (getters and setters)

    public int getCode() {
        return code;
    }
    public void setCode(int code) {
        this.code = code;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getUnitValue() {
        return unitValue;
    }
    public void setUnitValue(double unitValue) {
        this.unitValue = unitValue;
    }

    public void includeStock(int quantidade) {
        stock = stock + quantidade;
    }

    public void takeStock(int quantidade) {

        if (quantidade <= stock) {
            stock = stock - quantidade;
        } else {
            System.out.println("Estoque insuficiente.");
        }
    }
    public String toString(){
        return "\nNome do produto: " + this.getName() +
                "\nCódigo do produto: " + this.getCode() +
                "\nValor do produto: " + this.getUnitValue();
               // "\nQuantidade no estoque: " + this.getNumeroVotos();
    }
}
