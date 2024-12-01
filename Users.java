package array.com;

import java.util.Scanner;

public class Users {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the size of array:");
        int size = sc.nextInt();
        int n[] = new int[size];
        for (int i=0;i<size;i++) {
            n[i]= sc.nextInt();
        }
        for(int i=0;i<n.length;i++)
        {
            System.out.println(n[i]);
        }
    }
}
