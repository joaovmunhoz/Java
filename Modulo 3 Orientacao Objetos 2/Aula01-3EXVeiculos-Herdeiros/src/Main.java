//1. Crie uma classe Veiculo que contenha os seguintes atributos:
//
//marca (String): a marca do veículo.
//modelo (String): o modelo do veículo.
//ano (int): o ano de fabricação do veículo. Além disso, crie um construtor que permita inicializar os atributos da classe Veiculo.
//2. Crie duas classes derivadas (subclasses) de Veiculo: Carro e Moto.
// Essas classes devem herdar os atributos da classe Veiculo.
//
//a classe Carro deve ter um campo extra: numPortas (int)
//a classe Moto deve ter um campo extra: cilindradas (int)
//3. Crie construtores com todos argumentos para as 3 classes.
//
//4. Crie o método toString() em todas as classes.
//
//5. Instancie um Veiculo, Carro e Moto e exiba a informaçao dos três nesse formato:

//--- Informações do Veículo ---
//Marca: Toyota
//Modelo: Corolla
//Ano: 2022
//--- Informações do Carro ---
//Marca: Toyota
//Modelo: Corolla
//Ano: 2022
//Número de Portas: 4
//--- Informações da Moto ---
//Marca: Honda
//Modelo: CB500
//Ano: 2021
//Cilindradas: 500
public class Main {
    public static void main(String[] args) {
        //5. Instancie um Veiculo, Carro e Moto e exiba a informaçao dos três nesse formato:
        Vehicle vehicle = new Vehicle("Mercedes", "T8", 2012);
        System.out.println(vehicle);
        Car car = new Car("Hyundai", "Veloster",2013, 3);
        System.out.println(car);
        Motorcycle motorcycle = new Motorcycle("Honda", "CB500",2021,500);
        System.out.println(motorcycle);
    }
}