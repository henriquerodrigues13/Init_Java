public class PagamentoCartao implements Pagavel{
    private double valor;

    public PagamentoCartao(double valor){
        this.valor = valor;
    }

    public void processar(double valor){
        System.out.println("A compra no cartão de " + valor + " foi recebida");
    }
}
