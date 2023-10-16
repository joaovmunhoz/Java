//1. Crie uma classe abstrata Animal que contenha os seguintes atributos e métodos:
abstract class Animal {
    //nome (String): o nome do animal.
    protected String name;
//idade (int): a idade do animal.
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //som() (método abstrato): um método sem implementação que representará o som emitido pelo animal.
    abstract void song();
}
