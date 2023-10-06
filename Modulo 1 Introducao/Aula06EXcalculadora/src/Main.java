// CALCULADORA SIMLES (ADIÇÃO, SUBTRAÇÃO, MULTIPLICAÇÃO E DIVISÃO) EM JAVA
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continuar = true;
        double resultado = 0;

        do {
            System.out.println("Digite o primeiro Numero: ");
            int n1 = sc.nextInt();
            System.out.println("Digite o segundo Numero: ");
            int n2 = sc.nextInt();
            System.out.println("""
                    Qual operacao deve ser feita?
                    1-Soma
                    2-Subtracao
                    3-Multiplicacao
                    4-Divisao\s""");
            int opcao = sc.nextInt();
            switch (opcao){
                case 1:
                    resultado= n1+n2;
                    break;
                case 2:
                    resultado= n1-n2;
                    break;
                case 3:
                    resultado= n1*n2;
                    break;
                case 4:
                    resultado= (double) n1 /n2;
                    break;
                default:
                    System.out.println("Opcao digitada invalida");
                    break;
            }
            System.out.println("Resultado da operação: "+ resultado);
            boolean erro = true;
            do {
                System.out.println("Deseja continuar? 1- Sim 2- Nao");
                int c = sc.nextInt();
                if (c == 2) {
                    continuar = false;
                    erro = false;
                } else if (c == 1) {
                    erro=false;
                }else{
                    System.out.println("Voce deve digitar 1 para sim ou 2 para nao");
                }
            }while (erro);
        }while (continuar);
        System.out.println("Ate mais!");
    }
}