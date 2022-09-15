package BookStore;

import java.util.Comparator;

public class NameAZ implements Comparator<Book> // Rang buoc kieu du lieu
{
    // @Override
    // public int compare(Object o1, Object o2) {
    //     Book book1 = (Book)o1;
    //     Book book2 = (Book)o2;
    //     return book1.getName().compareToIgnoreCase(book2.getName());
    // }

    @Override
    public int compare(Book book1, Book book2) {
        return book1.getName().compareToIgnoreCase(book2.getName());
    }
    
}
