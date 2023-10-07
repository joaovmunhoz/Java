//1. Crie uma enumeração CategoriaProduto com as opções: Eletrônico, vestuário, alimento e limpeza.
//2. Crie uma classe Produto com as propriedades: nome, preço e categoria.
//3. Na classe principal, instacie 4 produtos e imprima todos utilizando o método toString

public class Main {
    public static void main(String[] args) {//3. Na classe principal, instacie 4 produtos
        Product product1 = new Product("Apple", 2.75,ProductCategory.FOOD);
        Product product2 = new Product("Smart Watch", 215,ProductCategory.ELETRONIC);
        Product product3 = new Product("Gloves", 15,ProductCategory.CLOTHING);
        Product product4 = new Product("Washing Podwer", 8.50,ProductCategory.CLEANING);

        System.out.println(product1);//e imprima todos utilizando o método toString.
        System.out.println(product2);
        System.out.println(product3);
        System.out.println(product4);

    }
}