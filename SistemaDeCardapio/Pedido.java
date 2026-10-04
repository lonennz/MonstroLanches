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
}
