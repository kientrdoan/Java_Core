package KeThua;

import java.util.Calendar;

public class Person
{
    public String name = "";
    //access  type   property
    public String ID = "";
    //access  type   property
    public int birthday = 0;
    //access  type   property

    //=================Constructor==========
    public Person()
    {
        this.name = "Kien";
        this.ID = "027";
        this.birthday = 2001;
    }
    public Person(String nameIn, String idIn, int birthdayIn)
    {
        this.name = nameIn;
        this.ID = idIn;
        this.birthday = birthdayIn;

    }


    //=================Setter================
    public void setName(String nameIn)
    {
        this.name = nameIn;
    }
    public void setID(String idIn)
    {
        this.ID = idIn;
    }
    public void setBirtday(int birthdayIn)
    {
        this.birthday = birthdayIn;
    }

    //=================Getter=================
    public String getName()
    {
        return this.name;
    }
    public String getID()
    {
        return this.ID;
    }
    public int getBirthday()
    {
        return this.birthday;
    }
    public int getAge()
    {
        Calendar now = Calendar.getInstance();
        return now.get(Calendar.YEAR) - this.getBirthday();
    }

    //=================Print Information================
    public void print()
    {
        System.out.println("Information:\n------------------");
        System.out.println("Name: " + this.getName());
        System.out.println("ID: " + this.getID());
        System.out.println("Birthday: " + this.getBirthday());
        System.out.println("Age: " + this.getAge());
    }

}
