package src.Entities;


import static src.Entities.Product.setQuantity;

public class Stock {

    public static void setProductQuantity(int quantidade) {
        if (quantidade > 0) {
            setQuantity(Product.getQuantity() + quantidade);
            System.out.println("Quantidade foi armazenada com sucesso!");
        } else {
            System.out.println("Não foi possível armazenar!");
        }
    }

    public static void getProductQuantity(int quantidade) {
        if (quantidade > 0) {
            setQuantity(Product.getQuantity() - quantidade);
            System.out.println("Quantidade foi retirada com sucesso!");
        } else {
            System.out.println("Não foi possível retirar!");
        }
    }
}
