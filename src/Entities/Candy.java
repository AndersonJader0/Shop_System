package src.Entities;
public class Candy extends Product {
    private String brand;

    //Método construtor
    public Candy (String name, double unitValue, String brand) {
        super(name, unitValue);
        this.brand = brand;
    }

    //encapsulament (getters and setters)

    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String toString(){
       return super.toString() + "\nMarca do produto: " + getBrand();
    }
}