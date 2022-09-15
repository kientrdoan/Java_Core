
package C2_String;
/**
 * learn String Basic Concept
 * version java 18.0.1.1 2022-04-22
 * author Doan Trung Kien
*/

public class S1_StringBasic
{
    public static void main(String[] args) 
    {
        /**
         * Concaternate
         * Length
         * Trim
         * Upper Case
         * Lower Case
         * Empty
         */

        String str_1 = "De zinna";
        String str_2 = "Institues";
        String str_3 = str_1 + str_2;
        System.out.println(str_3);

        String str_4 = str_1.concat(str_2);
        System.out.println(str_4);

        System.out.println(("Lenth: " + str_4.length()));

        String str_5 = "   kien dzaii     doan      ";
        System.out.println("Trim: " + str_5.trim());

    }
}