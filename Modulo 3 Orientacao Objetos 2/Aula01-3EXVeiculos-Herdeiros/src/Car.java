////2. Crie duas classes derivadas (subclasses) de Veiculo: Carro e Moto.
//// Essas classes devem herdar os atributos da classe Veiculo.

public class Car extends Vehicle{
    // a classe Carro deve ter um campo extra: numPortas (int)
    private int numDoors;
    public Car(String brand, String model, int year, int numDoors){// herdando os atributos da classe pai
        super(brand,model,year);
        this.numDoors = numDoors;
    }
    //4. Crie o método toString() em todas as classes.
    @Override
    public String toString() {
        return super.toString() + //reutilizando a funcao da classe pai
                "\n Number of Doors: " + numDoors;
    }
}
