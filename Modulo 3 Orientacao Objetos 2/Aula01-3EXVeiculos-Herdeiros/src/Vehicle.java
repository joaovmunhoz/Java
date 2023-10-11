//1. Crie uma classe Veiculo que contenha os seguintes atributos:
public class Vehicle {
   //marca (String): a marca do veículo.
    protected String brand;
    //modelo (String): o modelo do veículo.
    protected String model;
    //ano (int): o ano de fabricação do veículo.
    protected int year;
// Além disso, crie um construtor que permita inicializar os atributos da classe Veiculo.
    public Vehicle (String brand, String model, int year){
        this.brand = brand;
        this.model = model;
        this.year = year;
    }
    //4. Crie o método toString() em todas as classes.
    @Override
    public String toString() {
        return getClass().getName()+" Informations:" +//getClass().getName() para aprecer o nome da classe quando reutilizar
                //esta mesma funcao em seus herdeiros
                "\n Brand: " + brand +
                "\n Model: " + model +
                "\n Year: " + year;
    }
}
