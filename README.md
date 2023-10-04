Report: Singleton and Strategy Design Patterns in a Shopping Cart

1. Introduction to the Singleton Design Pattern

The Singleton design pattern is a creational pattern that ensures a class has only one instance and provides a global point of access to that instance. It's used when there must be exactly one instance of a class, and it needs to coordinate actions in a system. The Singleton pattern is valuable in scenarios such as managing configuration settings, logging, database connections, and thread pools, where a single point of control is required to avoid inconsistent behavior or resource overuse.

2. Introduction to the Strategy Design Pattern

The Strategy design pattern is a behavioral pattern that defines a family of algorithms, encapsulates each one, and makes them interchangeable. It allows a client to choose an algorithm from a family of algorithms at runtime. The Strategy pattern is used when you want to define a family of algorithms, encapsulate each one, and make them interchangeable. It promotes flexibility, allowing you to change the behavior of a class without altering its structure. Common use cases include sorting strategies, payment methods, and validation rules.

3. Running the Java Program

To run the Java program that demonstrates both the Singleton and Strategy design patterns for an online shopping cart, follow these steps:

Create a Java project or use a Java IDE.

Create the following classes in your project: Product, ShoppingCart, PaymentStrategy, CreditCardPayment, PayPalPayment, and Demo.

Copy the provided code for each class into its respective Java file.

Compile and run the Demo class.

The program will display a menu with options to add products to the shopping cart, view the cart's content, choose a payment strategy (Credit Card or PayPal), and complete the checkout process.

Follow the on-screen instructions to interact with the program. You can add products, view the cart's content, choose a payment strategy, and complete the checkout using the selected payment strategy.

4. Additional Insights

The Singleton pattern ensures that a class has only one instance and is thread-safe. In the shopping cart example, the Singleton pattern is demonstrated when creating a single instance of the ShoppingCart class, which allows adding products and completing the checkout.

The Strategy pattern allows the selection of different payment methods (Credit Card or PayPal) at runtime. It encapsulates payment strategies and makes them interchangeable. This flexibility is demonstrated in the program when users choose their preferred payment method.

By implementing the Strategy pattern, the code is open for extension. New payment methods can be added easily without modifying the existing code. Simply create a new payment strategy class that implements the PaymentStrategy interface and update the Demo class to accommodate the new payment method.

These design patterns, Singleton and Strategy, promote code reusability, maintainability, and flexibility. They ensure a single point of control for the shopping cart (Singleton) and allow different payment methods to be seamlessly integrated (Strategy).

In real-world applications, Singleton and Strategy patterns are widely used. Singleton is employed in scenarios requiring global access control, and Strategy is used to offer users options for handling various tasks, such as payment processing, sorting, and more.

In conclusion, understanding and applying design patterns is essential for creating robust and maintainable software systems. The Singleton and Strategy patterns, demonstrated in the shopping cart example, show how these patterns can be used to achieve specific design goals and make software systems more adaptable and extensible.
