package GiamPhuThuoc;

public class Playstation 
{
    public void play(int type)
    {
        if(type == 1)
        {
            Mario mario = new Mario();
            mario.run();
            mario.jump();
        }
        else if(type == 2)
        {
            Fifa fifa = new Fifa();
            fifa.run();
            fifa.jump();
        }
    }

    public void play(Character obj)
    {
        obj.run();
        obj.jump();
    }
}
