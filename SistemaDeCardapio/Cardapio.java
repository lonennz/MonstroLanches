package SistemaDeCardapio;

import java.util.ArrayList;

public class Cardapio {
    
    ArrayList<Produto> produtos = new ArrayList<>();

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public void listarProdutos() {

        for (Produto produto : produtos) {

            System.out.println("Nome: " + produto.nome);
            System.out.println("Preço: " + produto.preco);
            System.out.println("Categoria: " + produto.categoria);
            System.out.println("-----------------");
        }
    }

    public void buscarProduto(String nome) {

        for (Produto produto : produtos) {

            if (produto.nome.equals(nome)) {
                System.out.println("Produto encontrado.");
                System.out.println("Nome: " + produto.nome);
                System.out.println("Preço: " + produto.preco);
                System.out.println("Categoria: " + produto.categoria);
                return;
            }
        }

        System.out.println("Produto não encontrado.");
    }

    public void removerProduto(String nome) {

        for (int i = 0; i < produtos.size(); i++) {
            
            if (produtos.get(i).nome.equals(nome)) {
                produtos.remove(i);
                System.out.println("Produto removido.");
                return;
        }
    }
        System.out.println("Produto não encontrado.");
}
}

