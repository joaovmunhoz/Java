public class Main {
    public static void main(String[] args) {
        //4. Na classe Principal, Crie um Objeto Curso que receba no construtor o nome do curso e o professor.
        Curso engComp = new Curso("Engenharia de Computacao", "Joel");
        //5. Depois adicione 3 disciplinas neste curso.
        engComp.addDis("Classificacao e Pesquisa de Dados");
        engComp.addDis("Arquitetura e Organizacao de Computadores");
        engComp.addDis("Calculo II");
        //6. Adicione 4 alunos neste curso.
        engComp.addAl("00325568", "Jorge Norris");
        engComp.addAl("03839517", "Renato Portaluppi");
        engComp.addAl("87878787", "Fausto Silva");
        engComp.addAl("03839517", "Renato Portaluppi");
        //7. Verifique se um aluno já está cadastrado com o método criado anteriormente.
        if (engComp.verAl("00325568")) {
            System.out.println("Ja matriculado");
        } else System.out.println("Nao matriculado");
        if (engComp.verAl("27893454")) {
            System.out.println("Ja matriculado");
        } else System.out.println("Nao matriculado");
        //8. Imprimir detalhe da turma.
        System.out.println(engComp);
        //9. Remova uma disciplina.
        engComp.removeDis("Calculo II");
        //10. Remova um aluno.
        engComp.removeAl("87878787", "Fauso Silva");
        //11. Imprimir detalhe da turma
        System.out.println(engComp);
    }
}