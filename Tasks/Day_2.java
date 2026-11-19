
/*
Question: Shopping Application Using Lambda Expressions

Write a Java program using Functional Interfaces and
Lambda Expressions to perform the following operations:

1. Display a shopping welcome message (no parameters).

2. Calculate 18% GST on a product price (one parameter).

3. Calculate the total bill using price and quantity
   (multiple parameters).

4. Calculate a 10% discount (single expression).

5. Calculate the final payable amount after applying
   a 10% discount (multiple statements).

Instructions:
1. Create appropriate Functional Interfaces.
2. Use Lambda Expressions for all five operations.
3. Execute the program and display the results.
*/

import java.util.function.*;

class Main {
    public static void main(String[] args) {

        // 1. Welcome Message
        Runnable welcome = () ->
            System.out.println("Welcome to Shopping Application!");

        welcome.run();

        // 2. Calculate 18% GST
        Function<Double, Double> gst =
            price -> price * 0.18;

        double price = 1000.0;

        System.out.println("Product Price: " + price);
        System.out.println("18% GST: " + gst.apply(price));

        // 3. Calculate Total Bill
        BiFunction<Double, Integer, Double> bill =
            (p, q) -> p * q;

        int quantity = 2;

        double total = bill.apply(price, quantity);

        System.out.println("Quantity: " + quantity);
        System.out.println("Total Bill: " + total);

        // 4. Calculate 10% Discount
        Function<Double, Double> discount =
            amount -> amount * 0.10;

        System.out.println("10% Discount: " +
            discount.apply(total));

        // 5. Final Payable Amount
        Function<Double, Double> payable = amount -> {
            double disc = amount * 0.10;
            double finalAmount = amount - disc;
            return finalAmount;
        };

        System.out.println("Final Payable Amount: " +
            payable.apply(total));
    }
}
