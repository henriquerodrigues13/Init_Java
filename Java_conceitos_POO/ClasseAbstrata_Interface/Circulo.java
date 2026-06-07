public class Circulo extends Forma {
    double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    double calculaArea(){
        return 3.14*(raio*raio);
    }
}
