package main;

import java.util.List;

public class Pedido {
    private Componente pedido;

    public void setPedido(Componente pedido){
        this.pedido = pedido;
    }

    public String getInformacaoPedido() {
        if (this.pedido == null) {
            throw new NullPointerException("Pedido sem produtos");
        }
        return this.pedido.getInfProdutos();
    }

}
