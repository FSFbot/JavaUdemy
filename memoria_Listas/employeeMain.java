package memoria_Listas;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import java.util.List;
public class employeeMain {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Employee> list = new ArrayList<>();
        System.out.print("How many employees will be registred?");
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            System.out.println();
            System.out.println("Employee #" + (i + 1) + ": ");
            System.out.print("Id: ");
            Integer id = sc.nextInt();
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salary: ");
            Double salary = sc.nextDouble();

            Employee emp = new Employee(id, name, salary);
            list.add(emp);
        }
        System.out.printf("Enter the employee id that will have salary increase: ");
        int idsalary = sc.nextInt();
        Integer pos = position(list,idsalary);

        if(pos == null){
            System.out.println("This id does not exist! ");
        }else {
            System.out.print("Enter the percentage: ");
            double percentage = sc.nextDouble();
            list.get(pos).increaseSalary(percentage);
        }
        System.out.println();
        System.out.println("List of employee");

        for(Employee emp : list){
            System.out.println(emp);
        }

    }
    public static Integer position(List<Employee> list, int id){
        for(int i =0; i<list.size(); i++){
            if(list.get(i).getId() == id){
                return i;
            }
        }
        return null;
    }
}
