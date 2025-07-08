package Books;

public class ShowCaseBook extends Book {
    public ShowCaseBook(String ISBN, String title, int yearPuplished, Double price) {
        super(ISBN, title, yearPuplished, price);
    }

    @Override
    public double buy(int quantity, String email, String adress) throws Exception {
        throw new Exception("This book cannot bought ");
    }
}
