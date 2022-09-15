package GiamPhuThuoc;

public class Main 
{
    public static void main(String []args) 
    {
        open_closed();
    }
    public static void open_closed()
    {
        Playstation playstation = new Playstation();
        playstation.play(1);

        Playstation playstation2 = new Playstation();
        Mario mario = new Mario();
        playstation2.play(mario);



    }
}
