public class Exercicio09 {
    static void main(String[] args) {
        Circulo circulo = new Circulo(50);
        double area1 = circulo.calculaArea();
        System.out.println(area1);
        Quadrado quadrado = new Quadrado(50);
        double area2 = quadrado.calculaArea();
        System.out.println(area2);
    }
}
