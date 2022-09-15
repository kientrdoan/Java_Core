package KeThua;

public class Main 
{
    public static void main(String []args)
    {
        tuKhoaStatic();
    }
    public static void keThua()
    {
        Person person = new Person();
        person.print();

        Student student = new Student();
        student.setName("Doan");
        student.print();
    }
    public static void chongKeThua()
    {
        // final public class Person {}

        // final: Dinh nghia hang so
    }
    public static void overriding()
    {
        Student student = new Student();
        student.setName("Doan");
        student.setID("999");
        student.setBirtday(2001);
        student.setScore(9.0);
        student.print(); //Ham Print Class Student
    }
    public static void chongOverriding()
    {
        //final public void print() {}
    }
    public static void keThuaMethod()
    {
        Teacher teacher = new Teacher("Doan", "027", 2001, 9.9);
        teacher.print();
    }
    public static void tuKhoaStatic()
    {
        Student studentOne = new Student();
        Student studentTwo = new Student();
        Student studentThree = new Student();
        Student studentFour = new Student();
        Student studentFive = new Student();

        //Dap an la 1: vi moi object thao tac tren moi vung nho khac nhau khi chua co tu khoa static
        System.out.println("StudentOne No Static:"+ studentOne.getCountNoStatic());
        System.out.println("StudentTwo No Static:"+ studentTwo.getCountNoStatic());
        System.out.println("StudentThree No Static:"+ studentThree.getCountNoStatic());
        System.out.println("StudentFour No Static:"+ studentFour.getCountNoStatic());
        System.out.println("StudentFive No Static:"+ studentFive.getCountNoStatic());

        System.out.println("StudentOne Static From Object:"+ studentOne.countStatic);
        System.out.println("StudentTwo Static From Object:"+ studentTwo.countStatic);
        System.out.println("StudentThree Static From Object:"+ studentThree.getCountStatic());
        System.out.println("StudentFour Static From Object:"+ studentFour.getCountStatic());
        System.out.println("StudentFive Static From Object:"+ studentFive.getCountStatic());

        System.out.println("StudentFive Static From Class:"+ Student.countStatic);
        
        //static method chi truy cap duoc vao static variable va static method trong cung class
    }   
}
