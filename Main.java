import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Product product = new Product();

        System.out.println("Enter product data");
        System.out.println("Name");
        product.name = sc.nextLine();
        System.out.println("Price: ");
        product.price = sc.nextDouble();
        System.out.println("Quantity in stock: ");
        product.quantity = sc.nextInt();

        System.out.println();

        System.out.println("Product data:  "+ product);
        System.out.println("Total value in stock: "+ product.totalValueStock());

        System.out.println();

        System.out.println("Enter the number of product to add in stock: ");

        int quantity = sc.nextInt();
        product.addToStock(quantity);

        System.out.println();
        System.out.println("Update data: "+ product.totalValueStock());
        System.out.println("Enter the number of product to remove from stock: ");
        int quantityToRemove = sc.nextInt();
        product.removeFromStock(quantityToRemove);

        System.out.println();
        System.out.println("Update data: " + product);
        System.out.println("Total value in stock: "+ product.totalValueStock());
        sc.close();
    }
}
