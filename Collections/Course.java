package Collections;

public class Course implements Comparable
{
    private String name = "";
    private int time;

    public Course(String name, int time) 
    {
        this.name = name;
        this.time = time;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTime(int time) {
        this.time = time;
    }


    public String getName() {
        return name;
    }

    public int getTime() {
        return time;
    }
    @Override
    public String toString() 
    {
        return "Name: " + this.getName() + "\n" +
                "Time: " + this.getTime();
    }

    @Override
    public int compareTo(Object o) 
    {
        Course course = (Course)o;    
        if(this.getTime() < course.getTime())
            return 1;
        else if(this.getTime() > course.getTime())
            return -1;
        return 0;
    }
}
