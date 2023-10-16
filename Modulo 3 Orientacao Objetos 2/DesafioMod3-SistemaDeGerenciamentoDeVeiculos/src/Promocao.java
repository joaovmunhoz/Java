//3. Crie uma Interface Promocao
//Método 'aplicarDesconto(double valor)': que receba o valor de desconto.
//4. Implementando a interface
//Faça as classes Carro e Moto implementarem a interface Promocao.
//Implemente o método aplicarDesconto de modo que carros recebam um desconto de no
// máximo 10% e motos de no máximo 5% do preço original.
public interface Promocao {
    void aplicarDesconto(double valor);
}
