package MainApp;

import pedido.Pedido;
import pedido.Cliente;
import pedido.Item;
import pedido.Produto;

public class Main {
    public static void pedido(String[] args) {
        Pedido p1 = criarPedido();
        System.out.println(p1.getCliente().getNome());
    }

    public static Pedido criarPedido(){
        Cliente murakami = new Cliente();
        murakami.setId(1l);
        murakami.setNome("Murakami");

        // Produtos
        Produto coca = new Produto();
        coca.setNome("Coca Original");
        coca.setValor(5.50f);
        Produto hamburguete = new Produto();
        hamburguete.setNome("Hamburguete duplo");
        hamburguete.setValor(9f);

        // Itens
        Item item1 = new Item();
        item1.setProduto(coca);
        item1.setQde(1);
        Item item2 = new Item();
        item2.setProduto(hamburguete);
        item2.setQde(2);

        // Pedido
        Pedido pedido1 = new Pedido();
        pedido1.setId(1);
        pedido1.setCliente(murakami);
        pedido1.addItem(item1);
        pedido1.addItem(item2);
        return pedido1;

    }
}
 


 

