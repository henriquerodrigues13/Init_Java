import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Todos os numeros primo ate: ");
        int numero = input.nextInt();
        for (int i = 2; i <= numero; i++) {
            int divisores = 0;
            for (int j = 2; j <= i; j++) {
                if (i % j == 0){
                    divisores++;
                }
                if (divisores == 2){
                    break;
                }
            }
            if (divisores == 2){
                continue;
            }else {
                System.out.println("O numero: " + i + " é primo");
            }
        }
    }
}
