import java.util.Scanner;

public class SistemaEstoque {
    public static void main(String[] args) {
        Estoque estoque = new Estoque();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("=== Sistema de Estoque ===");
            System.out.println("1. Cadastrar Produto");
            System.out.println("2. Entrada de Produto");
            System.out.println("3. Saída de Produto");
            System.out.println("4. Listar Produtos");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("ID do Produto: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // Limpar buffer
                    System.out.print("Nome do Produto: ");
                    String nome = scanner.nextLine();
                    System.out.print("Preço do Produto: ");
                    double preco = scanner.nextDouble();
                    System.out.print("Quantidade inicial em estoque: ");
                    int quantidade = scanner.nextInt();

                    Produto produto = new Produto(id, nome, preco, quantidade);
                    estoque.adicionarProduto(produto);
                    System.out.println("Produto cadastrado com sucesso!");
                    break;

                case 2:
                    System.out.print("ID do Produto para entrada: ");
                    int idEntrada = scanner.nextInt();
                    System.out.print("Quantidade a adicionar: ");
                    int quantidadeEntrada = scanner.nextInt();
                    estoque.entradaProduto(idEntrada, quantidadeEntrada);
                    break;

                case 3:
                    System.out.print("ID do Produto para saída: ");
                    int idSaida = scanner.nextInt();
                    System.out.print("Quantidade a remover: ");
                    int quantidadeSaida = scanner.nextInt();
                    estoque.saidaProduto(idSaida, quantidadeSaida);
                    break;

                case 4:
                    estoque.listarProdutos();
                    break;

                case 5:
                    System.out.println("Encerrando o sistema...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 5);

        scanner.close();
    }
}
