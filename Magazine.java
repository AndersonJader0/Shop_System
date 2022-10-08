public class Magazine extends Product{
    private String publishingCompany;

    public Magazine (int code, String name, String
            publishingCompany) {
        super(code, name);
        this.publishingCompany = publishingCompany;
    }
    //encapsulamento (getters and setters)

    public String getMarca() {
        return publishingCompany;
    }
    public void setMarca(String marca) {
        this.publishingCompany = marca;
    }
}
