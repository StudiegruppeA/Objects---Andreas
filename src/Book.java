public class Book {
       String name;
       private String author;
       private int pages;

        Book(String name, String author, int pages){ //Constructor HAS TO HAVE THE SAME NAME AS class
            this.name = name; //this. is to specefy what the object is.
            this.author = author;
            this.pages = pages;
        }

        int getPages() { //When using private and its this
            return pages;
        }

        String getName() {
            return name;
        }
    }
