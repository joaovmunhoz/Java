//2. Crie uma classe Cachorro que herde de Animal e implemente o método som(). O método som() da classe Cachorro
// deve imprimir "Au Au".
public class Dog extends Animal{
    static final String SONG = "Au Au";

    public Dog(String name, int age){
        super(name,age);
    }
    void song(){
        System.out.println(SONG);
    }

    @Override
    public String toString() {
        String dog = "Dog {" +
                "name: " + name +
                ", age: ";
        if (this.age <= 1){
            dog += age + " year old" +
                    ", song: " + SONG +
                    "}";
        }else{
            dog += age + " years old" +
                    ", song: " + SONG +
                    "}";
        }
        return dog;
    }
}
