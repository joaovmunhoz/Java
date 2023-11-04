//3. Na classe Principal:

public class Main {
    public static void main(String[] args) {
        //Instancie livros.
        Livro livro1 = new Livro("Senhor dos Aneis","J.R.R. Tolkien", "Fantasia");
        Livro livro2 = new Livro("Harry Potter", "J.K. Rowling", "Fantasia");
        Livro livro3 = new Livro("A Revolução dos Bichos", "George Orwell", "Distopia");
        Livro livro4 = new Livro("Dom Quixote", "Miguel de Cervantes", "Clássico");
        Livro livro5 = new Livro("1984", "George Orwell", "Distopia");
        Livro livro6 = new Livro("Cem Anos de Solidão", "Gabriel García Márquez", "Realismo Mágico");
        //Crie uma instância da biblioteca.
        Biblioteca biblioteca = new Biblioteca();
        //Adicione os livros à biblioteca.
        biblioteca.addLivro(livro1);
        biblioteca.addLivro(livro2);
        biblioteca.addLivro(livro3);
        biblioteca.addLivro(livro4);
        biblioteca.addLivro(livro5);
        biblioteca.addLivro(livro6);
        //Liste todos os livros.
        System.out.println(biblioteca.listLivros());
        biblioteca.removeLivro(livro1);
        System.out.println(biblioteca.listLivros());
        //Liste todas as categorias.
        System.out.println(biblioteca.listCategorias());
        //Busque livros de uma categoria específica.
        biblioteca.buscarPorCategoria("Realismo Mágico");
    }
}