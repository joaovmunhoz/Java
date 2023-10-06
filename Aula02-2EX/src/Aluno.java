public class Aluno {
    String nome;
    long matricula;
    int qtdFaltas;

    public void maisFalta() {//FUNÇÃO QUE INCREMENTA A QUANTIDADE DE FALTAS QUANDO FOR CHAMADA
        qtdFaltas++;
    }
    public Aluno (String nome, long matricula, int qtdFaltas){// construtor com todos os parametros possiveis
        this.nome = nome;
        this.matricula = matricula;
        this.qtdFaltas = qtdFaltas;
    }

    public Aluno(){//CONSTRUTOR SEM PARAMETRO

    }
}