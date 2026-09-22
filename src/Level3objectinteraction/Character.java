package Level3objectinteraction;

public class Character {
    String name;
    int health;
    Weapon weapon;

    Character(String name, int health) {
        this.name = name;
        this.health = health;
        this.weapon = null;
    }

    void equip(Weapon w) {
        weapon = w;
        System.out.println(name + " has equppied " + w.name);
    }

    void takeDmg(int damage) {
        health -= damage;
        if (health < 0) {
            health = 0;
        }
    }

    void attack(Character target) {
        if(weapon == null) {
            System.out.println(name + " does not have a weapon");
        }
        else {
            System.out.println(name + " attacks " + target.name);
            target.takeDmg(weapon.damage);
        }
    }

    void printStatus() {
        System.out.println("Name: " + name);
        System.out.println("HP: " + health);
        if(weapon == null) {
            System.out.println("No weapon qupiqed currently");
        }
        else {
            System.out.println("Current weapon " + weapon.name);
        }
    }

    boolean isAlive() {
        if (health > 0) {
            return true;
        }
        else {
            return false;
        }
    }




    }
