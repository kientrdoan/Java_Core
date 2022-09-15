package BookStore;

public class Book implements Comparable<Book>
{
    private String ID = "";
    private String name = "";
    private double price = 0.0;
    
    //Constructor
    Book()
    {
        this.ID = "";
        this.name = "";
        this.price = 0.0;
    }
    Book(String idIn, String nameIn, double priceIn)
    {
        this.ID = idIn;
        this.name = nameIn;
        this.price = priceIn;
    }

    //Setter
    public void setID(String idIn)
    {
        this.ID = idIn;
    }
    public void setName(String nameIn)
    {
        this.name = nameIn;
    }
    public void setPrice(double priceIn)
    {
        this.price = priceIn;
    }

    //Getter
    public String getID()
    {
        return this.ID;
    }
    public String getName()
    {
        return this.name;
    }
    public double getPrice()
    {
        return this.price;
    }

    @Override
    public String toString()
    {
        return "ID: " + this.getID() + "\n" + 
                "Name: " + this.getName() + "\n" +
                "Price: " + this.getPrice() + "\n";
    }

    @Override
    public int compareTo(Book book)
    {
        return this.name.compareTo(book.name);
    }

    public void show()
    {
        System.out.println("ID: " + this.getID());
        System.out.println("Name: " + this.getName());
        System.out.println("Price: " + this.getPrice());
    }

}
