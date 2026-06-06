import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite seu peso: ");
        double peso = input.nextDouble();
        System.out.println("Digite sua altura: ");
        double altura = input.nextDouble();
        double imc = peso / (altura * altura);
        if (imc < 18.5) {
            System.out.println("Abaixo do peso" );
        } else if (imc > 18.5 && imc < 25) {
            System.out.println("Peso normal" );
        }else if (imc > 25 && imc < 30) {
            System.out.println("Sobrepeso" );
        }else if (imc > 30 && imc < 35) {
            System.out.println("Obesidade grau I" );
        }else if (imc > 35 && imc < 40) {
            System.out.println("Obesidade grau II" );
        }else if (imc > 40) {
            System.out.println("Obesidade grau III" );
        }
    }
}
