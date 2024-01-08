package enums;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class exempleMain {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf =  new SimpleDateFormat("dd/MM/yyyy");
        sdf.setLenient(false);

        System.out.println("Enter client data: ");
        System.out.printf("Name: ");
        String clientName = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.printf("Birth date (DD/MM/YYYY)");
        Date birthDate  = sdf.parse(sc.nextLine());
        Client client = new Client(clientName, email, birthDate);

        System.out.println("Enter order data: ");
        System.out.println("Status: ");
        OrderStatus status = OrderStatus.valueOf(sc.nextLine().toUpperCase());
        Order order =  new Order(new Date(), status, client);

        System.out.printf("How many items to this order? ");
        int n = sc.nextInt();
        sc.nextLine();

        for(int i = 1; i <= n; i++){
            System.out.println("Enter #" + i + "Item data: ");
            System.out.print("Product name: ");
            String productName = sc.nextLine();
            System.out.print("Product Price: ");
            double productPrice = sc.nextDouble();
            System.out.print("Quantity: ");
            int quantity = sc.nextInt();
            sc.nextLine();

            Product product = new Product(productName, productPrice);
            OrderItem orderItem = new OrderItem(quantity, productPrice, product); // This line is updated
            order.addItem(orderItem);
        }
        System.out.println();
        System.out.println("Order Summary:");
        System.out.println(order);
    }
}
