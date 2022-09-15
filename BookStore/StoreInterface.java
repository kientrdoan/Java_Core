package BookStore;

//Quy Dinh Quan Ly Cai Co San De Nang Cap
public interface StoreInterface 
{
    void add(Object obj); // Phu Hop Cho Nhieu Class
    void edit(String idIn, String nameIn, double priceIn);
    void delete(String idIn);
    void find(String idIn);
    boolean checkEmpty();
    boolean checkFull();
    void print();    
}
