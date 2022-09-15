package Interface;

public interface People 
{
    public void eat();
    public void sleep();
    public default void defaultInterface()
    {
        System.out.println("People.abstractClass()");
    }
    public static void staticInterface()
    {
        System.out.println("People.staticInterface()");
    }
}
