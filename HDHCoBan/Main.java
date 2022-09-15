package HDHCoBan;

public class Main //Class Chinh Trung Voi Ten Chuong Trinh
{
    public static void main(String []args) 
    { 
        System.out.println("Main.main()");
    }

    public static void khoiTaoObject()
    {
        Student studentOne = new Student();  //Create Object
        Teacher teacherOne = new Teacher(); // Create Object
    }
    public static void truyCapProperty() 
    {
        Student studentOne = new Student();  //Create Object
        studentOne.name = "Kien"; //Access property
        studentOne.ID = "027"; //Access property
        studentOne.birthday = 2001; //Access property

        System.out.println("Information:\n------------------");
        System.out.println("Name: " + studentOne.name);
        System.out.println("ID: " + studentOne.ID);
        System.out.println("Birthday: " + studentOne.birthday);
    }
    public static void truyCapMethod() 
    {
        Student studentOne = new Student();  //Create Object
        studentOne.setName("Kien");
        studentOne.setID("027");
        studentOne.setBirtday(2001);

        System.out.println("Information:\n------------------");
        System.out.println("Name: " + studentOne.getName());
        System.out.println("ID: " + studentOne.getID());
        System.out.println("Birthday: " + studentOne.getBirthday());
        System.out.println("Age: " + studentOne.getAge());
    }
    public static void overloading()
    {
        Student studentOne = new Student();
        studentOne.setID();
        studentOne.setID("027");
        studentOne.setID("N20DCCN", 027);  
        studentOne.setID(027); 
    }
    public static void constructor()
    {
        Student studentOne = new Student();
        Student studentTwo = new Student("Doan","009", 2009);
    }

}//end class main


//Trong Cung Packgage Khong Duoc Co Hai Class Trung Ten
// class Student // Class Con Khong Co Access
// {

// }

