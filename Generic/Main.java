package Generic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main 
{
    public static void main(String []args)
    {
        // Integer[] arr = {9, 99, 90, 900, 909};
        // String[] arrStr = {"Hello", "World"};
        // generic_method(arr);
        // generic_method(arrStr);
        
        Course course = new Course("Kien", 9, 9);
        CourseOnline courseOnline = new CourseOnline("Doan", 9, 9);
        rang_buoc_kieu_du_lieu_class(course);
        rang_buoc_kieu_du_lieu_class_con(courseOnline);


    }
    public static<T> void generic_method(T[] arr)
    {
        for(T ele: arr)
        {
            System.out.println(ele);
        }
    }

    public static void generic_class()
    {
        Course<String, String> course = new Course("Java", 25, 10);
    }

    public static void generic_list()
    {
        List<Integer> list = new ArrayList<Integer>();
        list.add(9);
        list.add(1099);
        list.add(109);
        list.add(909);
        list.add(1009);

        Iterator<Integer> it = list.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
    }

    public static void generic_set()
    {
        Set<String> set = new HashSet<String>();
        set.add("Hello");
        set.add("World");
        Iterator<String> it = set.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
    }

    public static void generic_map() 
    {
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("TRR", 9);
        map.put("GT", 9);

        Iterator<String> it = map.keySet().iterator();
        while(it.hasNext())
        {
            String key = it.next();
            int value = map.get(key);
            System.out.println("Key: " + key);
            System.out.println("Value: " + value);
        } 
    }
    
    public static<T extends Integer> void rang_buoc_kieu_du_lieu(T[] arr) 
    {
        //Class Object La Cha Cua Tat Ca Cac Kieu
        for(T ele: arr)
        {
            System.out.println(ele);
        }
    }

    public static<T extends Object> void rang_buoc_kieu_du_lieu_class(T obj) 
    {
        //Class Object La Cha Cua Tat Ca Cac Kieu
        System.out.println("Main.rang_buoc_kieu_du_lieu_class()");
    }

    public static<T extends Course> void rang_buoc_kieu_du_lieu_class_con(T obj) 
    {
        //Truyen Vao Class Extends Class Course Van Duoc
        System.out.println("Main.rang_buoc_kieu_du_lieu_class_con()");
    }

}   
