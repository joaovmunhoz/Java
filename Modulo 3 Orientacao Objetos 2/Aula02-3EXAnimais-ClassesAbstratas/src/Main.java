//1. Crie uma classe abstrata Animal que contenha os seguintes atributos e métodos:
//nome (String): o nome do animal.
//idade (int): a idade do animal.
//som() (método abstrato): um método sem implementação que representará o som emitido pelo animal.
//2. Crie uma classe Cachorro que herde de Animal e implemente o método som(). O método som() da classe Cachorro
// deve imprimir "Au Au".
//3. Crie uma classe Gato que herde de Animal e implemente o método som(). O método som() da classe Gato
// deve imprimir "Miau".
//4. No método main para testar a hierarquia de animais. No método main, crie objetos das classes
// Cachorro e Gato e chame o método som() de cada objeto.
//Exemplo de saída esperada:
//
//Nome: Rex, Idade: 3 anos, Som: Au Au
//Nome: Mia, Idade: 2 anos, Som: Miau
public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Lady", 4);
        System.out.println(dog);
        System.out.println(dog.name + " says "+ Dog.SONG + " to you");
        dog.song();

        Cat cat = new Cat("Karma", 1);
        System.out.println(cat);
        System.out.println(cat.name + " says "+ Cat.SONG + " to you");
        cat.song();
    }
}