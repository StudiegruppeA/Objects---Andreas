package Level2InstanceMethods;

public class Athlete {

    String name;
    int stamina;
    int score;

    Athlete(String name, int stamina, int score) {
        this.name = name;
        this.stamina = stamina;
        this.score = score;
    }

    void train() {
        System.out.println("You had a good traning session");
        stamina -= 1;
        score += 1;
    }

    void compete() {
        System.out.println("you competed");
        stamina -= 2;
        score += 2;
    }

    void rest() {
        System.out.println("you rested");
        stamina += 2;
    }

    void printAll() {
        System.out.println("name" + name);
        System.out.println("Stamina" + stamina);
        System.out.println("score" + score);
    }
}
