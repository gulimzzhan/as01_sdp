import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public double calculateTotalPrice() {
        double total = 0;
        for (Product product : products) {
            total += product.getTotalPrice();
        }
        return total;
    }

    public void checkout(IPaymentStrategy paymentStrategy) {
        double total = calculateTotalPrice();
        paymentStrategy.processPayment(total);
    }

    public List<Product> getProducts() {
        return products;
    }
}
