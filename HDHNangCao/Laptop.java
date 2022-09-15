package HDHNangCao;

abstract public class Laptop 
{
    public void keyBoard()
    {
        System.out.println("Laptop.keyBoard()");
    }  
    abstract public void mainBoard(String pagram);

    public void chipset()
    {
        System.out.println("Laptop.chipset()");
    }    
}
