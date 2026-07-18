package Project222;

import java.util.ArrayList;
import java.util.Scanner;

public class BookManager {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (true){
        System.out.println("1.Add book");
        System.out.println("2.Display book");
        System.out.println("3.Delete book by id");
        System.out.println("4.Search Bookid by Book:");
        System.out.println("5.exit");
        System.out.println("choose");

            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("book id");
                    int bookid = sc.nextInt();
                    sc.nextLine();
                    System.out.println("bookname");
                    String bookname = sc.nextLine();
                    System.out.println("Authorname");
                    String authorname = sc.nextLine();
                    System.out.println("Book price");
                    double price = sc.nextDouble();
                    sc.nextLine();
                    Book b = new Book(bookid,bookname,authorname,price);
                    books.add(b);
                    System.out.println("Book added succesfully");
                    break;
                case 2:
                    if (books.isEmpty()){
                        System.out.println("Book not available");
                    } else {
                        for (Book bo:books){
                            bo.display();
                        }
                    }
                    break;
                case 3:
                    System.out.println("Delete book by id:");
                    int deleteid = sc.nextInt();
                    sc.nextLine();
                    boolean found = false;
                  int i =0;
                    for (i =0;i<books.size();i++) {
                        if (books.get(i).bookId == deleteid) {
                            books.remove(i);
                            found = true;
                            System.out.println("Book Removed Succesfully");

                        break;
                    }
                    }
                    if (!found){
                        System.out.println("Book not found");
                    }
                    break;
                case 4:
                    System.out.println("Search book by search Bookid");
                    int searchid = sc.nextInt();
                    sc.nextLine();
                    boolean foundd = false;
                    i =0;
                    for (i =0;i<books.size();i++){
                        if (books.get(i).bookId==searchid){
                            books.get(i).display();
                            foundd = true;
                            System.out.println("Book id found succesfully");
                            break;
                        }
                    }
                    if (!foundd){
                        System.out.println("Not found");
                    }
                    break;
                case 5:
                    System.out.println("Exiting");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid Choice");






            }

        }
    }
}
