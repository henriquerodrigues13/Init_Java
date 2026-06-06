public class Exercicio07 {
    public static void main(String[] args) {
        ContaBancaria contaPessoal = new ContaBancaria();
        contaPessoal.depositar(500);
        contaPessoal.getSaldo();
        contaPessoal.setTitular("henrique costa rodrigues");
        contaPessoal.getTitular();
        contaPessoal.setSacar(400);
        contaPessoal.getSaldo();
        contaPessoal.setSacar(200);
    }
}

