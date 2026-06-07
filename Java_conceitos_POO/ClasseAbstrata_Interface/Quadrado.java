public class Quadrado extends Forma{
    double base;

    public Quadrado(double base){
        this.base = base;
    }

    @Override
    double calculaArea(){
        return base*base;
    }
}
