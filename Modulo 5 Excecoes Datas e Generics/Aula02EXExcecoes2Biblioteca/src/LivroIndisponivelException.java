//1.Crie exceções personalizadas para os seguintes cenários:
//  LivroIndisponivelException: Quando o livro solicitado já está emprestado.
public class LivroIndisponivelException extends Exception{
    public LivroIndisponivelException (){
        super("O livro solicitado ja esta locado por outro aluno ou nao esta disponivel em nossa biblioteca\n");
    }
}
