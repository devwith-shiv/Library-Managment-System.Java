package Project222;

public class Book{
    int bookId;
    String bookName;
    String authorName;
    double price;

    Book( int bookId,String bookName,String authorName,double price){
        this.bookId = bookId;
        this.bookName = bookName;
        this.authorName = authorName;
        this.price= price;
    }

    public void display(){
        System.out.println("bookId:"+ bookId);
        System.out.println("bookName:"+ bookName);
        System.out.println("authorName:"+ authorName);
        System.out.println("price:"+ price);
        System.out.println("-------------");
    }
}
