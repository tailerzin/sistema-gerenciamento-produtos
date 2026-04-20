package Sistema_Produtos;

public class Produto {

    private String nome;
    private double preco;
    private int id;
    private static int contadorId = 1;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.setPreco(preco);
        this.id = contadorId++;
    }

    @Override
    public String toString() {
        return "Produto: " + nome +
               "\nPreço: R$" + preco +
               "\nID: " + id;
    }

    public String getNome() {
        return nome;
    }

    public int getId() {
        return id;
    }

    public double getPreco() {
        return preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        if (preco < 0) {
            throw new IllegalArgumentException("Preço não pode ser negativo.");
        }
        this.preco = preco;
    }
}