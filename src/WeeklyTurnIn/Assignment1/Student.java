package WeeklyTurnIn.Assignment1;

public class Student {
    private String name;
    private int age;
    private int ID;
    private static int count = 0;


   public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.ID = count+1;
        count++;

    }

    void printInfo() {
        System.out.println("name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("ID: " + this.ID);
    }

    public int getAge() {
       return this.age;
    }

    public static void findOldestStudent(Student[] array) {
       Student oldest = array[0];
       for(int i = 0; i < array.length; i++) {
           if (array[i].getAge() > oldest.getAge()) {
               oldest = array[i];
           }
       }
       oldest.printInfo();
    }

}
