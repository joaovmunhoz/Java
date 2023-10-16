//Crie duas classes filhas (subclasses) de Forma: Circulo e Quadrado. Implemente o método desenhar()
// em cada classe para imprimir a forma específica sendo desenhada e a cor.
public class Circulo extends Forma {// classe filha
    public Circulo(String cor) {
        super(cor);
    }


    @Override
    public void desenhar() {
        System.out.println("Um circulo de cor "+ this.cor +" esta sendo desenhado");
    }
}
