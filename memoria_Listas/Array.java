package memoria_Listas;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        try{
            System.out.println("Input: ");
            int N = sc.nextInt();
            double[] heights = new double[N];

            for(int i = 0; i < N; i++){
                heights[i] = sc.nextDouble();
            }
            double sum = 0.0;
            for(int i = 0; i < N; i++){
                sum += heights[i];
            }
            double average = sum / N;
            System.out.printf("Output:\nAVERAGE HEIGHT = %.2f\n", average);
        }catch (InputMismatchException e){
            System.out.println("Invalid input. Please enter a number.");
        }finally {
            sc.close();
        }
    }
}
