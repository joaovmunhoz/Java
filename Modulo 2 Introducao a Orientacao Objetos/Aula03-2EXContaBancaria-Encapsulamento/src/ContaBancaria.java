public class ContaBancaria {
    private String numeroDaConta;
    private String titular;
    private double saldo;

    public ContaBancaria(String numeroDaConta, String titular, double saldo){
        this.numeroDaConta =  numeroDaConta;
        this.titular = titular;
        this.saldo = saldo;

    }
    public String getNumeroDaConta() {
        return numeroDaConta;
    }

    public String getTitular() {
        return titular;
    }


    public double getSaldo() {
        return this.saldo;
    }


    public void deposita(double valor){
        this.saldo += valor;
        System.out.println("Seu saldo atual é de: R$"+getSaldo());
    }

    public void saca (double valor){
        if (valor <= this.saldo){
            this.saldo -= valor;
        }else {
            System.out.println("SALDO INSUFICIENTE");
            return;
        }
        System.out.println("Seu saldo atual é de: R$"+getSaldo());
    }
}
