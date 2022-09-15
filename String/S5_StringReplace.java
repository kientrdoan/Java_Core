package C2_String;

public class S5_StringReplace 
{
    public static void main(String[] args) {
        /**
         * Replace - Normal
         * ReplaceAll - RegEx
         */

        String str_1 = "CONCENTRAT123ON 123MPROVES W123TH PRAT123CE";
        String str_2 = "123";
        String str_3 = "I";

        System.out.println(str_1.replace(str_2, str_3));

        String str_4 = "[^A-Z]{1,}";
        String str_5 = str_1.replaceAll(str_4, "I");
        System.out.println(str_5);

    }    
}
