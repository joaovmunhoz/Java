//2. Crie uma classe CalculadoraSimples que implemente a inteface Calculadora e forneça as implementações.
public class SimpleCalculator implements Calculator {
    @Override
    public double add(double a, double b){
        return a+b;
    }
    @Override
    public double subtract(double a, double b){
        return a-b;
    }
    @Override
    public double multiply(double a, double b){
        return a*b;
    }
    @Override
    public double divide(double a, double b){
        return a/b;
    }
}
