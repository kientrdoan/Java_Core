package Mang;

public class KhaiBao
{
    public static void main(String []args) 
    {
        System.out.println("Main System:\n-------------------------");
        khaiBao();
    }

    public static void khaiBao() 
    {
        int[] arr = {5, 6, 7, 8, 9};
        
        System.out.println("Do dai cua mang: " + arr.length);
        System.out.println("Phan tu thu nhat: " + arr[0]);
        System.out.println("Phan tu thu hai: " + arr[1]);
        System.out.println("Phan tu thu ba: " + arr[2]);
        System.out.println("Phan tu thu tu: " + arr[3]);
        System.out.println("Phan tu thu nam: " + arr[4]);
    }
}