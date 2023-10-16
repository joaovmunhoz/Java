//1. Crie uma interface Desenho com um método abstrato desenhar().
//2. Crie uma classe abstrata Forma que implemente a interface Desenho e tenha um atributo cor (String).
//3. Crie duas classes filhas (subclasses) de Forma: Circulo e Quadrado. Implemente o método desenhar() em cada
// classe para imprimir a forma específica sendo desenhada e a cor.
//4. Crie uma classe Artista com um método chamado criarDesenho(). Esse método deve receber um
// objeto da interface Desenho como parâmetro e chamar o método desenhar() desse objeto.
//5. No método main, crie objetos das classes Circulo e Quadrado, passe-os como parâmetro
// para o método criarDesenho() da classe Artista.
public class Main {
    public static void main(String[] args) {
        Desenho circulo = new Circulo("Azul");
        Desenho quadrado = new Quadrado("Preto");
        Artista.criarDesenho(circulo);
        Artista.criarDesenho(quadrado);
    }
}