public class Cat extends Animal {
    static final String SONG = "Miau";

    public Cat(String name, int age){
        super(name,age);
    }
    void song(){
        System.out.println(SONG);
    }

    @Override
    public String toString() {
        String cat = "Cat {" +
                "name: " + name +
                ", age: ";
                if (this.age <= 1){
                    cat += age + " year old" +
                            ", song: " + SONG +
                            "}";
                }else{
                    cat += age + " years old" +
                            ", song: " + SONG +
                            "}";
                }
        return cat;
    }
}
