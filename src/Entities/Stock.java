package src.Entities;
import src.Entities.*;
public class Stock {
    int quantity;

    public int setQuantity() {
        return quantity;
    }
    public void getQuantity(int quantity){
        this.quantity = quantity;
    }

    public  void setProductQuantity(int quantidade){
        if (quantity > 0){
            setQuantity(getQuantity() + quantity);
            System.out.println("Quantidade foi armazenada com sucesso!");
        }else{
            System.out.println("Não foi possível armazenar!");
        }
    }


}

