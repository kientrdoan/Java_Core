package C2_String;

public class S6_StringConversion 
{
    public static void main(String[] args) {
        /**
         * Integer.toString
         * Integer.toBinaryString
         * Integer.toHexString
         * Integer.toOctalString
         * Integer.parseInt
         * Double.parseDouble
         * String.valueOf
        */
        int num = 100;
        System.out.println(Integer.toString(num));
        System.out.println(Integer.toHexString(num));
        System.out.println(Integer.toBinaryString(num));
        System.out.println(Integer.toOctalString(num));

        String str_1 = "100";
        String str_2 = "10101010";
        String str_3 = "64";
        String str_4 = "144";
        String str_5 = "9.9";
        System.out.println(Integer.parseInt(str_1));
        System.out.println(Integer.parseInt(str_2, 2));
        System.out.println(Integer.parseInt(str_3, 16));
        System.out.println(Integer.parseInt(str_4, 8));
        System.out.println(Double.parseDouble(str_5));
        System.out.println(String.valueOf(str_1));

    }    
}
