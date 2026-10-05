package SistemaDeCardapio;

import java.util.ArrayList;

public class Pedido {
    
    ArrayList<ItemPedido> itens = new ArrayList<>();

    public void adicionarProduto(Produto produto, int quantidade) {
        ItemPedido item = new ItemPedido(produto, quantidade);

        itens.add(item);

    }

    public double calcularTotal() {

        double total = 0;

        for (ItemPedido item : itens) {
            total = total + (item.produto.preco * item.quantidade);
        }

        return total;
    }

    public void listarPedido() {

        for (ItemPedido item : itens) {
        
            double subtotal = item.produto.preco * item.quantidade;

            System.out.println("Produto: " + item.produto.preco);
            System.out.println("Quantidade: " + item.quantidade);
            System.out.println("Subtotal: " + subtotal);
            System.out.println("-------------------");
        }
    }

    public void alterarQuantidade(String nomeProduto, int novaQuantidade) {

        if (novaQuantidade <= 0) {
                
                System.out.println("A quantidade deve ser maior que zero.");
                return;
            }

        for (ItemPedido item : itens) {

            if (item.produto.nome.equals(nomeProduto)) {
               
                item.quantidade = novaQuantidade;

                System.out.println("Quantidade alterada.");
                return;
            }
        }

        System.out.println("Produto não encontrado no pedido.");
    }
}
