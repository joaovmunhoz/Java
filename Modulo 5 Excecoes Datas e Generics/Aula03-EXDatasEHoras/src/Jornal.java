import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

//2. Crie uma classe Jornal que tenha como atributo estático e final uma lista de Artigos.
//  Deverá ter no mínimo 7 artigos.
//  Os artigos deverão ter titulos e datas de publicações váriadas.
//3. Na classe Jornal, crie um método estatico que recebe dois parametros: de e até.
// Este método deverá retornar os artigos que se enquadrem nas data do parametro:
//  exemplo: public static List buscarPorData(TipoData de, TipoData até)
public class Jornal {
    private static final List<Artigo> ARTIGOS = new ArrayList<>();
    static {
        ARTIGOS.add(new Artigo("Rodada 1 do Brasileirao", LocalDate.of(2023, 3, 12)));
        ARTIGOS.add(new Artigo("Rodada 2 do Brasileirao", LocalDate.of(2023, 3, 19)));
        ARTIGOS.add(new Artigo("Rodada 3 do Brasileirao", LocalDate.of(2023, 3, 25)));
        ARTIGOS.add(new Artigo("Rodada 4 do Brasileirao", LocalDate.of(2023, 3, 30)));
        ARTIGOS.add(new Artigo("Rodada 5 do Brasileirao", LocalDate.of(2023, 4, 7)));
        ARTIGOS.add(new Artigo("Rodada 7 do Brasileirao", LocalDate.of(2023, 4, 14)));

    }
    public static List<Artigo> getARTIGOS() {
        return ARTIGOS;
    }

    public static List<Artigo> buscaPorData(LocalDate de, LocalDate ate){
        List<Artigo> dentroDoPeriodo = new ArrayList<>();

        for(Artigo artigo : ARTIGOS){
            if (!artigo.getDataPublicacao().isBefore(de) && !artigo.getDataPublicacao().isAfter(ate)){
                dentroDoPeriodo.add(artigo);
            }
        }
        return dentroDoPeriodo;
    }

}
