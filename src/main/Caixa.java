package main;

import java.util.ArrayList;
import java.util.List;

public class Caixa extends Componente {
    private List<Componente> componente;

    public Caixa(int id) {
        super(id);
        this.componente = new ArrayList<>();
    }

    public void addComponente(Componente componente) {
//        if(Float.compare(getPesoTotal() + componente.getPesoTotal(), 10) <= 0){
//            this.componente.add(componente);
//        }else{
//            Caixa caixa = new Caixa(super.getID()+1);
//            caixa.addComponente(componente);
//        }
        this.componente.add(componente);
    }

    @Override
    public String getInfProdutos() {
        String saida = "Pedido ID:" + this.getID() +"\n";
        for (Componente componentes : componente) {
            saida += componentes.getInfProdutos() +"\n";
        }
        saida += "Peso total: "+ String.valueOf(getPesoTotal()) + "\n";
        saida += "Valor total: "+ String.valueOf(getValorTotal()) + "\n";
        return saida;
    }

    @Override
    public float getPesoTotal() {
        float saida = 0;
        for (Componente componentes : componente) {
            saida += componentes.getPesoTotal();
        }
        return saida;
    }

    @Override
    public double getValorTotal() {
        double saida = 0;
        for (Componente componentes : componente) {
            saida += componentes.getValorTotal();
        }
        return saida;
    }

}
