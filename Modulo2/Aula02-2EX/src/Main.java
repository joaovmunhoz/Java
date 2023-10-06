import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Geromel",325568, 3);// PASSAGEM POR PARAMETRO
        System.out.println("aluno 1: "+aluno1.nome+
                "\n"+aluno1.matricula+"\nfaltas: "+aluno1.qtdFaltas);

        Aluno aluno2 = new Aluno();//PASSAGEM SEM PARAMETRO
        aluno2.nome = "Kannemann";
        aluno2.matricula = 4456454;
        aluno2.qtdFaltas = 4;
        System.out.println("aluno 2: "+aluno2.nome+
                "\n"+aluno2.matricula+"\nfaltas: "+aluno2.qtdFaltas);



        Scanner sc = new Scanner(System.in);
        Aluno aluno3 = new Aluno();//PASSAGEM SEM PARAMETRO FEITA PELO USUARIO
        int falta;
        boolean flag= false;// flag para garantir que a resposta será sim ou não

        System.out.println("digite o nome ");
        aluno3.nome = sc.nextLine();
        System.out.println("digite o numero de matricula ");
        aluno3.matricula = sc.nextLong();
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
            aluno3.maisFalta();
        }
        System.out.println("aluno 3: "+aluno3.nome+
                "\n"+aluno3.matricula+"\nfaltas: "+aluno3.qtdFaltas);
    }
}