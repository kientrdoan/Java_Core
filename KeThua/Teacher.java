package KeThua;

import java.util.Calendar;

public class Teacher extends Person
{
    public String name = "";
    //access  type   property
    public String ID = "";
    //access  type   property
    public int birthday = 0;
    //access  type   property
    public double salary = 0;
    //access  type   property

    //=================Constructor==========
    // public Teacher()
    // {
    //     this.salary = 9.9;
    // }
    public Teacher(String nameIn, String idIn, int birthdayIn, double salaryIn)
    {
        super(nameIn, idIn, birthdayIn);
        this.salary = salaryIn;
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
    public void setSalary(double salaryIn)
    {
        this.salary = salaryIn;
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
    public double getSalary()
    {
        return this.salary;
    }

    public int getAge()
    {
        Calendar now = Calendar.getInstance();
        return now.get(Calendar.YEAR) - this.getBirthday();
    }

    //=================Print Information================
    public void print()
    {
        super.print();
        System.out.println("salary: " + this.getSalary());
    }

}

