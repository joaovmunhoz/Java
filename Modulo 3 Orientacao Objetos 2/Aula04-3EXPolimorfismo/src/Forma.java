//2. Crie uma classe abstrata Forma que implemente a interface Desenho e tenha um atributo cor (String).
public abstract class Forma implements Desenho{// Classe pai
    String cor;
    @Override
    public void desenhar() {
        System.out.println("Um desenho na cor "+ this.cor +" esta sendo feito");
    }
}
