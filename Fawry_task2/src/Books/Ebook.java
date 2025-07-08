package Books;
public class Ebook extends Book implements Mailservice {
    public String getTypeOfFile() {
        return typeOfFile;
    }

    private  String typeOfFile;

    public Ebook(String ISBN, String title, int yearPuplished, Double price,String typeOfFile) {
        super(ISBN, title, yearPuplished, price);
        this.typeOfFile=typeOfFile;
    }

    @Override
    public double buy(int quantity, String email, String adress) throws Exception {
        if(quantity!=1)
        {
            throw new Exception(" you can bought one only oe time ");
        }
            System.out.println("Sending book to this email: "+email+"price: "+price+"$");
        Mailservice.send(email);
        return price;
    }
}
