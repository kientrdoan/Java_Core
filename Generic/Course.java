package Generic;

public class Course<T, T1>
{
    private String name = "";
    private T time;
    private T1 chapter;

    public Course(String name, T time, T1 chapter) 
    {
        this.name = name;
        this.time = time;
        this.chapter = chapter;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTime(T time) {
        this.time = time;
    }

    public void setChapter(T1 chapter) {
        this.chapter = chapter;
    }

    public String getName() {
        return name;
    }

    public T getTime() {
        return time;
    }

    public T1 getChapter() {
        return chapter;
    }
}
