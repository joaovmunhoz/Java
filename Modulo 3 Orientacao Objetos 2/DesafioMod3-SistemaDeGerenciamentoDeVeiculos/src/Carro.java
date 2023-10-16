//2. Crie classes concretas: Carro e Moto
//Ambas devem herdar da classe Veículo
//Atributos específicos:
//Carro: qtdPortas (int)
//Moto: tipoFreio: (String)
//implemente o método 'exibirDetalhes()'
public class Carro extends Veiculo implements Promocao{
    //Atributos específicos:
    //Carro: qtdPortas (int)
    private int qtdPortas;
    public Carro(String placa, String marca, String modelo, int ano, double preco, int qtdPortas) {
        super(placa, marca, modelo, ano, preco);
        this.qtdPortas = qtdPortas;
    }

    @Override
    public String exibirDetalhes() {
        return "------------------------------" +
                "\nCarro" +
                "\nPlaca: " + this.placa+
                "\nMarca: "+ this.marca+
                "\nModelo: "+ this.modelo+
                "\nAno: "+ this.ano+
                "\nValor: R$"+ this.preco+
                "\nQuantidade de portas: "+ this.qtdPortas+
                "\n------------------------------";
    }
    //4. Implementando a interface
    //Faça as classes Carro e Moto implementarem a interface Promocao.
    //Implemente o método aplicarDesconto de modo que carros recebam um desconto de no
    // máximo 10% e motos de no máximo 5% do preço original.

    @Override
    public void aplicarDesconto(double valor) {
        if (valor <= this.preco/10) {// caso o valor de desconto desejado seja menor que 1/10 (10%) do preco original
            this.preco -= valor;
            System.out.println("Preco atualizado para a promocao!");
        }else{
            System.out.println("Desconto acima do permitido (10% do valor original)");
        }
    }
}
