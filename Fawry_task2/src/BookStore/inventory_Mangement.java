package BookStore;
import java.util.*;

import Books.Book;

public class inventory_Mangement {
    private Map<String, Book >inventory =new HashMap<>();
    public void adBook(Book book){
        inventory.put(book.getISBN(), book);
        System.out.println("Book add to onventory");
    }
    public  List<Book> removeOutDateBooks(int allowedYear){
        int CurrentYear=Calendar.getInstance().get(Calendar.YEAR);
        List<Book>outdate=new ArrayList<>();
        Iterator<Book> iterator=inventory.values().iterator();
        while (iterator.hasNext()){
            Book b =iterator.next();
            if(b.isOutDate(CurrentYear,allowedYear))
            {
                outdate.add(b);
                iterator.remove();
                System.out.println("removed Book ISBN: "+b.getISBN());
            }

        }
        return outdate;
    }
    public double buySingleBook(String ISBN , int quantity , String adress , String email) throws Exception{
        Book b = inventory.get(ISBN);
        if(b==null)
        {
            throw new Exception("Book NOT EXIST");
        }
        double total = b.buy(quantity,email,adress);
        System.out.println("Book is sold"+quantity+" of "+ISBN);
        return total;
    }

}
