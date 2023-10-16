//1. Crie uma interface Calculadora com os seguintes métodos:
//somar(double a, double b)
//subtrair(double a, double b)
//multiplicar(double a, double b)
//dividir(double a, double b)
//2. Crie uma classe CalculadoraSimples que implemente a inteface Calculadora e forneça as implementações.
//3. Crie uma classe CalculadoraCientifica que implemente a inteface Calculadora e forneça as implementações. Além das
// implementações da interface, também deverá ter métodos específicos para calcular: raiz quadrada e exponenciação.
//4. No método main para testar as classes CalculadoraSimples e CalculadoraCientifica. No método main, crie
// objetos dessas classes e chame os métodos da interface Calculadora para realizar operações matemáticas.
//Saída esperada:
//
//--- Calculadora Simples ---
//Soma: 5.0
//Subtração: 1.0
//Multiplicação: 6.0
//Divisão: 2.0
//
//--- Calculadora Científica ---
//Potência: 16.0
//Raiz Quadrada: 3.0.
public class Main {
    public static void main(String[] args) {
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        CientifcCalculator cientifcCalculator = new CientifcCalculator();

        System.out.println("--- Simple Calculator ---");
        System.out.println("Sum: "+simpleCalculator.add(2,3));
        System.out.println("Subtraction: "+simpleCalculator.subtract(2,3));
        System.out.println("Multiplication: "+simpleCalculator.multiply(2,3));
        System.out.println("Division: "+simpleCalculator.divide(2,3));
        System.out.println("--- Cientific Calculator ---");
        System.out.println("Potentiation: "+cientifcCalculator.power(2,3));
        System.out.println("Square Root: "+cientifcCalculator.sqrtRoot(25));

    }
}