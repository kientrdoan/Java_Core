package ClassObject;

public class Course 
{
    private String name = "";
    private int time = 0;

    public Course(String nameIn, int timeIn)
    {
        this.name = nameIn;
        this.time = timeIn;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getTime() {
        return time;
    }
    public void setTime(int time) {
        this.time = time;
    }

    @Override
    public String toString() 
    {
        return "Name: " + this.getName() + "\n" +
                "Time: " + this.getTime();
    }

    @Override
    public boolean equals(Object obj) 
    {
        Course course = (Course)obj;
        if(this.getTime() == course.getTime())
            return true;
        return false;
    }

    public void showInfo()
    {
        System.out.println("Name: " + this.getName());
        System.out.println("Time: " + this.getTime());
    }

    
}
