package memoria_Listas;

import java.util.Scanner;

public class studentMain {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Student[] rooms = new Student[10];

        System.out.println("How many rooms will be rentend?");
        int numberOfStudents = sc.nextInt();

        for(int i = 1; i <= numberOfStudents; i++){
            System.out.println("Rent #" +i+":");
            System.out.println("Name: ");
            sc.nextLine();
            String name =sc.nextLine();
            System.out.println("Email: ");
            String email = sc.nextLine();

            int roomNumber;
            while(true){
                System.out.println("Room: ");
                roomNumber = sc.nextInt();
                if(rooms[roomNumber] != null){
                    System.out.println("Rooom"+ roomNumber+"is already rented. Choose another one.");
                }else{
                    break;
                }

            }
            rooms[roomNumber] = new Student(name, email);
            System.out.println("Busy rooms: ");
            for(int j =0; j < 10; j++){
                if (rooms[j] != null) {
                    System.out.println(j + ": " + rooms[j]);
                }
            }

        }
        
        sc.close();
    }

}
