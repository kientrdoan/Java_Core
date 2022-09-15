package ClassObject;

import java.util.function.ObjDoubleConsumer;

public class Main 
{
    public static void main(String []args) 
    {
        equal();
    }
    
    public static void to_string() 
    {
        Course courseJava = new Course("Java", 10);
        Course coursePHD = new Course("PHD", 9);
        System.out.println(courseJava);
        System.out.println(coursePHD);    
    }
    public static void equal()
    {
        Course courseJava = new Course("Java", 10); //xxx789
        Course coursePHD = new Course("PHD", 10); //yyy789
        //=======>Khong Bang Nhau Vi Hai Vung Nho Khac Nhau
        if(courseJava.equals(coursePHD))
        {
            System.out.println("Bang nhau: ");
        }
        else
        {
            System.out.println("Khong Bang nhau: ");
        }



    }
}
