package C2_String;

import java.util.Scanner;
import java.util.StringTokenizer;

public class S4_StringSlice {
    public static void main(String[] args) {
        /**
         * Char at
         * Substring
         * Split || return List
         * scanner
         * stringTokenizer
         */
        String str_1 = "ABCDEFGH";
        for(int i = 0; i<str_1.length(); i++)
        {
            char temp = str_1.charAt(i);
            System.out.print(temp + " ");
        }

        String str_2 = str_1.substring(1, 3);
        System.out.println("\n"+str_2);

        String str_3 = "Kien Dep Trai";
        String []lst = str_3.split(" ");
        for(String i : lst)
            System.out.println(i);
        
        try (Scanner sliceString = new Scanner(str_3)) {
            sliceString.useDelimiter(" ");
            while(sliceString.hasNext())
            {
                String tmp = sliceString.next();
                System.out.println(tmp);
            }
        }
        StringTokenizer slice = new StringTokenizer(str_3, " ");
        while(slice.hasMoreTokens())
        {
            String tmp = slice.nextToken();
            System.out.println(tmp);
        }

    }
}
