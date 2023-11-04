//1. Crie uma classe Livro com os seguintes atributos
//título (String).
//autor (String).
//categoria (String).
//métodos



public class Livro {
    private String titulo;
    private String autor;
    private String categoria;
    //Construtor com todos os parâmetros.
    public Livro(String titulo, String autor, String categoria){
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
    }
    //Métodos getters e setters.
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    //Método 'exibirDetalhes()' que retorna uma String.
    public String toString() {
        return "Livro: "+ titulo+
                "\nautor = " + autor +
                "\ncategoria = " + categoria +
                "\n";
    }
}
