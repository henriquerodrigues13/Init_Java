public class ContaBancaria {
    private double  saldo = 0;
    private String titular;

    public void getTitular() {System.out.println("O titula da conta é: " + titular);}

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void getSaldo() {System.out.println("O saldo na conta é: " + saldo);}

    public void setSacar(double ValorSaque) {
        if (ValorSaque > this.saldo){System.out.println("O valor é maior que o saldo na conta");}
        else {this.saldo -= ValorSaque;}
    }

    public void depositar(double ValorDeposito){
        if (ValorDeposito > 0){this.saldo += ValorDeposito;}
    }
}
