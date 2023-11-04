import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
//1. Crie uma classe Curso, com os seguintes atributos: nome, professor, disciplinas e alunos.
public class Curso {
    private String nome;
    private String professor;
    private List<String> disciplinas;
    private Map<String, String> alunos;
    public Curso(String nome, String professor){
        this.nome = nome;
        this.professor = professor;
        this.disciplinas = new ArrayList<>();
        this.alunos = new HashMap<>();
    }

    //2. Crie métodos para adicionar e remover disciplina.
    public boolean verDis(String disciplina){
        return this.disciplinas.contains(disciplina);
    }
    public void addDis(String disciplina) {
        if (verDis(disciplina)){
            System.out.println("A disciplina "+ disciplina +" ja esta presente no curso\n");
        }else {
            this.disciplinas.add(disciplina);
            System.out.println("Disciplina "+ disciplina +" adicionada com sucesso\n");
        }
    }
    public void removeDis(String disciplina) {
        if (verDis(disciplina)){
            this.disciplinas.remove(disciplina);
            System.out.println("Disciplina "+ disciplina +" removida com sucesso\n");
        }else {
            System.out.println("A disciplina "+ disciplina +" ja esta presente no curso\n");
        }
    }
    //3. Crie métodos para adicionar aluno, verificar se aluno já está matriculado e remover aluno.

    public boolean verAl(String matricula){
        return this.alunos.containsKey(matricula);
    }
    public void addAl(String matricula, String aluno){
        if (this.verAl(matricula)){
            System.out.println("O aluno " + aluno + " ja esta neste curso\n");
        }else{
            this.alunos.put(matricula, aluno);
            System.out.println("Aluno "+ aluno +" matriculado no curso "+ this.nome +" com sucesso\n");
        }
    }
    public void removeAl(String matricula, String aluno){
        if (this.verAl(matricula)){
            this.alunos.remove(matricula, aluno);
            System.out.println("Aluno "+ aluno +" removido do curso "+ this.nome +" com sucesso\n");
        }else{
            System.out.println("O aluno " + aluno + " nao se encontra neste curso\n");
        }
    }

    @Override
    public String toString() {
        return "Curso:" +
                "\nnome='" + nome + '\'' +
                "\nprofessor='" + professor + '\'' +
                "\ndisciplinas=" + disciplinas +
                "\nalunos=" + alunos +
                "\n";
    }
}
