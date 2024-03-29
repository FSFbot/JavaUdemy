import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class emplyeeMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Employee> employee = new ArrayList<>();

        System.out.print("Enter the number of employee: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Employee #" + (i + 1) + " data:");
            System.out.print("Employee is outsourced (y/n)? ");
            char ch = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Hours: ");
            int hours = sc.nextInt();
            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();

            if (ch == 'y') {
                System.out.print("Additional charge: ");
                double additionalCharge = sc.nextDouble();
                employee.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
            } else {
                employee.add(new Employee(name, hours, valuePerHour));
            }
        }
        System.out.println();
        System.out.println("PAYMENTS:");
        for (Employee emp : employee) {
            System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.payment()));
        }
        sc.close();
    }

}
