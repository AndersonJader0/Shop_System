package src.Loja;

import java.util.Objects;
import java.util.Scanner;
import src.Application.Main;
import src.Entities.Product;
import src.Entities.Stock;

import static src.Application.Main.*;
import static src.Login.SistemaLogin.Logar;

public interface SystemShop {

    Scanner keyboard = new Scanner(System.in);

    public static void shopInterface() {


        System.out.println("""
                -----------------------------------------------------
                -------------Interface Loja da Newsstand-------------\s
                -----------------------------------------------------
                ******* Selecione a opção que deseja utilizar *******
                | 1 - Pesquisar produto.                             |
                | 2 - Consultar produtos.                            |
                | 3 - Ver Perfil.                                    |
                | 4 - Consultar Carrinho.                            |
                | 5 - Sair.                                          |
                """);
        int clientOperation = keyboard.nextInt();

        switch (clientOperation) {
            case 1:
                pesquisarProduto();
                break;
            case 2:
                //consultarProdutos();
                adicionarCarrinho(product);
                break;
            case 3:
                //verPerfil();
                break;
            case 4:
                consultarCarrinho();
                break;
            case 5:
                System.out.println("Encerrando sistema!");
                Logar();
            default:
                System.out.println("Opção inválida!");
                shopInterface();
                break;
        }
    }
    static Product pesquisarProduto() {
        System.out.println("Digite o nome que deseja encontrar: ");
        String nomeProduto = keyboard.next();
            for (Product producttt : newsstandStock) {
                if (Objects.equals(producttt.getName(),nomeProduto)) {
                    product = producttt;
                    System.out.println(product);
                    System.out.println("Gostaria de adicionar o produto no carrinho? S/N");
                    char option = keyboard.next().charAt(0);
                    if(Objects.equals(option, 'S')){
                        adicionarCarrinho(product);
                    }
                }else{
                    System.out.println("Não foi possível encontrar o produto!");
                    shopInterface();
                }
            }
        return product;
    }

    static void adicionarCarrinho(Product product) {
        carrinho.add(Main.product);
        System.out.println("Produto adicionado ao carrinho com sucesso!");
        shopInterface();
    }

    static void consultarCarrinho() {
        if (carrinho.size() > 0) {
            for (Product product : carrinho) {
                System.out.println(product);
                System.out.println("");
                System.out.println("""
                        Gostaria de finalizar a compra?
                        1 - sim
                        2 - não""");
                int finalizarCompra = keyboard.nextInt();
                if(finalizarCompra == 1){
                    System.out.println("-------------------------"
                    + "\nValor: " + product.getUnitValue()
                    + "\nCartão de crédito: "
                    );
                    int cartaoCredito = keyboard.nextInt();
                    System.out.println("""
                        Digite o mês de expiração do cartão:
                        1 - Janeiro
                        2 - Fevereiro
                        3 - Março
                        4 - Abril
                        5 - Maio
                        6 - Junho
                        7 - Julho
                        8 - Agosto
                        9 - Setembro
                        10 - Outubro
                        11 - Novembro
                        12 - Dezembro""");
                    int mesExpiracao = keyboard.nextInt();

                    System.out.println("Ano expiração: ");
                    int anoExpiracao = keyboard.nextInt();
                    System.out.println("Cv: ");
                    int cv = keyboard.nextInt();


                    System.out.println("A compra foi realizada com sucesso!");

                    if (product != null) {
                        int quantidade = 1;
                        Stock.getProductQuantity(quantidade);
                    } else {
                        System.out.println("Produto não encontrado");
                    }
                    shopInterface();
                }
                }
            }
            shopInterface();
        }
    }
