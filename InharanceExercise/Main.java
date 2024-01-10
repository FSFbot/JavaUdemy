package InharanceExercise;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        List<Produto> products = new ArrayList<>();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n ; i++){
            System.out.println("Product #" + i +"data: ");
            System.out.print("Common,used or imported(c/u/i)?");
            char type = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.println("Price");
            double price = sc.nextDouble();

            if(type == 'i'){
                System.out.print("Custom fee: ");
                double custoFee = sc.nextDouble();
                products.add(new ImportedProduct(name,price,custoFee));
            }else if(type == 'u'){
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                Date manufactureDate = sdf.parse(sc.next());
                products.add(new UsedProduct(name, price, manufactureDate));
            }else {
                products.add(new Produto(name,price));
            }
        }
    }
}
