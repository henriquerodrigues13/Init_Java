public class PJ extends Funcionario {
    public PJ(double salario) {
        super.setSalario(salario);
    }

    @Override
    public void calcularSalario() {
        System.out.println("O salario do PJ não tem desconto");
    }
}