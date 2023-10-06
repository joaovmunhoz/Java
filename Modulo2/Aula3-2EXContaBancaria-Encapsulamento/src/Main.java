public class Main {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria("00325568", "Jorge", 7000);
        ContaBancaria conta2 = new ContaBancaria("00329968", "Jonas", 2134.23);

        conta1.deposita(2000);
        conta1.saca(1000);
        conta2.saca(456.37);
        conta2.saca(4555);

        System.out.println("Conta: "+ conta1.getNumeroDaConta() +"\nNome do Titular: "+ conta1.getTitular() +"\nSaldo: R$"+ conta1.getSaldo());
        System.out.println("Conta: "+ conta2.getNumeroDaConta() +"\nNome do Titular: "+ conta2.getTitular() +"\nSaldo: R$"+ conta2.getSaldo());

    }
}
