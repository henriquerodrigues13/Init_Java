import java.util.Scanner;

public class Exercicio10 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um valor: ");
        double valor = input.nextDouble();
        PagamentoPix p = new PagamentoPix(valor);
        p.processar(valor);
        PagamentoCartao pc = new PagamentoCartao(valor);
        pc.processar(valor);
    }
}
