//Na classe principal:

public class Main {
    public static void main(String[] args) {
//        Instancie 8 objetos Aluno.

        Student student1 = new Student("Jonas", 17, "457", 9.7);
        Student student2 = new Student("Jack", 21, "467", 8.7);
        Student student3 = new Student("Humberto", 25, "459", 5.1);
        Student student4 = new Student("Geromel", 38, "3", 10);
        Student student5 = new Student("Walter", 32, "4", 9.4);
        Student student6 = new Student("Robertson", 27, "786", 7.4);
        Student student7 = new Student("Aberlindo", 81, "165", 6.7);
        Student student8 = new Student("Wilson", 36, "598", 5.9);

//        Instancie 2 objetos Turma.
        Class class1 = new Class(1);
        Class class2 = new Class(2);


//        Adicione 5 alunos em uma turma e 3 na outra.

        class1.insert(student1);
        class1.insert(student2);
        class1.insert(student3);
        class1.insert(student4);
        class1.insert(student5);
        class2.insert(student6);
        class2.insert(student7);
        class2.insert(student8);

        //Exiba informações das turmas (toString).
        System.out.println(class1);
        System.out.println(class2);

//        Exiba quantidade de alunos das turmas.
        System.out.println("Number of students in class 1: "+class1.numberStudents());
        System.out.println("Number of students in class 2: "+class2.numberStudents());

//        Exiba média das turmas;
        System.out.println("Class 1 average: "+class1.classAverage());
        System.out.println("Class 2 average: "+class2.classAverage());
    }
}