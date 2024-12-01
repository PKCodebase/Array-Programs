package array.com;

import java.util.Scanner;

public class Twodarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the number of rows:");
        int rows = sc.nextInt();
        System.out.println("Input the number of columns:");
        int columns = sc.nextInt();
        int number[][] = new int[rows][columns];
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<columns;j++)
            {
                number[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<columns;j++)
            {
                System.out.print(number[i][j]+" ");
            }
            System.out.println();
        }
    }
}
