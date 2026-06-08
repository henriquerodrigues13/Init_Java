import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        JogoDaVelha jogo = new JogoDaVelha();
        Scanner input = new Scanner(System.in);
        while (true){
            System.out.println("JOGO DA VELHA");
            System.out.println("1. inicia o jogo");
            System.out.println("2. finaliza o jogo");
            System.out.print("Digite um numero: ");
            int numero = input.nextInt();
            if (numero == 1){
                System.out.println("O jogo foi iniciado!");
                System.out.println("Digite 1 para X");
                System.out.print("OU digite 2 para O: ");
                int decisao = input.nextInt();
                if (decisao == 1){
                    boolean jogoGanho;
                    do {
                        for (int i = 0; i < 50; i++) System.out.println();
                        jogo.getMatriz();
                        System.out.println("Vez do jogador X, Digite a posição da jogada: ");
                        String posicaX = input.next();
                        jogoGanho = jogo.setMatrizX(posicaX);
                        if (jogoGanho){
                            System.out.println("X ganhou o jogo");
                            for (int i = 0; i < 50; i++) System.out.println();
                            break;
                        }
                        for (int i = 0; i < 50; i++) System.out.println();
                        jogo.getMatriz();
                        System.out.println("Vez do jogador O, Digite a posição da jogada: ");
                        String posicaoO = input.next();
                        jogoGanho = jogo.setMatrizO(posicaoO);
                        if (jogoGanho){
                            System.out.print("O ganhou o jogo");
                            for (int i = 0; i < 50; i++) System.out.println();
                            break;
                        }
                        for (int i = 0; i < 50; i++) System.out.println();
                        jogo.getMatriz();
                    } while (!jogoGanho);

                }
            }else if (numero == 2) {
                System.out.println("O jogo foi finalizado!");
                break;
            } else  {
                for (int i = 0; i < 50; i++) System.out.println();
                System.out.println("ERRO: numero invalido");

            }
        }
    }
}
