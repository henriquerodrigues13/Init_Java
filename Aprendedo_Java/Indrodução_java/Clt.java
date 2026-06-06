public class Clt extends Funcionario{
    public Clt(double salario){
        super.setSalario(salario);
    }

    @Override
    public void calcularSalario(){
        System.out.println("O salario do CLT ja é com desconto " + getSalario() * 0.90);
    }
}