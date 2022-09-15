package C2_String;

public class S2_StringCompare 
{
    public static void main(String[] args) {
        /**
         * Equals
         * Compare To
         * Matches
         */
        String str_1 = "ABC";
        String str_2 = "aBC";
        System.out.println("Equals: " + str_1.equals(str_2));
        System.out.println("Equals Ignore Case: " + str_1.equalsIgnoreCase(str_2));

        System.out.println("compareTo: " + str_1.compareTo(str_2));
        System.out.println("compareToIgnoreCase: " + str_1.compareToIgnoreCase(str_2));

        String pattern = "[a-zA-z]{1,}";
        System.out.println("Matches: " + str_1.matches(pattern));

    }    
}
