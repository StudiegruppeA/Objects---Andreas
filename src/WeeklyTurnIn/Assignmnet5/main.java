package WeeklyTurnIn.Assignmnet5;

public class main {

    void main() {
        Library l1 = new Library("Hillerød");
        Book b1 = new Book("", "orwell", true);


        l1.addBook(b1);

        System.out.println(l1);

        b1.borrow();

        System.out.println(l1);
        l1.findBook("198sadsad");


    }
}
