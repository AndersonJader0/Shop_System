package src.Entities;

public class Magazine extends Product{
    private String publishingCompany;

    public Magazine (String name, double unitValue, String
            publishingCompany) {
        super(name, unitValue);
        this.publishingCompany = publishingCompany;
    }
    //encapsulamento (getters and setters)

    public String getPublishingCompany() {
        return publishingCompany;
    }
    public void setMarca(String publishingCompany) {
        this.publishingCompany = publishingCompany;
    }
    public String toString(){
        return super.toString() + "\nEditora do produto: " + this.getPublishingCompany();
    }
}
