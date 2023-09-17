package poo;

public record Produto(int id, String nome, double preco) {

    @Override
    public String toString() {
        return "ID: " + id + ", Nome: " + nome + ", Preço: R$ " + preco;
    }
}


