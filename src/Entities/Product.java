package src.Entities;

import java.util.Random;

public class Product {
    private int stock;
    private String name;
    private double unitValue;

    Random random = new Random();
    int randomNumber = random.nextInt(1000);
    int identifier;

    //método construtor (classe abstrata)

    public Product(String name, double unitValue) {
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

    public void includeStock(int quantidade) {
        stock = stock + quantidade;
        System.out.println("Produto adicionado com sucesso!");
    }

    public void takeStock(int quantidade) {

        if (quantidade <= stock) {
            stock = stock - quantidade;
            System.out.println("Produto retirado com sucesso!");
        } else {
            System.out.println("Estoque insuficiente.");
        }
    }
    public String toString(){
        return "\nCódigo do produto: " + this.getIdentifier() +
                "\nNome do produto: " + this.getName() +
                "\nValor do produto: " + this.getUnitValue();
    }
}
