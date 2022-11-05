package src.Application;
import src.Entities.*;

import java.util.Objects;
import java.util.Scanner;
import java.util.ArrayList;
import static src.Login.SistemaLogin.Logar;
import static src.Loja.SystemShop.adicionarCarrinho;
import static src.Loja.SystemShop.shopInterface;

public class Main {
    static Scanner keyboard = new Scanner(System.in);
    public static ArrayList<Product> newsstandStock;
    public static ArrayList<Product> carrinho;
    public static Product product;


    public static void main(String[] args) {
        newsstandStock = new ArrayList<Product>();
        carrinho = new ArrayList<Product>();

        Logar();
    }

    public static void operations() {

        System.out.println("""
                -----------------------------------------------------
                -----------Controle de estoque da Newsstand----------\s
                -----------------------------------------------------
                ******* Selecione a opção que deseja utilizar *******
                | 1 - Cadastrar produto.                             |
                | 2 - Consultar produto.                             |
                | 3 - Adicionar quantidade.                          |
                | 4 - Retirar quantidade.                            |
                | 5 - Apagar produto.                                |
                | 6 - Sair.                                          |
                """);

        int operation = keyboard.nextInt();

        switch (operation) {
            case 1:
                registerProduct();
                break;
            case 2:
                consultProduct();
                break;
            case 3:
                includeProduct();
                break;
            case 4:
                withdrawProduct();
                break;
            case 5:
                deleteProduct();
                break;
            case 6:
                System.out.println("Encerrando sistema!");
                //System.exit(0);
                Logar();
            default:
                System.out.println("Opção inválida!");
                operations();
                break;
        }
    }

    public static void registerProduct() {

        System.out.println("""
                -----------------------------------------------------
                |********** Qual produto deseja registrar **********|\s
                |---------------------------------------------------|
                | 1 - Revista.                                      |\040\040\040\040\040\040\040\040
                | 2 - Bebida.                                       |
                | 3 - Doce.                                         |
                """);

        int productChoice;
        productChoice = keyboard.nextInt();

        if (productChoice == 1) {

            System.out.println("\nNome: ");
            String name = keyboard.next();

            System.out.println("\nValor: ");
            double unitValue = keyboard.nextDouble();

            int quantity = 0;

            System.out.println("\nEditora: ");
            String publishingCompany = keyboard.next();

            Magazine magazine = new Magazine(name, unitValue, quantity, publishingCompany);
            newsstandStock.add(magazine);
            System.out.println("|--------- Produto registrado com sucesso! ---------|");
            operations();

        } else if (productChoice == 2) {
            System.out.println("\nNome: ");   //CODE NÃO ESQUECER DE TENTAR.
            String name = keyboard.next();

            System.out.println("\nValor: ");
            double unitValue = keyboard.nextDouble();

            int quantity = 0;

            System.out.println("\nTipo: ");
            String type = keyboard.next();

            Drink drink = new Drink(name, unitValue, quantity, type);
            newsstandStock.add(drink);
            System.out.println("|--------- Produto registrado com sucesso! ---------|");
            operations();

        } else if (productChoice == 3) {
            System.out.println("\nNome: ");
            String name = keyboard.next();

            System.out.println("\nValor: ");
            double unitValue = keyboard.nextDouble();

            int quantity = 0;

            System.out.println("\nMarca: ");
            String brand = keyboard.next();

            Candy candy = new Candy(name, unitValue, quantity, brand);
            newsstandStock.add(candy);
            System.out.println("|--------- Produto registrado com sucesso! ---------|");
            operations();
        }
    }

    public static void consultProduct() {
        if (newsstandStock.size() > 0) {
            for (Product product : newsstandStock) {
                System.out.println(product);
            }
            operations();
        } else {
            System.out.println("Ainda não há produtos cadastrados!");
            operations();
        }
    }

    private static Product encontrarProduto(int codigoProduto) {
        if (newsstandStock.size() > 0) {
            for (Product productt : newsstandStock) {
                if (productt.getIdentifier() == codigoProduto) {
                    product = productt;
                }else{
                    System.out.println("Não foi possível encontrar o produto!");
                    operations();
                }
            }
        }
        return product;
    }
    public static void includeProduct() {
        System.out.println("Digite o código do produto que deseja armazenar a quantidade!");
        int codigoProduto = keyboard.nextInt();
        Product product = encontrarProduto(codigoProduto);

        if (product != null) {
            System.out.println("Digite a quantidade que deseja armazenar: ");
            int quantidade = keyboard.nextInt();
            Stock.setProductQuantity(quantidade);
        } else {
            System.out.println("Produto não encontrado");
        }
        operations();
    }

    public static void withdrawProduct(){
        System.out.println("Digite o código do produto que deseja retirar: ");
        int codigoProduto = keyboard.nextInt();
        Product product = encontrarProduto(codigoProduto);

        if (product != null) {
            System.out.println("Digite a quantidade que deseja retirar: ");
            int quantidade = keyboard.nextInt();
            Stock.getProductQuantity(quantidade);
        } else {
            System.out.println("Produto não encontrado");
        }
        operations();
    }
    public static void deleteProduct(){
        System.out.println("Digite o código do produto que deseja deletar: ");
        int codigoProduto = keyboard.nextInt();
        Product product = encontrarProduto(codigoProduto);
        newsstandStock.remove(product);
        System.out.println("Produto deletado com sucesso!");
        operations();
    }
}