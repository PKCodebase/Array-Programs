package array.com;

import java.util.Scanner;

public class Transpose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int raw= sc.nextInt();
        int column= sc.nextInt();
        int arr[][] = new int [raw][column];

        for(int i=0;i<raw;i++)
        {
            for(int j =0;j<column;j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("the transpose is:");
        for(int j=0; j<raw;j++)
        {
            for(int i=0;i<column;i++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
