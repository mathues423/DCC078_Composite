package main;

public class Produto extends Componente {//Folha
    private double preco;
    private float peso;
    private String descricao;

    public Produto(double preco, float peso, String descricao, int ID) {
        super(ID);
        this.preco = preco;
        this.peso = peso;
        this.descricao = descricao;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String getInfProdutos() {
        return "Inf: " + this.descricao;
    }

    @Override
    public float getPesoTotal() {
        return peso;
    }

    @Override
    public double getValorTotal() {
        return preco;
    }
}
