package memoria_Listas;

import java.util.Scanner;

public class matrizProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please insert row and columns");

        int M = sc.nextInt();
        int N = sc.nextInt();

        int[][] matriz = new int[M][N];
        for(int i = 0; i < M; i++){
            for (int j = 0; j < N; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        int X = sc.nextInt();

        for(int i = 0; i < M; i++){
            for (int j = 0; j < N; j++) {
                if (matriz[i][j] == X) {
                    System.out.println("Position " + i + "," + j + ":");
                    if (j > 0) { // Esquerda
                        System.out.println("Left: " + matriz[i][j - 1]);
                    }
                    if (i > 0) { // Acima
                        System.out.println("Up: " + matriz[i - 1][j]);
                    }
                    if (j < N - 1) { // Direita
                        System.out.println("Right: " + matriz[i][j + 1]);
                    }
                    if (i < M - 1) { // Abaixo
                        System.out.println("Down: " + matriz[i + 1][j]);
                    }
            }
        }

    }
}
}
