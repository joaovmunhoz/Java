//1. Crie uma classe Calculadora
//2. Crie uma váriavel final e estática com o valor de Pi.
//3. Crie métodos estáticos para todas as operações matemáticas: soma, subtração, multiplicação e divisão.
//4. Use os métodos sem instanciar a classe
public class Main {
    public static void main(String[] args) {
        //4. Use os métodos sem instanciar a classe
        System.out.println(Calculadora.soma(19.03,20.17));// teste soma
        System.out.println(Calculadora.subtracao(523,352));// teste subtracao
        System.out.println(Calculadora.multiplicacao(1561.45,Calculadora.PI));// teste mutplicacao e da variavel fianl
        System.out.println(Calculadora.divisao(45.987,58.7));//teste divisao
    }
}