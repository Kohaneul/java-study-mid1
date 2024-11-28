package collection.map.test.cart;

import java.util.Objects;

public class Product {
    private String name;
    private Integer price;

    public Product(String name, Integer price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        if (!Objects.equals(name, product.name)) return false;
        return Objects.equals(price, product.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,price);
    }

    @Override
    public String toString() {
        return "Product{" +
                "이름 : '" + name + '\'' +
                ", 가격 : " + price +
                '}';
    }
}
