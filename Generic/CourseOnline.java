package Generic;

public class CourseOnline extends Course
{

    public CourseOnline(String name, Object time, Object chapter) 
    {
        super(name, time, chapter);
    }

    public void showInfo()
    {
        System.out.println("CourseOnline.showInfo()");
    }
    
}
