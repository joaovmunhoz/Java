//6. Na classe Principal:
public class Main {
    public static void main(String[] args) {

//        Instancie alguns carros e motos.
        Veiculo carro1 = new Carro("JBL8E70", "Honda", "City", 2021, 123321, 4);
        Veiculo carro2 = new Carro("KDB8R74", "Hyundai", "Veloster", 2015, 93321, 3);
        Veiculo carro3 = new Carro("DER5I48", "Fiat", "Uno", 2017, 32000, 2);
        Veiculo moto1 = new Moto("JBF2E50", "Yamaha", "YZF-R1", 2020, 13321, "ABS");
        Veiculo moto2 = new Moto("YIT9P23", "Honda", "CB 650R", 2022, 25357, "freio a disco");
        Veiculo moto3 = new Moto("ABC1234", "Honda", "CB 650R", 2021, 25000, "freio a disco");

//        Crie uma instância da revenda.
        Revenda revenda = new Revenda();

//        Adicione os veículos à revenda.
        revenda.adicionarVeiculo(carro1);
        revenda.adicionarVeiculo(carro2);
        revenda.adicionarVeiculo(carro3);
        revenda.adicionarVeiculo(moto1);
        revenda.adicionarVeiculo(moto2);
        revenda.adicionarVeiculo(moto3);
        revenda.removerVeiculo(moto2.placa);
        revenda.adicionarVeiculo(moto3);

//        Liste todos os veículos.
        System.out.println(revenda.listarVeiculos());

//        Aplique um desconto em um carro e em uma moto.
        revenda.adicionarDesconto(carro3.placa, 5000);
        revenda.adicionarDesconto(carro3.placa, 3000);
        revenda.adicionarDesconto(moto1.placa, 200);

//        Liste novamente os veículos para verificar os novos preços.
        System.out.println(revenda.listarVeiculos());
    }
}