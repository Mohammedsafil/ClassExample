package test5;
import java.util.Scanner;
import java.util.ArrayList;

public class main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    ArrayList<Book> books = new ArrayList<Book>();
    System.out.print("Enter number of Book's details to be stored");
    int n = sc.nextInt();
    sc.nextLine();

    for(int i=0;i<n;i++){
        System.out.println("Enter the details for book"+(i+1));
        System.out.print("Enter Book's Title");
        String title = sc.nextLine();
        System.out.print("Enter Book's Author");
        String author = sc.nextLine();
        System.out.print("Enter Book's Year");
        int year = sc.nextInt();

        books.add(new Book(title, author, year));
    }

    System.out.println("/n Details of the book");
    for(Book book : books){
        book.bookDetails();
    }
  }  
}


class Book{
    private String title;
    private String author;
    private int year;

    public Book(String title, String author,int year){
        this.title=title;
        this.author=author;
        this.year=year;
    }

    public void bookDetails(){
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
        System.out.println("Year: "+year);
    }
}