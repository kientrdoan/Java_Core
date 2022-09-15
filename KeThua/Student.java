package KeThua;

import java.util.Calendar;

public class Student extends Person
{
    public int countNoStatic = 0;
    public static int countStatic = 0;
    public double score = 9.9;
    //access  type   property

    //=================Constructor==========
    public Student()
    {
        super();
        this.countNoStatic++;
        this.countStatic++;
        this.score = 9.9;
    }
    public Student(String nameIn, String idIn, int birthdayIn, double scoreIn) 
    {
        super(nameIn, idIn, birthdayIn);
        this.score = 9.0;
    }

    //=================Setter================
    public void setScore(double scoreIn)
    {
        this.score = scoreIn;
    }

    //=================Getter=================
    public double getScore()
    {
        return this.score;
    }

    public int getCountNoStatic()
    {
        return this.countNoStatic;
    }

    public int getCountStatic()
    {
        return this.countStatic;
    }

    //=================Print Information================
    public void print()
    {
        System.out.println("Information:\n------------------");
        System.out.println("Name: " + this.getName());
        System.out.println("ID: " + this.getID());
        System.out.println("Birthday: " + this.getBirthday());
        System.out.println("Score: " + this.getScore());
        System.out.println("Age: " + this.getAge());
    }

}
