package WeeklyTurnIn.Assignment1;

public class main {

    void main() {

        Student[] array = new Student[3];
         array[0] = new Student("naya", 20);
         array[1] = new Student("Julius", 30);
         array[2] = new Student("Andreas", 28);

        for (Student a : array) {
            a.printInfo();
        }

        Student.findOldestStudent(array);
    }

}
