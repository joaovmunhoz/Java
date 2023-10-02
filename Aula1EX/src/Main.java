// CALCULA MÉDIA SIMPLES EM JAVA
public class Main {
    public static void main(String[] args){
        double nota1;
        double nota2;
        double media;

        final double PESO_NOTA = 0.5;

        nota1 = 7;
        nota2 = 9;

        media = (nota1 * PESO_NOTA)+(nota2 * PESO_NOTA);//CÁLCULO DA MÉDIA

        System.out.println("prova 1: " + nota1);
        System.out.println("prova 2: " + nota2);
        System.out.println("media final: " + media);
    }
}
