//2. Crie duas classes derivadas (subclasses) de Veiculo: Carro e Moto.
// Essas classes devem herdar os atributos da classe Veiculo.

public class Motorcycle extends Vehicle{
    //a classe Moto deve ter um campo extra: cilindradas (int)
    private int cc;
    public Motorcycle (String brand, String model, int year, int cc){// herdando os atributos da classe pai
        super(brand,model,year);
        this.cc = cc;
    }
    //4. Crie o método toString() em todas as classes.
    @Override
    public String toString() {
        return super.toString() +// reutilizando a funcao da classe pai
                "\n CC: " + cc;
    }
}