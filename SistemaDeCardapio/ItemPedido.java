package SistemaDeCardapio;

public class ItemPedido {
    
    Produto produto;
    int quantidade;

    public ItemPedido(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }
}
