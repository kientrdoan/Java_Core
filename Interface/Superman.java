package Interface;

public class Superman implements People, Bird
{

    @Override
    public void eat() 
    {
        System.out.println("Superman.eat()");
        
    }

    @Override
    public void sleep() 
    {
        System.out.println("Superman.sleep()");   
    }

    public void abc() //Khong The Truy Cap Vi Khong Co Trong Interface
    {
        System.out.println("Superman.abc()");
    }

    @Override
    public void fly() 
    {
        System.out.println("Superman.fly()");    
    }
    
}
