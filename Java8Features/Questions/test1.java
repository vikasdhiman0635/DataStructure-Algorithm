import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class test1 {

    public static void main(String[] args) {

        List<Product> p = new ArrayList<Product>();
        p.add(new Product(1, "apple", 2500));
        p.add(new Product(2, "watch", 25000));
        p.add(new Product(3, "Laptop", 200000));

        List<Product> newlist = p.stream()
                .map(product -> {
                    double finalPrice = product.getPrice() + (product.getPrice() * 0.1);
                    product.setPrice(finalPrice);
                    return product;
                })
                .collect(Collectors.toList());

        newlist.forEach(s -> System.out.println(s.getPrice()));

    }

}

class Product {
    int id;
    String name;
    double price;

    public Product(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double d) {
        this.price = d;
    }

}