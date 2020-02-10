public class Book {

    String mBookTitle;
    int mBookISBN;
    int mBookPagesCount;
    boolean mIsBookCheckedOut;
    int mDayCheckedOut = -1;


    public  Book(String booktitle, int ISBN, int pagesCount){
        this.mBookTitle = booktitle;
        this.mBookISBN = ISBN;
        this.mBookPagesCount = pagesCount;
        this.mIsBookCheckedOut = false;
    }

    public String getmBookTitle() {
        return mBookTitle;
    }

    public int getmBookISBN() {
        return mBookISBN;
    }

    public int getmBookPagesCount() {
        return mBookPagesCount;
    }

    public boolean ismIsBookCheckedOut() {
        return mIsBookCheckedOut;
    }

    public int getmDayCheckedOut() {
        return mDayCheckedOut;
    }

    public void setmIsBookCheckedOut(boolean isBookCheckedOut, int dayCheckedOut){
        this.mIsBookCheckedOut = isBookCheckedOut;
        setmDayCheckedOut(dayCheckedOut);
    }

    private void setmDayCheckedOut(int dayCheckedOut){
        this.mDayCheckedOut = dayCheckedOut;
    }
}
