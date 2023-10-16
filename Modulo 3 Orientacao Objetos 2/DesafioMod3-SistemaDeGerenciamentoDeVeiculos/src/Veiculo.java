//Crie uma classe abstrata Veiculo com os seguintes atributos
public abstract class Veiculo implements Promocao{

    //        placa (String).
    protected String placa;

    //        marca (String).
    protected String marca;

    //        modelo (String).
    protected String modelo;

    //        ano (int).
    protected int ano;

    //        preço (double).
    protected double preco;
    //        métodos

    //        Construtor com todos os parâmetros.

    public Veiculo(String placa, String marca, String modelo, int ano, double preco) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.preco = preco;
    }

    //        Métodos getters e setters.

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }



    //        Método abstrato 'exibirDetalhes()' que retorna uma String.
    public abstract String exibirDetalhes();
}
