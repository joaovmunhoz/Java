//1. Crie uma classe chamada Aluno que representará um aluno com os seguintes atributos:
//nome (String): nome do aluno.
//idade (int): idade do aluno.
//matricula (String): número de matrícula do aluno.
//nota (double): nota média do aluno.
public class Student {
    private String name;
    private int age;
    private String registration;
    private double average;

//    2. Implemente os seguintes métodos
//    Construtor: crie um construtor que recebe o nome, idade, matrícula e nota do aluno e inicialize os atributos da classe.
    public Student(String name, int age, String registration, double average){
        this.name = name;
        this.age = age;
        this.registration = registration;
        this.average = average;

    }
//    Métodos getter e setter para cada atributo: permita o acesso e a modificação dos atributos encapsulados.


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    @Override
    public String toString() {//toString para mostrar as informacoes dos alunos
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", registration='" + registration + '\'' +
                ", average=" + average +
                "}\n";
    }
}
