package src.Entities;

public class Magazine extends Product{
    private String publishingCompany;

    public Magazine (int code, String name, String
            publishingCompany) {
        super(code, name);
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
        return super.toString() + "Editora do produto: " + this.getPublishingCompany();
    }
}
