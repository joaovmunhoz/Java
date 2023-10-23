//Utilizando um array ou matriz bidimensional, crie um jogo da velha.
//
//1	2 3
//4	5 6
//7	8 9
//No inicio o jogo deverá aparecer desta forma. Se o jogador 1 digitar 5 e o jogador 2 digitar 1. Deverá ficar assim:
//
//O	2 3
//4	X 6
//7	8 9
//Ao final do jogo imprimir quem foi o vencedor ou se deu velha.
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[][] matriz = new char[3][3];//inicializando a matriz
        //atribuindo valores para a matriz
        matriz[0][0] = '1';//linha 1
        matriz[0][1] = '2';
        matriz[0][2] = '3';

        matriz[1][0] = '4';//linha 2
        matriz[1][1] = '5';
        matriz[1][2] = '6';

        matriz[2][0] = '7';//linha 3
        matriz[2][1] = '8';
        matriz[2][2] = '9';

        System.out.println("----JOGO DA VELHA----");
        String jogo = "";
        for (int i = 0; i < 3; i++) {// coloca a matriz organizada em uma string
            jogo += matriz[i][0] + " " + matriz[i][1] + " " + matriz[i][2] + "\n";
        }
        int j1 = 0;
        int j2 = 0;
        boolean pode = false;
        boolean fim = false;
        int linhas = matriz.length;
        int colunas = matriz[0].length;
        int cont = 0;// contador para saber quantas jogadas foram feitas
        //jogada do jogador 1
        do {//do while para saber se o jogo acabou
            do {
                pode = false;
                System.out.println(jogo);
                System.out.println("Jogador 1 (X) escolha a posição que deseja jogar: ");
                j1 = scanner.nextInt();

                for (int i = 0; i < linhas; i++) {// compara para ver se a posicao digitada esta disponivel
                    for (int j = 0; j < colunas; j++) {
                        if (matriz[i][j] != 'X' && matriz[i][j] != 'O') {// analisando para saber se a posicao ja esta ocupada
                            int valorNumerico = matriz[i][j] - '0';// transformando o char em int para poder efetuar a comparacao
                            // utilizando o Unicode do da representacao desses numeros em char subtraidos pelo unicode de '0'
                            //para ter como resultado o proprio numero
                            if (valorNumerico == j1) {
                                pode = true;
                                matriz[i][j] = 'X';
                                jogo = "";// reinicia a variavel jogo
                                for (int k = 0; k < 3; k++) {// refaz a string da matriz, com o X posicionado
                                    jogo += matriz[k][0] + " " + matriz[k][1] + " " + matriz[k][2] + "\n";
                                }
                            }
                        }
                    }
                }
                if (!pode) {
                    System.out.println("O numero deve estar na tabela!\nEscolha outra posicao.\n");
                }
            } while (!pode);
            // conferindo se o jogo acabou
            for (int f = 0 ; f <3 ; f++){
                if (matriz[f][0] == 'X' && matriz[f][1] == 'X' && matriz[f][2] == 'X'//conferindo se houve vitoria por colunas
                || matriz[0][f] == 'X' && matriz[1][f] == 'X' && matriz[2][f] == 'X'){//conferindo se houve vitoria por linhas
                    System.out.println("-XXX- VITORIA DO JOGADOR 1 -XXX-");
                    fim = true;
                }
                if (matriz[0][0] == 'X' && matriz[1][1] == 'X' && matriz[2][2] == 'X'//conferindo se houve vitoria pela diagonal principal
                ||matriz[2][0] == 'X' && matriz[1][1] == 'X' && matriz[0][2] == 'X'){//conferindo se houve vitoria pela diagonal secundaria
                    System.out.println("-XXX- VITORIA DO JOGADOR 1 -XXX-");
                    fim = true;
                    break;
                }
            }
            if (!fim){
                cont ++;// acrescenta mais uma jogada
                if (cont == 9){// caso tenha passado a nona jogada nao tenha havido ganhador, entao deu empete
                    //pois todas as 9 posicoes ja foram preenchidas
                    System.out.println("DEU VELHA!!!");
                    fim = true;
                }//acrescentando mais uma jogada
            //jogada do jogador 2
            if (!fim) {
                do {
                    pode = false;
                    System.out.println(jogo);
                    System.out.println("Jogador 2 (O) escolha a posição que deseja jogar: ");
                    j2 = scanner.nextInt();

                    for (int i = 0; i < linhas; i++) {// compara para ver se a posicao digitada esta disponivel
                        for (int j = 0; j < colunas; j++) {
                            if (matriz[i][j] != 'X' && matriz[i][j] != 'O') {// analisando para saber se a posicao ja esta ocupada
                                int valorNumerico = matriz[i][j] - '0';// transformando o char em int para poder efetuar a comparacao
                                // utilizando o Unicode do da representacao desses numeros em char subtraidos pelo unicode de '0'
                                //para ter como resultado o proprio numero
                                if (valorNumerico == j2) {
                                    pode = true;
                                    matriz[i][j] = 'O';
                                    jogo = "";// reinicia a variavel jogo
                                    for (int k = 0; k < 3; k++) {// refaz a string da matriz, com o O posicionado
                                        jogo += matriz[k][0] + " " + matriz[k][1] + " " + matriz[k][2] + "\n";
                                    }
                                }
                            }
                        }
                    }
                    if (!pode) {
                        System.out.println("O numero deve estar na tabela!\nEscolha outra posicao.\n");
                    }
                } while (!pode);
            }
            // conferindo se o jogo acabou
            for (int f = 0 ; f <3 ; f++){
                if (matriz[f][0] == 'O' && matriz[f][1] == 'O' && matriz[f][2] == 'O'//conferindo se houve vitoria por colunas
                        || matriz[0][f] == 'O' && matriz[1][f] == 'O' && matriz[2][f] == 'O'){//conferindo se houve vitoria por linhas
                    System.out.println("-OOO- VITORIA DO JOGADOR 2 -OOO-");
                    fim = true;
                }
                if (matriz[0][0] == 'O' && matriz[1][1] == 'O' && matriz[2][2] == 'O'//conferindo se houve vitoria pela diagonal principal
                        ||matriz[2][0] == 'O' && matriz[1][1] == 'O' && matriz[0][2] == 'O'){//conferindo se houve vitoria pela diagonal secundaria
                    System.out.println("-OOO- VITORIA DO JOGADOR 2 -OOO-");
                    fim = true;
                    break;
                }
            }
            cont ++;// acrescenta mais uma jogada
            }
        }while(!fim);
        jogo = "";// reinicia a variavel jogo
        for (int k = 0; k < 3; k++) {// refaz a string da matriz
            jogo += matriz[k][0] + " " + matriz[k][1] + " " + matriz[k][2] + "\n";
        }
        System.out.println(jogo);
    }
}