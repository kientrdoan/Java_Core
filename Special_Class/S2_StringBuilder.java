package C4_Special_Class;

public class S2_StringBuilder 
{
    /*
	 * StringBuilder class is used to create mutable (modifiable) string
	 * Some useful methods:
	 * append, insert, replace, delete, reverse
	 */

    /** 
     * Some useful methods from StringBuilder 
	 * insert, replace, delete, deleteChatAt,reverse
	*/
    public static void main(String[] args) {
        String str_1 = "I";   // immutable
        str_1 = str_1 + "Like"; // Clear old object and create new object and cannot change
        str_1 = str_1 + "Java"; // Create new object
        System.out.println(str_1);

        StringBuilder str_2 = new StringBuilder("Leaning is fun"); // interactive in one object
        str_2.append("Like");
        str_2.append("java");
        System.out.println(str_2);

        str_2.insert(9, "python");
        System.out.println(str_2);

        str_2.replace(9, 15, "");
        System.out.println(str_2);

    }
}
