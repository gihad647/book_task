import BookStore.*;
import Books.Book;
import Books.Ebook;
import Books.PaperBook;
import Books.ShowCaseBook;

import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        inventory_Mangement store=new inventory_Mangement();
        store.adBook(new PaperBook("IS123","Fawry Mange",2010,39.99,10));
        store.adBook(new Ebook("IS345","LLLL Mange",2020,29.99,"PDF"));
        store.adBook(new ShowCaseBook("IS678","DDDD Mange",2030,0.0));
        double paid1 = store.buySingleBook("IS123",2,"cairo","non");
        System.out.println("Total paid:"+paid1);
        double paid2= store.buySingleBook("IS345",1,"non","email@---");
        System.out.println("Total paid:"+paid2);
        try {
           store.buySingleBook("IS678",1,"non","non");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        List<Book> removed=store.removeOutDateBooks(10);
        System.out.println(removed.size());


    }
}