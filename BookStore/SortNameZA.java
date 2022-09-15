package BookStore;

import java.util.Comparator;

public class SortNameZA implements Comparator<Book>
{

    @Override
    public int compare(Book book1, Book book2) {
        return book2.getName().compareToIgnoreCase(book1.getName());

    }
}
