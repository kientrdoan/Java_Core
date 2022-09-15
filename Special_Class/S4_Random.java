package C4_Special_Class;
import java.util.Random;

public class S4_Random 
{
    public static void main(String[] args) {
        Random random = new Random();
        for(int i = 0; i<100; i++)
            System.out.print(random.nextInt(1000)+" ");

        for(int i = 0; i<100; i++)
        {
            System.out.println(Math.random() + " ");
        }
    }    
}
