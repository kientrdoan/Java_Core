package C2_String;

public class S7_StringPool 
{
    public static void main(String[] args) {
        String str1 = "Hello"; //Tao Doi Tuong Moi Va Cho Vao Vung Nho String Pool
        String str2 = "Hello"; // Lay Doi Tuong Trong String Pool
        if(str1 == str2)       // Tro Cung Doi Tuong
        {
            System.out.println("Same");
        }
        else{
            System.out.println("Not same");
        }
    }    
}
