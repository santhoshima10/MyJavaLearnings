import java.util.HashMap;
import java.util.Map;

public class LibraryCatalogue {


    Map<String,Book> mBookCollection = new HashMap<String, Book>();
    int mCurrentDay = 0;
    int mLengthOfCheckOutPeriod = 7;
    double mInitialLateFees = 0.50;
    double mFeePerLateDay = 1.00;

    public LibraryCatalogue(Map<String,Book> collection){
        this.mBookCollection = collection;

    }


    public LibraryCatalogue(Map<String,Book> collection, int LengthOfCheckOutPeriod, double initialLateFees, double feesPerLateDay){
        this.mBookCollection = collection;
        this.mLengthOfCheckOutPeriod = LengthOfCheckOutPeriod;
        this.mInitialLateFees = initialLateFees;
        this.mFeePerLateDay = feesPerLateDay;
    }


    public Map<String, Book> getmBookCollection() {
        return mBookCollection;
    }

    public int getmCurrentDay() {
        return mCurrentDay;
    }

    public int getmLengthOfCheckOutPeriod() {
        return mLengthOfCheckOutPeriod;
    }

    public double getmInitialLateFees() {
        return mInitialLateFees;
    }

    public double getmFeePerLateDay() {
        return mFeePerLateDay;
    }

    public Book getBook(String bookTitle){
       return  getmBookCollection().get(bookTitle);
    }


    public void nextDay(){
        mCurrentDay++;
    }

    public void setmCurrentDay(int day){
        mCurrentDay = day;
    }

    public void mCheckOutBook(String bookTitle){

        Book book = getBook(bookTitle);
        if(book.mIsBookCheckedOut){
            mBookAlreadyCheckedOut(book);
        }
        else{
            book.setmIsBookCheckedOut(true,mCurrentDay);
            System.out.println("You just checked out the book "+bookTitle+". The Due date for return is "+(getmCurrentDay()+getmLengthOfCheckOutPeriod()));
        }

    }

    public void mReturnBook(String bookTitle){

        Book book = getBook(bookTitle);
        int daysLate = mCurrentDay - (book.mDayCheckedOut+getmLengthOfCheckOutPeriod());
        if(daysLate > 0){
            System.out.println("You owe the library $ "+(getmInitialLateFees() + getmFeePerLateDay()* daysLate)+" because your book is "+bookTitle+" "+daysLate+"over due");
        }
        else{
            System.out.println("Book Returned Thank You ");
        }

        book.setmIsBookCheckedOut(false,-1);

    }

    public void mBookAlreadyCheckedOut(Book book){

        System.out.println("The Book "+book.getmBookTitle()+" is already checkout .It shoiuld be back on day "+book.mDayCheckedOut+getmLengthOfCheckOutPeriod());

    }

    public  static void main(String[] args){

        Map<String,Book> bookCollection = new HashMap<>();
        bookCollection.put("Harry Potter", new Book("Harry Potter", 122342343,1000));

        LibraryCatalogue library = new LibraryCatalogue(bookCollection);
        library.mCheckOutBook("Harry Potter");
        library.nextDay();
        library.nextDay();
        library.mCheckOutBook("Harry Potter");
        library.setmCurrentDay(17);
        library.mReturnBook("Harry Potter");
        library.mCheckOutBook("Harry Potter");



    }



}
