package array.com;

import java.util.Scanner;

public class Searching {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the number of rows:");
        int rows = sc.nextInt();
        System.out.println("Input the number of columns:");
        int columns = sc.nextInt();
        int [][]newArray= new int[rows][columns];
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<columns;j++)
            {
                newArray[i][j]= sc.nextInt();
            }
        }
        int found = sc.nextInt();
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<columns;j++)
            {
                if(newArray[i][j]==found)
                {
                    System.out.println("Number is found:");
                }
            }
        }
    }
}
