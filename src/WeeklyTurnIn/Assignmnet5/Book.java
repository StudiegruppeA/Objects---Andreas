package WeeklyTurnIn.Assignmnet5;

public class Book {
        private String title;
        private String author;
        private boolean avaliable;

        public Book(String title, String author, boolean avaliable) {
            if(!title.isEmpty() && !author.isEmpty()) {
                this.title = title;
                this.author = author;
            }
            else{
                this.title = "unknown";
                this.author = "unknown";
            }
            this.avaliable = avaliable;
        }

        public String getTitle() {
            return title;
        }

        public String getAuthor() {
            return author;
        }
        public boolean isAvaliable() {
            return avaliable;
        }

        public void borrow() {
            if(isAvaliable() == true) {
                System.out.println("You have borrowed: " + getTitle() + " By: " + getAuthor());
                avaliable = false;
            }
            else{
                System.out.println("This book is sadly not avaliable");
            }
        }

        public void returnBook() {
            System.out.println("You have returned this book");
            avaliable = true;
        }

        public String toString() {
            return "Name: " + title + "\nBy: " + author + "\nAvaliable: " + avaliable;
        }
}
