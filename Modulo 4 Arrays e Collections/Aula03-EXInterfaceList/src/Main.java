//1. Crie um programa Java que declare uma lista de nomes usando a interface List.

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> time = new ArrayList<>();

        //2.Adicione alguns nomes à lista.
        time.add("Curry");
        time.add("Klay Thompson");
        time.add("Jordan Poole");
        time.add("Draymond Green");
        time.add("Chris Paul");
        time.add("Kevon Looney");
        time.add("Wiggins");

        //3. Imprima a lista completa na tela.
        System.out.println(time);
        System.out.println();

        //4. Verifique se um nome específico está presente na lista.
        if (time.contains("Curry")) {
            System.out.println("Curry is in!");
            System.out.println();
        } else System.out.println("Curry is out");

        //5. Remova um nome da lista.
        time.remove("Jordan Poole");

        //6. Imprima a lista novamente para mostrar a mudança.
        System.out.println("--- LISTA ATUALIZADA ---");
        System.out.println(time);
        System.out.println();

        //7. Ordene a lista em ordem alfabética.
        time.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

        //8. Imprima a lista ordenada.
        System.out.println("--- LISTA ORDENADA ---");
        System.out.println(time);
        System.out.println();

        //9. Crie uma sublista contendo apenas alguns dos nomes.
        List<String> titulares = time.subList(0,6);

        //10. Imprima a sublista.
        System.out.println("--- ESCALACAO TITULAR DO GSW PARA HOJE ---");
        System.out.println(titulares);
        System.out.println();

        //11. Limpe a lista, removendo todos os elementos.
        time.clear();

        //12. Imprima a lista vazia para confirmar
        System.out.println(time);
    }
}