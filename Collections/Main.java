package Collections;

import java.util.*;

public class Main 
{
    public static void main(String []args) 
    {
       comparator();
    }    

    public static void arraylist() 
    {
        List list = new ArrayList();
        Course course = new Course("Kien", 9);
        list.add("Java");
        list.add(9);
        list.add(9.9);
        list.add(true);
        list.add(course);
        System.out.println(list.size());
        System.out.println(list.get(2));

        for(int i = 0; i<list.size(); i++)
        {
            System.out.println(list.get(i));
        }

        for(Object ele:list)
        {
            System.out.println(ele);
        }

        Iterator it = list.listIterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }

    }

    public static void linkedlist() 
    {
        List list = new LinkedList();
        Course course = new Course("Kien", 9);
        list.add("Java");
        list.add(9);
        list.add(9.9);
        list.add(true);
        list.add(course);
        // System.out.println(list.size());
        // System.out.println(list.get(2));

        // for(int i = 0; i<list.size(); i++)
        // {
        //     System.out.println(list.get(i));
        // }

        // for(Object ele:list)
        // {
        //     System.out.println(ele);
        // }

        list.remove("Java");

        Iterator it = list.listIterator();
        System.out.println("-----------------------------------");
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
    }

    public static void set() 
    {
        Set set = new HashSet();
        set.add(9);
        set.add(109);
        set.add(909);
        set.add(199);
        set.add("hello");

        Iterator it = set.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
    }

    public static void map() 
    {
        Map map = new HashMap();
        map.put("TRR", 9);
        map.put("GT", 9);
        map.put("T", 9);
        map.put("DSTT", 9);
        map.put("AV", 9);

        Iterator it = map.keySet().iterator();
        while(it.hasNext())
        {
            Object key = it.next();
            Object value = map.get(key);
            System.out.println(key + ":" + value);
        }
    }

    public static void comparable()
    {
        Course courseJava = new Course("Java", 9);
        Course coursePHD = new Course("PHD", 19);
        Course courseASEMLy = new Course("ACEMLY", 199);

        List list = new ArrayList();
        list.add(courseJava);
        list.add(coursePHD);
        list.add(courseASEMLy);

        Collections.sort(list);

        Iterator it = list.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
    }

    public static void comparator()
    {
        Course courseJava = new Course("Java", 9);
        Course coursePHD = new Course("PHD", 19);
        Course courseASEMLy = new Course("ACEMLY", 199);

        List list = new ArrayList();
        list.add(courseJava);
        list.add(coursePHD);
        list.add(courseASEMLy);

        Collections.sort(list, new TimeCompartor());

        Iterator it = list.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
    }

}
