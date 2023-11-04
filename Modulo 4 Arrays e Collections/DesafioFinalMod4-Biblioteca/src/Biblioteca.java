import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//2. Crie uma classe Biblioteca: atributos
//acervo (List< Livro>).
//categorias (Set< String>).
// métodos
public class Biblioteca {
    private List<Livro> acervo;
    private Set<String> categorias;

    //adicionarLivro(Livro livro): para adicionar um livro na lista e sua categoria no conjunto.
    public Biblioteca() {
        this.acervo = new ArrayList<>(); // Inicialização da lista acervo
        this.categorias = new HashSet<>();
    }
    public void addLivro(Livro livro){
        this.acervo.add(livro);
        this.categorias.add(livro.getCategoria());
        System.out.println("Livro "+ livro.getTitulo() +" adicionado ao acervo com sucesso!\n");
    }
    //removerLivro(Livro livro): para remover um livro.
    public void removeLivro(Livro livro){
        this.acervo.remove(livro);
        System.out.println("Livro "+ livro.getTitulo() +" removido do acervo com sucesso!\n");
    }
    //listLivros(Livro livro): para listar todos os livros.
    public List<Livro> listLivros(){
        System.out.println("Lista de Livros da Biblioteca");
        return acervo;
    }
    //listarCategorias(): para listar todas as categorias de livros distintas.
    public Set<String> listCategorias(){
        System.out.println("Lista de categorias de livros da Biblioteca");
        return categorias;
    }
    //buscarPorCategoria(String categoria): para listar todos os livros de uma categoria
    public void buscarPorCategoria(String categoria){
        int qtdLiv = 0; // contador para saber quantos livros tem na cetegoria e também para saber se existe algum livro da categoria n acervo
        System.out.println("Categoria: "+ categoria);
        for(int i =0 ; i < this.acervo.size() ; i++ ) {
            if (acervo.get(i).getCategoria().equals(categoria)) {
                System.out.println(acervo.get(i).getTitulo());
                qtdLiv++;
            }
        }
        if (qtdLiv == 0){
            System.out.println("Nenhum livro encontrado na categoria "+ categoria +" em nosso acervo");
        }else{
            System.out.println("Um total de "+ qtdLiv +" livros da categoria "+ categoria +" foram encontrados em nossa biblioteca");
        }

    }
}
