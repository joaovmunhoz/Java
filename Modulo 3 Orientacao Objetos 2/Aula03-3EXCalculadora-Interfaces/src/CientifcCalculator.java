//3. Crie uma classe CalculadoraCientifica que implemente a inteface Calculadora e forneça as implementações. Além das
// implementações da interface, também deverá ter métodos específicos para calcular: raiz quadrada e exponenciação.
public class CientifcCalculator implements Calculator {
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
    public double power (double base, double expoent){
        return Math.pow(base, expoent);
    }
    public double sqrtRoot (double a){
        return Math.sqrt(a);
    }
}
