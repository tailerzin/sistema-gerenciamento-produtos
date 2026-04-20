package Sistema_Produtos;

import java.util.Scanner;

public class Main {
	
public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	ProdutoService service = new ProdutoService();
	
	System.out.println("Bem-vindo ao sistema de gerenciamento de produtos!");
	System.out.println("\nEscolha uma opção:");
 int opcao = 0;
 
 while (opcao != 5) {
	 System.out.println("1. Adicionar produto");
	 System.out.println("2. Listar produtos");
	 System.out.println("3. Pesquisar produto por nome");
	 System.out.println("4. Remover produto por ID");
	 System.out.println("5. Sair");
	 opcao = entrada.nextInt();
	 entrada.nextLine();
 switch (opcao) {
 case 1:
	 System.out.println("Digite o nome do produto:");
	 String nome = entrada.nextLine();
	 System.out.println("Digite o preço do produto:");
	 double preco = entrada.nextDouble();
	 entrada.nextLine();
service.adicionarProduto(new Produto(nome, preco));
	 break;
 case 2:
	 System.out.println("-----Lista de produtos-----\n");
	 service.listarProdutos();
	 break;
 case 3:
	 System.out.println("Digite o nome do produto para pesquisar:");
	 String pesquisarNome = entrada.nextLine();
	 service.pesquisarProdutos(pesquisarNome);
	 break;
 case 4:
	 System.out.println("Digite o ID do produto para remover:");
	 int removerId = entrada.nextInt();
	 entrada.nextLine();
	 service.removerProduto(removerId);
	 break;
 case 5:
	 System.out.println("Saindo...");
	 break;
	 default:
		 System.out.println("Opção inválida. Tente novamente.\n");
		 break;
 }
 }
	
}
}
