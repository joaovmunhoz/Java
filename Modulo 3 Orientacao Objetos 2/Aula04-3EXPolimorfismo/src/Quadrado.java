//Crie duas classes filhas (subclasses) de Forma: Circulo e Quadrado. Implemente o método desenhar()
// em cada classe para imprimir a forma específica sendo desenhada e a cor.
public class Quadrado extends Forma {// classe filha
    public Quadrado (String cor){
        this.cor = cor;
    }

    @Override
    public void desenhar() {
        System.out.println("Um quadrado de cor "+ this.cor +" esta sendo desenhado");
    }
}