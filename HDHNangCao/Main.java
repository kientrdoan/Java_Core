package HDHNangCao;

public class Main 
{
    public static void main(String []args) 
    {
        abstractClass();
    }
    public static void abstractClass() 
    {
        Laptop laptopDell = new LaptopDell();
        laptopDell.keyBoard();
        laptopDell.mainBoard("pagram");
        laptopDell.chipset();    

        Laptop laptopAcer = new LaptopAcer();
        laptopAcer.keyBoard();
        laptopAcer.mainBoard("pagram");
        laptopAcer.chipset();
    }  
      
}
