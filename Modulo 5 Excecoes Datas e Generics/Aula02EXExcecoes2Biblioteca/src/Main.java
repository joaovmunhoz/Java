import java.util.ArrayList;
import java.util.List;
//Desenvolva um sistema para uma biblioteca. Neste sistema, os usuários podem pegar livros emprestados.
// No entanto, existem algumas regras:
//
//1.Um usuário só pode pegar até 5 livros por vez. (alterei para apenas 2)
//2.O livro deve estar disponível na biblioteca (não pode estar emprestado por outro usuário).
//passo-a-passo//
//1.Crie exceções personalizadas para os seguintes cenários:
//  LimiteLivrosExcedidoException: Quando um usuário tenta pegar mais de 5 livros.
//  LivroIndisponivelException: Quando o livro solicitado já está emprestado.
//2.Implemente a classe Biblioteca que deve conter:
//  Uma lista de livros disponíveis.
//  Um método emprestarLivro que aceita o nome do
//  livro e o empresta ao usuário, se possível. Caso contrário, lança uma das exceções personalizadas.
//3.Teste sua implementação no método main tentando emprestar livros e tratando as possíveis exceções.
public class Main {
    public static void main(String[] args) {
        List<String> livros = new ArrayList<>();
        livros.add("Harry Potter");
        livros.add("Jogos Vorazes");
        livros.add("Diario de um Banana");
        livros.add("1984");
        livros.add("Belligol");
        livros.add("Bellingham");
        livros.add("E Ele");
        livros.add("O Iluminado");
        Biblioteca biblioteca = new Biblioteca(livros);
        int qtdPedidos = 0;
        System.out.println(biblioteca);
        System.out.println();
        try {
            biblioteca.emprestarLivro("The Office", qtdPedidos);
            qtdPedidos +=1;// se não entrar em nenhuma exceção ele vai incrementar a quantidade de pedidos.
        }catch (LimiteDeLivrosExcedidoException e){
            System.out.println(e.getMessage());
        }catch (LivroIndisponivelException e){
            System.out.println(e.getMessage());
        }
        System.out.println(biblioteca);
        System.out.println();
        try {
            biblioteca.emprestarLivro("1984", qtdPedidos);
            qtdPedidos +=1;
        }catch (LimiteDeLivrosExcedidoException e){
            System.out.println(e.getMessage());
        }catch (LivroIndisponivelException e){
            System.out.println(e.getMessage());
        }
        System.out.println(biblioteca);
        System.out.println();
        try {
            biblioteca.emprestarLivro("1984", qtdPedidos);
            qtdPedidos +=1;
        }catch (LimiteDeLivrosExcedidoException e){
            System.out.println(e.getMessage());
        }catch (LivroIndisponivelException e){
            System.out.println(e.getMessage());
        }
        System.out.println(biblioteca);
        System.out.println();
        try {
            biblioteca.emprestarLivro("Harry Potter", qtdPedidos);
            qtdPedidos +=1;
        }catch (LimiteDeLivrosExcedidoException e){
            System.out.println(e.getMessage());
        }catch (LivroIndisponivelException e){
            System.out.println(e.getMessage());
        }
        System.out.println(biblioteca);
        System.out.println();
        try {
            biblioteca.emprestarLivro("Diario de um Banana", qtdPedidos);
            qtdPedidos +=1;
        }catch (LimiteDeLivrosExcedidoException e){
            System.out.println(e.getMessage());
        }catch (LivroIndisponivelException e){
            System.out.println(e.getMessage());
        }
        System.out.println(biblioteca);
        System.out.println();
    }
}