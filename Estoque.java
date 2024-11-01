import java.util.ArrayList;
import java.util.List;

public class Estoque {
    private List<Produto> produtos;

    public Estoque() {
        produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public Produto buscarProdutoPorId(int id) {
        for (Produto p : produtos) {
            if (p.getIdProduto() == id) {
                return p;
            }
        }
        return null;
    }

    public void listarProdutos() {
        if (produtos.isEmpty()) {
            System.out.println("Nenhum produto cadastrado.");
        } else {
            for (Produto p : produtos) {
                System.out.println(p);
            }
        }
    }

    public void entradaProduto(int idProduto, int quantidade) {
        Produto produto = buscarProdutoPorId(idProduto);
        if (produto != null) {
            produto.adicionarEstoque(quantidade);
            System.out.println("Entrada realizada com sucesso. Estoque atualizado.");
        } else {
            System.out.println("Produto não encontrado.");
        }
    }

    public void saidaProduto(int idProduto, int quantidade) {
        Produto produto = buscarProdutoPorId(idProduto);
        if (produto != null) {
            produto.removerEstoque(quantidade);
            System.out.println("Saída realizada com sucesso. Estoque atualizado.");
        } else {
            System.out.println("Produto não encontrado.");
        }
    }
}
