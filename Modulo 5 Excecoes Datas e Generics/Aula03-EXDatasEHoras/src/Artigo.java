import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

//1. Crie uma classe Artigo com os atributos: titulo (string) e dataPublicacao em algum tipo de data
public class Artigo {
    private String titulo;
    private LocalDate dataPublicacao;

    public Artigo(String titulo, LocalDate dataPublicacao){
        this.titulo = titulo;
        this.dataPublicacao = dataPublicacao;
    }
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return "Artigo{" +
                "titulo='" + titulo + '\'' +
                ", dataPublicacao=" + dataPublicacao.format(formatter) +
                '}';
    }

    public LocalDate getDataPublicacao() {
        return dataPublicacao;
    }
}
