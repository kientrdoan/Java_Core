package BookStore;

import java.security.PublicKey;
import java.util.Scanner;

public class Main 
{
    private static Store store = new Store();
    public static void main(String []args) 
    {
          
        Scanner sc = new Scanner(System.in);
        int id = 0;
        boolean flag = true;
        do
        {
            cls();
            menu();
            try 
            {
                id = sc.nextInt();

                switch(id)
                {
                    case 1:
                        addBook();
                        pause();
                        break;
                    case 2:
                        editBook();
                        pause();
                        break;
                    case 3:
                        deleteBook();
                        pause();
                        break;
                    case 4:
                        findBook("id");
                        pause();
                        break;
                    case 5:
                        printBook("price", 1);
                        pause();
                        break;
                    case 6:
                        printBook("price", 0);
                        pause();
                        break;
                    case 7:
                        printBook("Name", 1);
                        pause();
                        break;
                    case 8:
                        printBook("Name", 0);
                        pause();
                        break;
                    case 9:
                        findBook("max");
                        break;
                    case 10:
                        findBook("min");
                        break;
                    case 11:
                        flag = false;
                        break;

                }
            } 
            catch (Exception e) 
            {
                content("Co loi xay ra: " + e.getStackTrace() + "\n");
                flag = true;
                sc.nextLine();
                pause();
            }
        }while(flag);

    }  
    
    public static void menu() 
    {
        System.out.println("Quan ly sach\n-----------------");
        System.out.println("1. Add book");
        System.out.println("2. edit book");
        System.out.println("3. delte book");
        System.out.println("4. find book");
        System.out.println("5. Print book (Price increase)");
        System.out.println("6. Print book (Price decrease)");
        System.out.println("7. Print book (Name A-Z)");
        System.out.println("8. Print book (Name Z-A)");
        System.out.println("9. Max Expensiev");
        System.out.println("10. Min Expensiev");
        System.out.println("11. Thoat\n-----------------------");
        System.out.print("Nhap lua chon cua ban [1-6]: ");    
    }

    public static void content(String content)
    {
        System.out.print(content);
    }

    public static void cls()
    {
        System.out.print("\033[H\033[2J");  
        System.out.flush();
    }

    public static void pause()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap enter de tiep tuc");
        sc.nextLine();
    }

    public static void addBook()
    {
        if(store.checkFull())
        {
            content("List Full");
            return;
        }
        Scanner sc = new Scanner(System.in);
        content("Nhap ID: ");
        String ID = sc.next();
        content("Nhap Name: ");
        String name = sc.next();
        content("Nhap Price: ");
        double price = sc.nextDouble();

        Book book = new Book(ID, name, price);
        store.add(book); //Goi phuong thuc
    }

    public static void editBook()
    {
    
        Scanner sc = new Scanner(System.in);

        String idIn = "";
        String nameIn = "";
        double priceIn = 0.0;

        content("Nhap ID: ");
        idIn = sc.next();

        if(store.checkID(idIn) == -1)
        {
            System.out.println("ID khong ton tai: ");
            return;
        }

        content("Nhap Name: ");
        nameIn = sc.next();
        content("Nhap Price: ");
        priceIn = sc.nextDouble();

        store.edit(idIn, nameIn, priceIn);

    }

    public static void deleteBook()
    {
        Scanner sc = new Scanner(System.in);
        String idIn = "";

        content("Nhap ID: ");
        idIn = sc.next();

        if(store.checkID(idIn) == -1)
        {
            System.out.println("ID khong ton tai: ");
            return;
        }

        store.delete(idIn);

    }

    public static void findBook(String type)
    {
        switch(type)
        {
            case "id":
                Scanner sc = new Scanner(System.in);
                content("Nhap ID: ");
                String idIn = sc.next();
                store.find(idIn);
                break;
            case "max":
                store.findMax();
                break;
            case "min":
                store.findMin();
                break;
            
        }

    }

    public static void printBook(String property, int type) 
    {
        if(property.equals("Name") && type == 1) 
            store.sortNameAZ();
        if(property.equals("Name")&& type == 0) 
            store.sortNameZA();
        if(property.equals("price")&& type == 1) 
            store.sortPriceIncrease();
        if(property.equals("price")&& type == 0) 
            store.sortPriceDecrease();

        store.print(); 
    }

}
