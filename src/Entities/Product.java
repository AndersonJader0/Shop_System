package src.Entities;

import java.util.Random;

public class Product {
    private int stock;
    private String name;
    private double unitValue;

    private static int quantity;

    Random random = new Random();
    int randomNumber = random.nextInt(1000);
    int identifier;

    //método construtor (classe abstrata)

    public Product(String name, double unitValue, int quantity) {
        this.identifier = randomNumber;
        this.name = name;
        this.unitValue = unitValue;
    }

    //encapsulamento - (getters and setters)

    public int getIdentifier(){
        return identifier;
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

    public static void setQuantity(int quantity) {
        Product.quantity = quantity;
    }
    public static int getQuantity() {
        return quantity;
    }

    public String toString(){
        return "\nCódigo do produto: " + this.getIdentifier() +
                "\nNome do produto: " + this.getName() +
                "\nValor do produto: " + this.getUnitValue() +
                "\nQuantidade do produto: " + getQuantity();
    }
}


