package teste;

import main.Caixa;
import main.Pedido;
import main.Produto;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PedidoTest {
    @Test
    void caminhoFeliz(){
        Produto p1 = new Produto(10.90, (float) 9.410,"P1", 1);
        Produto p2 = new Produto(5.50, (float) 5.1, "P2", 1);

        Caixa c1 = new Caixa(1);
        c1.addComponente(p1);
        c1.addComponente(p2);

        Pedido pedido = new Pedido();
        pedido.setPedido(c1);

        assertEquals("Pedido ID:1\n"+
        "Inf: P1\n"+
        "Inf: P2\n"+
        "Peso total: 14.51\n"+
        "Valor total: 16.4\n", pedido.getInformacaoPedido());
    }

    @Test
    void deveRetornarFaltaItem(){
        try {
            Pedido pedido = new Pedido();
            pedido.getInformacaoPedido();
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Pedido sem produtos", e.getMessage());
        }
    }
}
