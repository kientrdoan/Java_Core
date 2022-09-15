package Mang;

import java.util.Scanner;

public class NhapMang
{
    public static void main(String []args) 
    {
        System.out.println("Main System:\n-------------------------");
        nhapMang();

    }

    public static void nhapMang() 
    {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        sc.nextLine();

        int[] arr = new int[length];

        for(int i = 0; i<length; i++)
        {
            System.out.print("Nhap gia tri phan tu thu" + i + ": ");
            arr[i] = sc.nextInt();
            sc.nextLine();
        }
        sc.close();
    }    
}
