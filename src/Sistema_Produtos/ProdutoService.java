package Sistema_Produtos;

import java.util.ArrayList;
import java.util.List;

public class ProdutoService {

	private List<Produto> produtos = new ArrayList<>();
	
	public void adicionarProduto(Produto produto) {
		produtos.add(produto);
	}
	
	public void listarProdutos() {
	    if (produtos.isEmpty()) {
	        System.out.println("Nenhum produto cadastrado.");
	        return;
	    }

	    for (Produto p : produtos) {
	        System.out.println(p);
	        System.out.println("-------------------");
	    }
	}
	
	public void pesquisarProdutos(String nome) {
	boolean encontrado = false;
		for (Produto p : produtos) {
			if (p.getNome().toLowerCase().contains(nome.toLowerCase())) {
				encontrado = true;
				System.out.println(p);
				}
			}
		if (!encontrado) {
			System.out.println("Produto " + nome + " não encontrado.");
		}
	}
	
	public void removerProduto(int id) {
	boolean removido = produtos.removeIf(p -> p.getId() == id);
	if(removido) {
		System.out.println("Produto com ID " + id + " removido com sucesso.");
	} else {
		System.out.println("Produto com ID " + id + " não encontrado.");
	}
	}
	
}
