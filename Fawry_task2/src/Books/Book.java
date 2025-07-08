package Books;

public abstract class Book {
   protected String ISBN;
    protected String title;
   protected int yearPuplished;

    public int getYearPuplished() {
        return yearPuplished;
    }

    public String getTitle() {
        return title;
    }

    public Double getPrice() {
        return price;
    }

    public String getISBN() {
        return ISBN;
    }

    protected Double price;

    public Book(String ISBN ,String title ,int yearPuplished ,Double price ) {
        this.ISBN=ISBN;
        this.yearPuplished=yearPuplished;
        this.title=title;
        this.price=price;
    }
    public boolean isOutDate(int currentTime, int numberOfAllowYears)
    {
        return (currentTime>numberOfAllowYears+yearPuplished);
    }
    public abstract double buy(int quantity ,String email , String adress) throws Exception;



}
