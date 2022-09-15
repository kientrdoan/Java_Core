package Mang;

import java.util.Scanner;

public class MangDaChieu 
{
    public static void main(String []args)
    {
        int[][] arr = capPhat();
        nhapMaTran(arr);
        duyetMang(arr);
    }  

    public static void KhaiBao()
    {
        int[][] arr = new int[5][5];
    }  
    public static int [][]capPhat()
    {
        int[][] arr = new int[5][5];
        int count = 0;
        for(int i = 0; i<5; i++)
        {
            for(int j = 0; j<5; j++)
            {
                arr[i][j] = count++;
            }
        }
        return arr; 
    }

    public static void nhapMaTran(int[][] arr)
    {
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i<5; i++)
        {
            for(int j = 0; j<5; j++)
            {
                System.out.print("Nhap Gia Tri tai" + i + ":"+ j  );
                arr[i][j] = sc.nextInt();
            }
        }
    }

    public static void duyetMang(int[][] arr)
    {
        for(int i = 0; i<5; i++)
        {
            for(int j = 0; j<5; j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");

        }
    }

}
