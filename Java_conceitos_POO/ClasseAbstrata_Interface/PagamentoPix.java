public class PagamentoPix implements Pagavel{
    private double valor;

    public PagamentoPix(double valor){
        this.valor = valor;
    }

    public void processar(double valor){
        System.out.println("O pix no valor de " + valor + " foi recebido");
    }
}
