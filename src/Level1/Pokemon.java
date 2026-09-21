package Level1;

public class Pokemon {
    String name;
    int hp;
    int level;

    Pokemon(String name, int hp, int level){
        this.name = name;
        this.hp = hp;
        this.level = level;
    }


    public void getAverageHP(Pokemon[] name) {
        int total = 0;
        for (int i = 0; i < name.length; i++) {
            total = total + name[i].hp;
        }
        System.out.println(total / name.length);
    }
}
