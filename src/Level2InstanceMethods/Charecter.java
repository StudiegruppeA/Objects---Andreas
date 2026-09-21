package Level2InstanceMethods;

public class Charecter {
    String name;
    int health;
    int maxhealth;
    int attackpower;

    Charecter(String name, int health, int attackpower) {
        this.name = name;
        this.health = health;
        this.maxhealth = health;
        this.attackpower = attackpower;
    }

    void printStatus() {
        System.out.println("Name: " + name);
        System.out.println("health: " + health + "/" + maxhealth + " (" + getHpProcentage() + ")" );
        System.out.println("Attack Power: " + attackpower);
    }

    void attack(Charecter target) {
        System.out.println(this.name + " Is attacking: " + target.name);
        System.out.println(this.name + "delt " + this.attackpower + " to " + target.name);
        target.takeDmg(this.attackpower);
    }

    void takeDmg(int amount) {
        this.health -= amount;
        if(!isAlive()) {
            this.health = 0;
        }

    }

    void heal(int amount) {
        this.health += amount;
        if(health > maxhealth) {
            health = maxhealth;
        }
    }

    void reset() {
        this.health = 100;
        this.maxhealth = health;
    }

    double getHpProcentage() {
        return ((double) health / maxhealth) * 100;
    }

    boolean isAlive() {
        return health > 0;
    }
}
