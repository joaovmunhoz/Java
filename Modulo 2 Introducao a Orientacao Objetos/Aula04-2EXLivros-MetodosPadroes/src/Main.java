public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Dom Casmurro","Machado de Assis",1899);// instanciando com parametros
        Book book2 = new Book("O Príncipe","Maquiavel",1532);
        Book book3 = new Book("Dom Casmurro","Machado de Assis",1899);

        //1. Imprima os 3 livros usando o método toString()
        System.out.println(book1);//imprimindo os livros com o metodo padrao toString
        System.out.println(book2);
        System.out.println(book3);

        //2. Imprima o resultado hash utilizando o método hashCode()
        System.out.println("BOOK 1 CODE: "+book1.hashCode());//imprimindo o hash code dos livros com o metodo padrao hashCode
        System.out.println("BOOK 2 CODE: "+book2.hashCode());
        System.out.println("BOOK 3 CODE: "+book3.hashCode());

        //3. Imprima o resultado a comparação do livro 1 com o livro 2 e do livro 1 com o livro 3
        System.out.println("COMPARING BOOK 1 WITH BOOK 2: "+book1.equals(book2));
        System.out.println("COMPARING BOOK 1 WITH BOOK 3: "+book1.equals(book3));

    }
}