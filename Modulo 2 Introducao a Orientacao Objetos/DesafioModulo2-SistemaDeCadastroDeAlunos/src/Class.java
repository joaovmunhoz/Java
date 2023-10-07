//3. Crie uma classe chamada Turma que representa uma turma de 5 alunos. Essa classe deve conter os seguintes atributos:
//        identificador (int): identificador do aluno.
//        aluno01 (Aluno): aluno 1.
//        aluno02 (Aluno): aluno 2.
//        aluno03 (Aluno): aluno 3.
//        aluno04 (Aluno): aluno 4.
//        aluno05 (Aluno): aluno 5.
public class Class {
    private int id;
    private Student student1;
    private Student student2;
    private Student student3;
    private Student student4;
    private Student student5;

    public Class(int id){
        this.id = id;
    }

    int numberStudents=0;// variável para contar quntos alunos terão na turma

//    4. Implemente os seguintes métodos:
//    Método para inserir alunos
    public void insert(Student student) {
        if (this.student1 == null) {
            this.student1 = student;// caso não tenha anda o student1, o novo aluno inserido sera o student1 e assim por diante
            numberStudents++;// caso o aluno exista, vai adicionando a soma do numero de alunos na turma
        } else if (this.student2 == null) {
            this.student2 = student;
            numberStudents++;
        }else if (this.student3 == null){
            this.student3 = student;
            numberStudents++;
        }else if (this.student4 == null){
            this.student4 = student;
            numberStudents++;
        }else if (this.student5 == null){
            this.student5 = student;
            numberStudents++;
        }else System.out.println("THE CLASS "+ id +" IS FULL");
    }
//    Método que retorne a quantidade alunos.
    public int numberStudents(){
        return numberStudents;
    }
//    Método que retorne a média da turma.
    public double classAverage(){
        double average = 0;
        if (this.student1 != null){
            average += this.student1.getAverage();// caso o aluno exista, vai adicionando a media dele
        }
        if (this.student2 != null){
            average += this.student2.getAverage();
        }
        if (this.student3 != null) {
            average += this.student3.getAverage();
        }
        if (this.student4 != null){
            average += this.student4.getAverage();
        }
        if (this.student5 != null){
            average += this.student5.getAverage();
        }

        return average/numberStudents;
    }
//    Método toString.


    @Override
    public String toString() {
        String c = "Class: \n" +
                "Class id:" + id+"\n";
                if (this.student1 != null) {
                    c += this.student1;// caso o aluno exista, vai adicionando a string as informacoes dele
                    // ja formatados com o toString em Student.java
                }if (this.student2 != null) {
                    c += this.student2;
                }if (this.student3 != null) {
                    c += this.student3;
                }if (this.student4 != null) {
                    c += this.student4;
                }if (this.student5 != null) {
                    c += this.student5;
                }
        return c;
    }

}
