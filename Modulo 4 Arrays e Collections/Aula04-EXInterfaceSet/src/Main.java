//Crie um programa Java que declare um conjunto de números usando a interface Set.
import java.util.Set;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();

        //Adicione alguns números ao conjunto, garantindo que não haja duplicatas.
        set.add(77);
        set.add(3);
        set.add(7);
        set.add(9);
        set.add(87);
        set.add(5);
        set.add(13);
        set.add(45);
        set.add(29);

        //Imprima o conjunto completo na tela.
        System.out.println(set);

        //Verifique se um número específico está presente no conjunto.
        if(set.contains(77)){
            System.out.println("77 esta incluso");
            System.out.println();
        }else System.out.println("Sem 77");

        //Remova um número do conjunto.
        set.remove(45);

        //Imprima o conjunto novamente para mostrar a mudança.
        System.out.println("ATUALIZANDO");
        System.out.println(set);
        System.out.println();

        //Adicione mais números ao conjunto.
        set.add(99);
        set.add(23);
        set.add(8);

        //Crie uma cópia do conjunto original.
        Set<Integer> copia = new HashSet<>(set);

        set.add(19);
        set.remove(23);

        //Use o método retainAll() para manter apenas os números presentes na cópia do conjunto.
        System.out.println("Lista antes do retainAll");
        System.out.println(set);
        set.retainAll(copia);

        //Imprima o conjunto após a operação retainAll().
        System.out.println("Lista apos o retainAll");
        System.out.println(set);
        System.out.println();

        //Limpe o conjunto, removendo todos os elementos.
        set.clear();
        copia.clear();

        //Imprima o conjunto vazio para confirmar.
        System.out.println("Set vazio"+set);
        System.out.println("Copia vazia"+copia);
    }
}