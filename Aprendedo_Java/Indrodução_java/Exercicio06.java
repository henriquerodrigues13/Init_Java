import java.util.Random;

public class Exercicio06 {
    public static void main(String[] args) {
        int[] array = new int[10];
        int maior = 0 , menor = 0 , soma = 0 ;
        Random random = new Random();
        //populando array
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                maior = array[i];
                menor = array[i];
            }else{
                if (maior < array[i]){
                    maior = array[i];
                }
                if (menor > array[i]){
                    menor = array[i];
                }
            }
            soma = soma + array[i];
        }
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if ((i + 1) == array.length) {
                System.out.print(array[i]);
                continue;
            }
            System.out.print(array[i] + " ,");

        }
        System.out.println("]");
        System.out.println("O maior valor é: " + maior);
        System.out.println("O menor valor é: " + menor);
        System.out.println("A media dos valores no array é: " + (double)soma/array.length);
    }
}
