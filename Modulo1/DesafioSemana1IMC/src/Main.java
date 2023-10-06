// CALCULADORA DE IMC EM JAVA
import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag;

        double peso;
        do {
            System.out.println("Digite seu peso (em kg): ");
            peso = sc.nextDouble();
            if (peso <= 0.0) {
                flag = true;
                System.out.println("Você deve digitar um peso positivo");
            } else {
                flag = false;
            }
        } while(flag);// FLAG DE ERRO PARA GARANTIR QUE NÃO SERÃO DIGITADOS NÚMEROS NEGATIVOS

        double altura;
        do {
            System.out.println("Digite altura (em cm): ");
            altura = sc.nextDouble() / 100.0;
            if (altura <= 0.0) {
                flag = true;
                System.out.println("Você deve digitar uma altura positiva");
            } else {
                flag = false;
            }
        } while(flag);

        double imc = peso / (altura * altura);// CÁLCULO DO IMC
        double pesoMin = 18.5 * altura * altura;// CÁLCULO DO PESO MÍNIMO PARA O IMC IDEAL
        double pesoMax = 24.9 * altura * altura;// CÁLCULO DO PESO MÁXIMO PARA O IMC IDEAL

        System.out.println("seu IMC é de " + imc + " e se classifica como:");
        if (imc < 18.5) {
            System.out.println("ABAIXO DO PESO IDEAL");
        } else if (imc < 24.9) {
            System.out.println("PESO IDEAL");
        } else if (imc < 29.9) {
            System.out.println("SOBREPESO");
        } else if (imc < 34.9) {
            System.out.println("OBESIDADE DE GRAU 1");
        } else if (imc < 39.9) {
            System.out.println("OBESIDADE DE GRAU 2");
        } else {
            System.out.println("OBESIDADE MORBIDA");
        }

        if (imc < 18.5) {// MENSAGEM PARA PESO ABAIXO DO IDEAL
            System.out.println("O peso ideal para sua altura está entre " + pesoMin + "kg e " + pesoMax + "kg, sugerimos" +
                    " que faça uma dieta e uma rotina de exercícios voltada para o ganho de massa.");
        } else if (imc >= 24.9){// MENSAGEM PARA PESO ACIMA DO IDEAL
            System.out.println("O peso ideal para sua altura está entre " + pesoMin + "kg e " + pesoMax + "kg, sugerimos" +
                    " que faça uma dieta e uma rotina de exercícios voltada para a perda de peso.");
        }

    }
}
