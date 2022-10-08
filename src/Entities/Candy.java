package src.Entities;
public class Candy extends Product {
    private String brand;

    //Método construtor
    public Candy (int code, String name, String brand) {
        super(code,name);
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
       return super.toString() + "Marca do produto: " + getBrand();
    }
}