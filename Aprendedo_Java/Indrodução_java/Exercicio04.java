import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        int numero1 = input.nextInt();
        System.out.println("Digite o segundo numero: ");
        int numero2 = input.nextInt();
        System.out.println("Digite o terceiro numero: ");
        int numero3 = input.nextInt();
        if (numero1 > numero2) {
            if (numero1 > numero3) {
                System.out.println("O maior numero é: " + numero1);
            }else{
                System.out.println("O maior numero é: " + numero3);
            }
        }else if (numero3 > numero1) {
            if (numero3 > numero2) {
                System.out.println("O maior numero é: " + numero3);
            }else {
                System.out.println("O maior numero é: " + numero2);
            }
        }else if (numero2 > numero3) {
            if (numero2 > numero1) {
                System.out.println("O maior numero é : " + numero2);
            }else {
                System.out.println("O maior numero é: " + numero1);
            }
        }
    }
}
