// TESTE DE MANIPULAÇÃO DE CLASSES E OBJETOS
//CONTADOR E INCREMENTADOR DE FALTAS
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Aluno aluno = new Aluno();
        int falta;
        boolean flag;

        System.out.println("digite o nome ");
        aluno.nome = sc.nextLine();
        System.out.println("digite o numero de matricula ");
        aluno.matricula = sc.nextInt();
        do {
            System.out.println(" ele faltou? 1-Sim 2-Nao");
            falta = sc.nextByte();
            if (falta != 1 && falta != 2) {
                System.out.println("Voce deve digitar apenas 1 para sim ou 2 para não.");
                flag = true;
            }else{
                flag = false;
            }
        }while(flag);
        if (falta==1){
            aluno.maisFalta();
        }
        System.out.println(aluno.nome+
        "\n"+aluno.matricula+"\nfaltas: "+aluno.qtdFaltas);
    }
}