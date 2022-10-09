package src.Application;
import src.Entities.Candy;
import src.Entities.Drink;
import src.Entities.Magazine;
import src.Entities.Product;

import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    static Scanner keyboard = new Scanner(System.in);
    //static ArrayList<Product> newsstandStock;


    public static void main(String[] args) {

        int[] magazineStock = new int[100];
        int[] drinkStock = new int[40];
        int[] candyStock = new int[200];

        operations();
    }

    public static void operations() {

        System.out.println("""
                -----------------------------------------------------
                -----------Controle de estoque da Newsstand----------\s
                -----------------------------------------------------
                ******* Selecione a opção que deseja utilizar *******
                | 1 - Cadastrar produto.                             |
                | 2 - Consultar produto.                             |
                | 3 - Retirar produto.                               |
                | 4 - Incluir produto.                               |
                | 5 - Apagar produto.                                |
                | 6 - Sair.                                          |
                |----------------------------------------------------|""");

        int operation = keyboard.nextInt();

        switch (operation) {
            case 1:
                registerProduct();
                break;
            case 2:
                consultProduct();
                break;
            case 3:
                //includeProduct();
                break;
            case 4:
                //withdrawProduct();
                break;
            case 5:
                //deleteProduct();
                break;
            case 6:
                System.out.println("Encerrando sistema!");
                System.exit(0);
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
                |---------------------------------------------------|
                """);

        int productChoice;
        productChoice = keyboard.nextInt();

        if (productChoice == 1) {
            System.out.println("\nNome: ");
            String name = keyboard.next();

            System.out.println("\nValor: ");
            double unitValue = keyboard.nextDouble();

            System.out.println("\nEditora: ");
            String publishingCompany = keyboard.next();

            Magazine magazine = new Magazine(name, unitValue, publishingCompany);
            magazineStock.add(magazine);
            System.out.println("|--------- Produto registrado com sucesso! ---------|");
            operations();

        } else if (productChoice == 2) {
            System.out.println("\nNome: ");   //CODE NÃO ESQUECER DE TENTAR.
            String name = keyboard.next();

            System.out.println("\nValor: ");
            double unitValue = keyboard.nextDouble();

            System.out.println("\nTipo: ");
            String type = keyboard.next();

            Drink drink = new Drink(name, unitValue, type);
            drinkStock.add(drink);
            System.out.println("|--------- Produto registrado com sucesso! ---------|");
            operations();

        } else if (productChoice == 3){
            System.out.println("\nNome: ");   //CODE NÃO ESQUECER DE TENTAR.
            String name = keyboard.next();

            System.out.println("\nValor: ");
            double unitValue = keyboard.nextDouble();

            System.out.println("\nMarca: ");
            String brand = keyboard.next();

            Candy candy = new Candy(name, unitValue, brand);
            candyStock.add(candy);
            System.out.println("|--------- Produto registrado com sucesso! ---------|");
            operations();
        }
    }

    public static void consultProduct() {
        System.out.println("""
                |---------------------------------------------------|
                |************* O que deseja consultar? *************|:\s
                | 1 - Estoque de Revistas.                          |
                | 2 - Estoque de Bebidas.                           |
                | 3 - Estoque de Doces.                             |
                |---------------------------------------------------|
                """

        );
        int choiceProductStock = keyboard.nextInt();
        if (choiceProductStock == 1 && magazineStock.size() > 0) {
            for (Product magazine : magazineStock) {
                System.out.println(magazine);
            }
        } else {
            System.out.println("|------------ Não há produto cadastrado! -----------|");
            operations();
        }
        if (choiceProductStock == 2 && drinkStock.size() > 0) {
            for (Product drink : drinkStock) {
                System.out.println(drink);
            }
        } else {
            System.out.println("|------------ Não há produto cadastrado! -----------|");
            operations();

        }
        if (choiceProductStock == 3 && candyStock.size() > 0) {
            for (Product candy : candyStock) {
                System.out.println(candy);
            }
        } else {
            System.out.println("|------------ Não há produto cadastrado! -----------|");
            operations();
        }
        operations();
    }

    /*public static void includeProduct() {
        System.out.println("""
                qual produto deseja incluir:
                1 - Revista
                2 - Bebida
                3 - Doce""");
        int productNumber = keyboard.nextInt();
        if (productNumber == 1) {
         private static findProduct(int productNumber) {
        Magazine maganize = null;
        if(newsstandStock.size() > 0) {
            for(Magazine magazine : newsstandStock) {
                if (magazinee.getName() == productNumber) {
                    magazine = magazine;
                }
            }
        }
        }
        } */

}

