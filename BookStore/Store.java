package BookStore;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Store implements StoreInterface 
{
    // private int totalItem = 0;
    private final int maxItem = 100;
    private List<Book> list = null; //Generic rang buoc kieu du lieu

    Store()
    {
        this.list = new LinkedList<Book>();
    }

    public boolean checkEmpty()
    {
        return this.list.isEmpty();
    }

    public boolean checkFull()
    {
        return list.size() == maxItem-1;
    }

    int checkID(String ID)
    {
        for(int i = 0; i<list.size(); i++)
        {
            if(ID.equals(this.list.get(i).getName()))
            {
                return i;
            }
        }
        return -1;
    }

    public void add(Object obj)
    {
        Book book = (Book)obj;
        this.list.add(book);
        System.out.println("Add Successful: ");
    }

    public void edit(String idIn, String nameIn, double priceIn)
    {
        int index = checkID(idIn);
        if(index != -1)
        {
            ((Book) list.get(index)).setName(nameIn);
            ((Book) list.get(index)).setPrice(priceIn);
            System.out.println("Edit Successful: ");
        }
    }

    public void delete(String idIn)
    {
        int index = checkID(idIn);
        this.list.remove(index);
        System.out.println("Delete Successfull: ");
    }

    public void find(String idIn)
    {
        for(int i = 0; i<list.size(); i++)
        {
            Book book = (Book)list.get(i);
            if(idIn.equals(book.getID()))
            {
                book.show();
                return;
            }
        }
        System.out.println("Khong ton tai: ");
    }

    public void findMax()
    {
        if(checkEmpty())
        {
            System.out.println("List rong:");
            return;
        }
        Book book = Collections.max(list, new SortPriceDecrease());
        System.out.println(book);
    }

    public void findMin()
    {
        if(checkEmpty())
        {
            System.out.println("List rong:");
            return;
        }
        Comparator<Book> cmp = new Comparator<Book>() {
            public int compare(Book book1, Book book2)
            {
                if(book1.getPrice() > book2.getPrice())
                    return 1;
                else if(book1.getPrice() < book2.getPrice())
                    return -1;
                return 0;
            }
        };
        Book book = Collections.min(list, cmp);
        System.out.println(book);
    }

    public void sortNameAZ()
    {
        Collections.sort(list, new NameAZ());
    }

    public void sortNameZA()
    {
        Collections.sort(list, new SortNameZA());

    }

    public void sortPriceDecrease()
    {
        Collections.sort(list, new SortPriceDecrease());
    }

    public void sortPriceIncrease()
    {
        Collections.sort(list, new SortPriceDecrease());
        Collections.reverse(list);
    }

    public void print()
    {
        if(this.checkEmpty())
        {
            System.out.println("List rong: ");
            return;
        }

        //Dung Vong Lap For
        // for(int i = 0; i<list.size(); i++)
        // {
        //     Book book = (Book)this.list.get(i);
        //     System.out.println(book);
        //}

        //Dung Iterator
        Iterator<Book> it = list.iterator();
        while(it.hasNext())
        {
            //Book book = (Book)it.next(); //Chua Dung Generic
            System.out.println(it.next());
        }
    }

}
