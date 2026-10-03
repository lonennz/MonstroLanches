package SistemaDeCardapio;

public class Main {
    
    public static void main(String[] args) {
        
        Produto produto1 = new Produto("Hamburguer", 25.00, "Lanche");
        Produto produto2 = new Produto("Pizza", 35.00, "Pizza" );
        Produto produto3 = new Produto("Refrigerante", 7.00, "Bebida" );

        Cardapio cardapio = new Cardapio();

        cardapio.adicionarProduto(produto1);
        cardapio.adicionarProduto(produto2);
        cardapio.adicionarProduto(produto3);

        System.out.println("Produtos do cardapio");
        
        cardapio.listarProdutos();

        System.out.println("\n Buscando produto:");

        cardapio.buscarProduto("Pizza");

        System.out.println("\n Removendo produto.");

        cardapio.removerProduto("Pizza");

        System.out.println("\n Cardapio atualizado.");

        cardapio.listarProdutos();

    }
}

