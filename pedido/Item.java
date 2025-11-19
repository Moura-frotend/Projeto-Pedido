package pedido;

public class Item {
   private int qde; 
   private Produto produto;

   public int getQde() {
    return qde;
   }
   public void setQde(int qde) {
    this.qde = qde;
   }
   public Produto getProduto() {
    return produto;
   }
   public void setProduto(Produto produto) {
    this.produto = produto;
   }
   public Float getValorTotal() {
        return qde * produto.getValor();
    }
}
