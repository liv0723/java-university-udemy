package udemy.university.section10;

import java.util.Random;
import java.util.Scanner;

public class Matrix {
    private static final int ROWS = 3;
    private static final int COLUMNS = 3;
    private static int[][] matrix;


    public static void main(String [] args) {
        //firstMatrix();
        diagonalSum();
    }

    public static void firstMatrix() {
        matrix = new int[ROWS][COLUMNS];

        fillMatrix(matrix);
        dataIntroduce(matrix);

        for (int i = 0; i < ROWS; i++) {
            System.out.println();
            for (int j = 0; j < COLUMNS; j++) {
                System.out.print(matrix[i][j] + " ");
            }
        }


    }

    public static void fillMatrix(int [][] matrix) {
        var random = new Random();
        for (int i =0; i < ROWS; i++) {
            for (int j = 0; j < COLUMNS; j++) {
                matrix[i][j] = random.nextInt(0, 10);
            }
        }
    }
    public static void dataIntroduce(int[][] matrix) {
        var scanner = new Scanner(System.in);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println("Intro the data: ");
                matrix[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }
    }

    public static void simplifiedSyntax() {
        //Matrix 2,2
        var firstMatrix = new int[][]{{,},{,}};
        int[][] secondMatrix = new int[][]{{,},{,}};
        int[][] threeMatrix = {{,},{,}};
    }

    public static void diagonalSum() {
        matrix = new int[ROWS][COLUMNS];
        fillMatrix(matrix);
        var sum = 0;

        for (int i = 0; i < ROWS; i++) {
            System.out.println();
            for (int j = 0; j < COLUMNS; j++) {
                System.out.print(matrix[i][j] + " ");
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (j == i) {
                    sum+= matrix[i][j];
                }
            }
        }
        System.out.println();
        System.out.println(sum);

    }


}
