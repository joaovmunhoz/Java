import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //1. Trate este código:
        String numberStr = "123a";
        try {
            int number = Integer.parseInt(numberStr);
            System.out.println("Número: " + number);
        } catch (NumberFormatException e){
            System.out.println("Nao foi possivel realizar a operacao, pois a entrada inserida continha" +
                    " caracteres nao numericos, gerando o erro: " + e);
        }
        //2. Trate este código:
        Scanner sc = null;
        try {
            sc.nextInt();
        } catch(NullPointerException e){
            System.out.println("Nao foi possivel realizar a operacao, pois o objeto em questao nao foi inicializado ou" +
                    " foi definido como 'null', gerando o erro: " + e);
        }


    }
}