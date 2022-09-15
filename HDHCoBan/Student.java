package HDHCoBan;

import java.util.Calendar;

public class Student 
{
    public String name = "";
    //access  type   property
    public String ID = "";
    //access  type   property
    public int birthday = 0;
    //access  type   property

    //=================Constructor==========
    public Student()
    {
        this.name = "Kien";
        this.ID = "027";
        this.birthday = 2001;
    }
    public Student(String nameIn, String idIn, int birthdayIn)
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
    //===========Overloading================
    public void setID(String idIn)
    {
        this.ID = idIn;
    }
    public void setID()
    {
        this.ID = "";
    }
    public void setID(int idIn)
    {
        this.ID = String.valueOf(idIn);
    }
    public void setID(String idIn, int last)
    {
        this.ID = idIn + String.valueOf(last);
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
