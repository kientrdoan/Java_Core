package C2_String;

public class S2_StringSearch 
{
    public static void main(String[] args) {
        /**
         * Contains || return true_false
         * Starts with || start with character
         * Ends with || end with character
         * Index of || first index
         * Last index of || last index
         */

        String str_1 = "I love Java and Selenium";
        String str_2 = "Java";

        System.out.println(str_1.contains(str_2));
        System.out.println(str_1.toLowerCase().contains(str_2.toLowerCase()));

        System.out.println(str_1.startsWith("I"));
        System.out.println(str_1.endsWith("m"));

        //System.out.println(str_1.indexOf(str_2));
        System.out.println(str_2.lastIndexOf("love"));
    }
}
