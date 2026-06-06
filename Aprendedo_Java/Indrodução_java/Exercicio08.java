import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double salario = input.nextDouble();
        Clt clt = new Clt(salario);
        clt.calcularSalario();
        PJ pj = new PJ(salario);
        pj.calcularSalario();
    }
}
