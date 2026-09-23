package WeeklyTurnIn.Assignmnet5;

import UndervisningOnsdag.Arraylist;
import java.util.ArrayList;

public class Library {
    private String libraryName;
    private ArrayList<Book> books;

    public Library(String libraryName) {
        this.libraryName = libraryName;
        this.books = new ArrayList<Book>();

    }

    public String getLibraryName() {
        return libraryName;
    }
    public ArrayList<Book> getbookList() {
        return books;
    }

    public void addBook(Book b) {
        books.add(b);
    }

    public void findAvalaibleBooks() {
        for(Book b : books) {
            if(b.isAvaliable() == true) {
                System.out.println(b);
            }
        }
    }

    public void findBook(String search){
        int check = 0;
        for(Book b : books) {
            if(b.getTitle() == search) {
                System.out.println(b);
                check++;
            }
        }
        if (check == 0) {
            System.out.println("Sadly we could not find " + search + " in our library");
        }
    }




    public String toString() {
        return "Library name: " + libraryName + "\nBooks:\n" + books;
    }
}
