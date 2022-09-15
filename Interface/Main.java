package Interface;

public class Main 
{
    public static void main(String []args) 
    {
        tuKhoaStatic();
    }
    public static void inter()
    {
        People people = new Superman();
        //Chi Truy Cap Duoc Vao Cac Method Trong People
        people.eat();
        people.sleep(); 
    }
    public static void tuKhoaDefault()
    {
        People people = new Superman();
        people.defaultInterface();
    }
    public static void tuKhoaStatic()
    {
        People.staticInterface();
    }


}
