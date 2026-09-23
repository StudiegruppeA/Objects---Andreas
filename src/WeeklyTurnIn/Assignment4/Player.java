package WeeklyTurnIn.Assignment4;

public class Player {

    private String name;
    private int skill;

    public Player(String name, int skill) {
        this.name = name;
        if(skill >= 0 && skill <= 100){
            this.skill = skill;
        }
    }

    public String getName() {
        return name;
    }

    public int getSkill(){
        return skill;
    }




    public String toString() {
        return "Name: " + name + "\n Skill: " + skill;
    }

}
