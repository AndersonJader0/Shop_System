public class Product {
    private int code;
    private String name;
    private int stock;
    private double valueUnit;

    //método construtor (classe abstrata)

    public Product(int codigo, String nome) {

        this.code = codigo;
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
        return valueUnit;
    }
    public void setUnitValue(double valorUnitario) {
        this.valueUnit = valorUnitario;
    }

    public void includeStock(int quantidade) {

        stock = stock + quantidade;

    }

    public void takeStock(int quantidade) {

        if (quantidade <= stock)
        {
            stock = stock - quantidade;
        }
        else
        {
            System.out.println("Estoque insuficiente.");
        }
    }
}
