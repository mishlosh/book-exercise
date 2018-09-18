/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author Michal Legocki
 * @version 9/17/2018
 */
class Book
{
    // The fields.
    private String author;
    private String title;
    private int pages;
    private String refNumber;
    private int borrowed;
    private boolean courseText;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int pages, boolean courseText)
    {
        author = bookAuthor;
        title = bookTitle;
        this.pages = pages;
        refNumber = "";
        borrowed = 0;
        this.courseText = courseText;
    }
    
    public void printDetails()
    {
        if(refNumber.length() == 3){
            System.out.println("Title: " + title + " | Author: " + author +
            " | Pages: " + pages + " | RefID: " + refNumber + " | Times Borrowed: " + borrowed);
        }
        else
        {
            System.out.println("Title: " + title + " | Author: " + author +
            " | Pages: " + pages + " | RefID: ZZZ | Times Borrowed: " + borrowed);
        }
    }
    
    public void setRefNumber(String refID)
    {
        if(refID.length() == 3){
            refNumber = refID;
        }else{
            System.out.println("Reference number must be 3 digits");
        }
    }
    
    public void borrow()
    {
        borrowed++;
    }
    
    /*
     * Accessors
     */
    public String getAuthor()
    {
        return author;
    }
    
    public String getTitle()
    {
        return title;
    }
    
    public int getPages()
    {
        return pages;
    }
    
    public String getRefNumber()
    {
        return refNumber;
    }
    
    public int getBorrowed()
    {
        return borrowed;
    }
    
    public boolean isCourseText()
    {
        return courseText;
    }
    
    /*
     * Print methods
     */
    public void printAuthor()
    {
        System.out.println(author);
    }
    
    public void printTitle()
    {
        System.out.println(title);
    }
    
    

    // Add the methods here ...
}
