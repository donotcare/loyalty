package loyalty.model;

public class Product {
    private final int id;
    private String name;
    private int price;
    private int bonus;

    public Product(int id) {
        this.id = id;
    }

    public Product setName(String name) {
        this.name = name;
        return this;
    }

    public Product setPrice(int price) {
        this.price = price;
        return this;
    }

    public Product setBonus(int bonus) {
        this.bonus = bonus;
        return this;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getBonus() {
        return bonus;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", bonus=" + bonus +
                '}';
    }
}
