import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add product to cart");
            System.out.println("2. View cart content");
            System.out.println("3. Checkout");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Product name: ");
                    String name = scanner.next();
                    System.out.print("Price: ");
                    double price = scanner.nextDouble();
                    System.out.print("Quantity: ");
                    int quantity = scanner.nextInt();
                    cart.addProduct(new Product(name, price, quantity));
                    break;
                case 2:
                    System.out.println("Cart content:");
                    for (Product product : cart.getProducts()) {
                        System.out.println(product.getName() + " - $" + product.getTotalPrice());
                    }
                    break;
                case 3:
                    IPaymentStrategy paymentStrategy;
                    System.out.print("Enter credit card number: ");
                    String cardNumber = scanner.next();
                    paymentStrategy = new CreditCardPayment(cardNumber);

                    cart.checkout(paymentStrategy);
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}