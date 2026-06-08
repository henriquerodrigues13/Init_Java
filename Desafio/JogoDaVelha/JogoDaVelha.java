public class JogoDaVelha {
    private String [][] matriz = {
        {"1", "2", "3"},
        {"4", "5", "6"},
        {"7", "8", "9"}
    };
    private int contador = 0;

    public void getMatriz(){
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
                if(j == 2){
                    System.out.println(matriz[i][j]);
                    continue;
                }
                System.out.print(matriz[i][j] + " | ");
            }
            if(i != 2) {
                System.out.print("- - - - -");
            }
            System.out.println(" ");
        }
    }

    public boolean setMatrizX(String xNaPosicao) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j].equals(xNaPosicao)) {
                    matriz[i][j] = "X";
                    return condicaoDeVitoria();
                }
            }
        }
        System.out.println("Posição ja preenchida!");
        return false;
    }

    public boolean setMatrizO(String oNaPosicao){
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
                if(matriz[i][j].equals(oNaPosicao)){
                    matriz[i][j] = "O";
                    return condicaoDeVitoria();
                }
            }
        }
        System.out.println("Posição ja preenchida!");
        return false;
    }

    private void restContador(){
        this.contador = 0;
        restJogo();
    }

    private void restJogo(){
        matriz[0][0] = "1";
    }

    private boolean condicaoDeVitoria(){
        if((matriz[0][0].equals("X") && matriz[0][1].equals("X") && matriz[0][2].equals("X")) || (matriz[0][0].equals("O") && matriz[0][1].equals("O") && matriz[0][2].equals("O"))){
            restContador();
            System.out.print("O jogador ");
            return true;
        } else if ((matriz[1][0].equals("X") && matriz[1][1].equals("X") && matriz[1][2].equals("X")) || (matriz[1][0].equals("O") && matriz[1][1].equals("O") && matriz[1][2].equals("O"))){
            restContador();
            System.out.print("O jogador ");
            return true;
        } else if ((matriz[2][0].equals("X") && matriz[2][1].equals("X") && matriz[2][2].equals("X"))|| (matriz[2][0].equals("O") && matriz[2][1].equals("O") && matriz[2][2].equals("O"))){
            restContador();
            System.out.print("O jogador ");
            return true;
        } else if ((matriz[0][0].equals("X") && matriz[1][0].equals("X") && matriz[2][0].equals("X"))|| (matriz[0][0].equals("O") && matriz[1][0].equals("O") && matriz[2][0].equals("O"))){
            restContador();
            System.out.print("O jogador ");
            return true;
        } else if ((matriz[0][1].equals("X") && matriz[1][1].equals("X") && matriz[2][1].equals("X"))|| (matriz[0][1].equals("O") && matriz[1][1].equals("O") && matriz[2][1].equals("O"))){
            restContador();
            System.out.print("O jogador ");
            return true;
        } else if ((matriz[0][2].equals("X") && matriz[1][2].equals("X") && matriz[2][2].equals("X"))|| (matriz[0][2].equals("O") && matriz[1][2].equals("O") && matriz[2][2].equals("O"))){
            restContador();

            System.out.print("O jogador ");
            return true;
        } else if ((matriz[0][0].equals("X") && matriz[1][1].equals("X") && matriz[2][2].equals("X"))|| (matriz[0][0].equals("O") && matriz[1][1].equals("O") && matriz[2][2].equals("O"))){
            restContador();
            System.out.print("O jogador ");
            return true;
        } else if ((matriz[0][2].equals("X") && matriz[1][1].equals("X") && matriz[2][0].equals("X"))|| (matriz[0][2].equals("O") && matriz[1][1].equals("O") && matriz[2][0].equals("O"))) {
            restContador();
            System.out.print("O jogador ");
            return true;
        } else {
            this.contador++;
            if(this.contador == 9){
                this.contador = 0;
                System.out.println("O jogo empatou");
                return true;
            }
            return false;
        }
    }
}
