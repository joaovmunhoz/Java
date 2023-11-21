//1.Crie exceções personalizadas para os seguintes cenários:
//  LimiteLivrosExcedidoException: Quando um usuário tenta pegar mais de 5 livros.
public class LimiteDeLivrosExcedidoException extends Exception{
    public LimiteDeLivrosExcedidoException (String message){
        super(message);
    }
}
