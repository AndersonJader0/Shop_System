package src.Loja;

import java.util.Scanner;
import src.Application.Main;
import src.Entities.Product;

import static src.Application.Main.carrinho;
import static src.Application.Main.product;
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

    static void pesquisarProduto() {
        System.out.println("Digite o nome que deseja encontrar: ");
        String nomeProduto = keyboard.next();
        Main.encontrarProdutoNome(nomeProduto);
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
            }
            shopInterface();
        }
    }
}