import java.time.LocalDate;
//1. Crie uma classe Artigo com os atributos: titulo (string) e dataPublicacao em algum tipo de data
//
//2. Crie uma classe Jornal que tenha como atributo estático e final uma lista de Artigos.
//  Deverá ter no mínimo 7 artigos.
//  Os artigos deverão ter titulos e datas de publicações váriadas.
//3. Na classe Jornal, crie um método estatico que recebe dois parametros: de e até.
// Este método deverá retornar os artigos que se enquadrem nas data do parametro:
//  exemplo: public static List buscarPorData(TipoData de, TipoData até)
public class Main {
    public static void main(String[] args) {
        LocalDate de = LocalDate.of(2023, 3, 20);
        LocalDate ate = LocalDate.of(2023, 4, 5);
        System.out.println(Jornal.buscaPorData(de, ate));
    }

}