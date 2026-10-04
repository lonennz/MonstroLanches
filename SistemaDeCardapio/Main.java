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

        System.out.println("\n==== CARDÁPIO ====");
        cardapio.listarProdutos();

        System.out.println("\n==== BUSCAR PRODUTO ====");
        cardapio.buscarProduto("Pizza");

        System.out.println("\n==== REMOVER PRODUTO ====");
        cardapio.removerProduto("Pizza");

        System.out.println("\n==== CARDÁPIO ATUALIZADO ====");

        cardapio.listarProdutos();

        Pedido pedido = new Pedido();

        pedido.adicionarProduto(produto1, 3);
        pedido.adicionarProduto(produto3, 2);

        double total = pedido.calcularTotal();

        System.out.println("\n==== PEDIDO ====");
        System.out.println("Total: R$ " + total);

    }
}

