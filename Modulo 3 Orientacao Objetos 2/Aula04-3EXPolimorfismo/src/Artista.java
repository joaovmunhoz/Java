//4. Crie uma classe Artista com um método chamado criarDesenho(). Esse método deve receber um
// objeto da interface Desenho como parâmetro e chamar o método desenhar() desse objeto.
public class Artista {
    public static void criarDesenho(Desenho desenho){// usando o static para nao precisar implementar na main
        desenho.desenhar();
    }
}
