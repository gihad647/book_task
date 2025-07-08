package Books;
public class PaperBook extends Book implements ShippingServiece {
    public int getStock() {
        return stock;
    }

    private  int stock;

    public PaperBook(String ISBN, String title, int yearPuplished, Double price, int stook) {
        super(ISBN, title, yearPuplished, price);
        this.stock = stook;
    }

    @Override
    public double buy(int quantity, String email, String adress) throws Exception {
       if (quantity>stock){
           throw new Exception(" quantity not enough stock ");

       }
       stock-=quantity;
       double totalPrice=price*quantity;
       System.out.println("shipping paper book ISBN: "+ISBN+" to "+adress);
       ShippingServiece.send(adress, quantity);
       return totalPrice;
    }
}
