//2. Crie classes concretas: Carro e Moto
//Ambas devem herdar da classe Veículo
//Atributos específicos:
//Carro: qtdPortas (int)
//Moto: tipoFreio: (String)
//implemente o método 'exibirDetalhes()'
public class Moto extends Veiculo implements Promocao {
    //Atributos específicos:
    //Moto: tipoFreio: (String)
    private String tipoFreio;
    public Moto(String placa, String marca, String modelo, int ano, double preco, String tipoFreio) {
        super(placa, marca, modelo, ano, preco);
        this.tipoFreio = tipoFreio;
    }

    @Override
    public String exibirDetalhes() {
        return "------------------------------" +
                "\nMoto" +
                "\nPlaca: " + this.placa+
                "\nMarca: "+ this.marca+
                "\nModelo: "+ this.modelo+
                "\nAno: "+ this.ano+
                "\nValor: R$"+ this.preco+
                "\nTipo de freio: "+ this.tipoFreio+
                "\n------------------------------";
    }
    //4. Implementando a interface
    //Faça as classes Carro e Moto implementarem a interface Promocao.
    //Implemente o método aplicarDesconto de modo que carros recebam um desconto de no
    // máximo 10% e motos de no máximo 5% do preço original.

    @Override
    public void aplicarDesconto(double valor) {
        if (valor <= this.preco/20) {// caso o valor de desconto desejado seja menor que 1/20 (5%) do preco original
            this.preco -= valor;
            System.out.println("Preco atualizado para a promocao!");
        }else{
            System.out.println("Desconto acima do permitido (5% do valor original)");
        }
    }
}