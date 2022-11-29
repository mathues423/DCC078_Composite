package main;

public abstract class Componente {
    private int ID;

    public Componente(int ID) {
        this.ID = ID;
    }

    public int getID() {
        return ID;
    }

    public abstract String getInfProdutos();
    public abstract float getPesoTotal();
    public abstract double getValorTotal();
}
