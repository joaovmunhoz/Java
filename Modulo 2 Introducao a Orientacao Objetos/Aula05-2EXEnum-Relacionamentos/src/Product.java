//2. Crie uma classe Produto com as propriedades: nome, preço e categoria.
public class Product {
    private String name;
    private double price;
    private ProductCategory category;

    public Product (String name, double price, ProductCategory category){//construtor
        this.name = name;
        this.price = price;
        this.category = category;
    }
    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", category=" + category +
                '}';
    }
}
