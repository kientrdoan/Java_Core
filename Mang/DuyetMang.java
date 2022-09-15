package Mang;

public class DuyetMang 
{
    public static void main(String []args) 
    {
        System.out.println("Main System:\n-------------------------");
        duyetMang();
    }

    public static void duyetMang() 
    {
        int[] arr = {5, 6, 7, 8, 9};
        
        for(int i = 0; i<arr.length; i++)
        {
            System.out.println("Phan tu thu " + i + ": " + arr[i]);
        }
    }
}
