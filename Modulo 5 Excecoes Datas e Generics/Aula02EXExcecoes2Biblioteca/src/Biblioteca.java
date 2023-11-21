import java.util.List;

//2.Implemente a classe Biblioteca que deve conter:
//  Uma lista de livros disponíveis.
//  Um método emprestarLivro que aceita o nome do
//  livro e o empresta ao usuário, se possível. Caso contrário, lança uma das exceções personalizadas.
public class Biblioteca {
    private List<String> livros;
    public Biblioteca (List<String> livros){
        this.livros = livros;
    }
    public void emprestarLivro(String livro, int qtdPedidos) throws LimiteDeLivrosExcedidoException, LivroIndisponivelException{
        if(qtdPedidos >= 2){
            throw new LimiteDeLivrosExcedidoException("Maximo de 2 emprestimos por usuario de uma vez.\n");
        }else if (this.livros.contains(livro)){
            System.out.println("Livro emprestado com sucesso\n");
            this.livros.remove(livro);
        }else {
            throw  new LivroIndisponivelException();
        }
    }

    @Override
    public String toString() {
        return "Biblioteca{" +
                "livros=" + livros +
                '}';
    }
}
