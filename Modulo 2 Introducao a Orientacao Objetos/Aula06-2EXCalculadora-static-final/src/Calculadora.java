//1. Crie uma classe Calculadora
public class Calculadora {
    //2. Crie uma váriavel final e estática com o valor de Pi.
    public static final double PI = 3.1416;

    private double valor1;
    private double valor2;

    //3. Crie métodos estáticos para todas as operações matemáticas: soma, subtração, multiplicação e divisão.
    public static double soma (double valor1, double valor2){
        return valor1+valor2;
    }
    public static double subtracao (double valor1, double valor2){
        return valor1-valor2;
    }
    public static double multiplicacao (double valor1, double valor2){
        return valor1*valor2;
    }
    public static double divisao (double valor1, double valor2){
        return valor1/valor2;
    }
}
