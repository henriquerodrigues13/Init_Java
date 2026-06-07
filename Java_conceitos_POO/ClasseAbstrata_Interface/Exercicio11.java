import java.util.Scanner;

public class Exercicio11 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite seu especie de cachorro: ");
        String especie = input.nextLine();
        Cachorro cachorro = new Cachorro(especie);
        cachorro.fazerSom();
        boolean isAdestrador = cachorro.serAdestrador();
        if (isAdestrador){
            System.out.println("O cachorro foi adestrado");
        }
        Cobra cobra = new Cobra(especie);
        System.out.print("Digite seu especie de cobra: ");
        String cobraEspecie = input.nextLine();
        cobra.setEspecie(cobraEspecie);
        cobra.fazerSom();
        boolean isAdestrador2 = cobra.serAdestrador();
        if  (!isAdestrador2){
            System.out.println("A cobra nao foi adestrada");
        }
    }
}
