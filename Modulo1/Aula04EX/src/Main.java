public class Main {
    public static void main(String[] args) {
        //1 teste de if e else if para saber se o número é negativo ou positivo
        int n = 12;
        if (n>0){
            System.out.println("POSITIVO");
        } else if (n<0) {
            System.out.println("NEGATIVO");
        } else {
            System.out.println("NUMERO ZERO");
        }
        //2 teste de switch case
        int opcao = 2;
        String nome;
        switch (opcao){
            case 1:
                nome = "Opção 1 selecionada";
                break;
            case 2:
                nome = "Opção 2 selecionada";
                break;
            case 3:
                nome = "Opção 3 selecionada";
                break;
            default:
                nome="opcao invalida";
                break;
        }
        System.out.println(nome);

        //3 teste de contagem regressiva com comando while
        int x=10;
        while (x>0){
            System.out.println(x);
            x--;
        }

        //4 teste de contagem progressiva com do while
        do{
            System.out.println(x);
            x++;
        } while (x<=5);

        //5 tabuada do 7 com for
        int j=7;
        for (int i=1;i<=10;i++){
            System.out.println(j+"x"+i+"="+(j*i));
        }
    }
}