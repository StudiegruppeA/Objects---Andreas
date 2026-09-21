package Level1ClassesAndObjectsBasics;

import java.util.Scanner;
public class Level1ClassesAndObjectsBasics {

    Scanner input = new Scanner(System.in);
    Students student[] = new Students[5];
    Pokemon pokemon[] = new Pokemon[5];
    Car car[] = new Car[4];
    Monster monster[] = new Monster[5];
    Hero team1[] = new Hero[3];
    Hero team2[] = new Hero[3];

    void main() {
        /*
        //Assignment 1
        Book[] array = new Book[3];

        array[0] = new Book("1984", "orwell", 324);
        array[1] = new Book("Animal farm", "Orwell", 124);
        array[2] = new Book("Serotonin", "Humlumbeck", 320);


        for(Book ar: array) {
            System.out.println(ar.getName());
            System.out.println(ar.getPages());
        }

        array[0].name = "test";

        System.out.println(array[0].name);
         */

        //Assignent 5
        /*
        Pokemon pikachu = new Pokemon("Pikacu", 25);
        Pokemon charrizard = new Pokemon("Charizard", 20);
        Pokemon bulbasa = new Pokemon("Bulbasar", 30);

        System.out.println(pikachu.name + " is Level " + pikachu.level);
        System.out.println(pikachu.name + " And " + charrizard.name + " Combined levels is " + (pikachu.level + charrizard.level));

        System.out.println("=========");
        printPokemon(charrizard);

        Enemy orc = new Enemy("Orc", 100, 25);

        printEnemy(orc);

        takeDmg(orc, 100);

        printEnemy(orc);

        //Assignment 10
        System.out.println("Is he alive? " + isAlive(orc));

        //Assignment 13
        Car ferrai = new Car("Ferrari", 100);
        Car bugatti = new Car("Bugatti", 200);


        System.out.println("Is Ferrari speeding? " + checkIfSpeeding(ferrai));
        System.out.println("Is Bugatti speeding? " + checkIfSpeeding(bugatti));




        //Assignment 13
        Pokemon bulbasaur = new Pokemon("Bulbasaur", 100, 10);

        printPokemon(bulbasaur);
        for(int i = 0; i < 3; i++){
            levelUpPokemon(bulbasaur);
        }
        printPokemon(bulbasaur);

        //Assignment 14

        Pokemon gro = new Pokemon("gro", 100, 10);
        Pokemon hund = new Pokemon("Hund", 130, 20);

        printHighLevelPokemon(gro, hund);

        Car car = new Car("ford", 100);

        car.incrementSpeed(10);

        System.out.println(car.getSpeed());
        //Assignment 15
        BankAccount account = new BankAccount ("Andreas", 100);

        printBankAccount(account);
        whitdrawn(account, getAmount());
        printBankAccount(account);

        //Assignment 17

        makeStudent(0, "Andreas", 20);
        makeStudent(1, "Lars", 20);
        makeStudent(2, "Phillip", 10);
        makeStudent(3, "Sofie", 19);
        makeStudent(4, "Anne-MArie", 30);


        printAllStudentInformation();



        System.out.println(student[0].name);
         */

        makePokemon(0, "Charrizard", 10, 31);
        makePokemon(1, "Bulbasour", 90, 28);
        makePokemon(2, "Pikachu", 99, 11);
        makePokemon(3, "Charmander", 50, 12);
        makePokemon(4, "Evee", 20, 17);


        makeStudent(0, "Tanya", 27);
        makeStudent(1, "Andreas", 24);
        makeStudent(2, "Jonas", 25);
        makeStudent(3, "Anne-Maire", 10);
        makeStudent(4, "Maja", 20);

        makeCar(0, "Ford", 162);
        makeCar(1, "Volkswagen", 112);
        makeCar(2, "Squash", 108);
        makeCar(3, "Ferrai", 140);


        makeMonster(monster, 0, "Jkuasd", "Fire", 200);
        makeMonster(monster, 1, "Jkuasd", "Fire", 200);
        makeMonster(monster, 2, "Jkuasd", "Fire", 200);
        makeMonster(monster, 3, "Jkuasd", "Water", 200);
        makeMonster(monster, 4, "Jkuasd", "water", 200);

        team1[0] = new Hero("Ame", 100, 20, 10, 3);
        team1[1] = new Hero("xnova", 100, 30, 10, 4);
        team1[2] = new Hero("XSS", 100, 14, 10, 4);


        team2[0] = new Hero("Amar", 100, 20, 10, 3);
        team2[1] = new Hero("Malrine", 100, 30, 10, 4);
        team2[2] = new Hero("Crit", 100, 14, 10, 4);

        teamBattle(team1, team2);

        printHeroStats(team2[1]);

    }

    void teamBattle (Hero[] t1, Hero[] t2) {
        for (Hero attacker : t1){
            for (Hero defender : t2) {
                System.out.println(attacker.heroName + " Is attacking " + defender.heroName);
                System.out.println(defender.heroName + " took " + damageCalculation(attacker.heroAttackPower, defender.heroDefense, defender.heroLevel));
                defender.heroHP -= damageCalculation(attacker.heroAttackPower, defender.heroDefense, defender.heroLevel);
            }
        }
    }


    void heroFight (Hero h1, Hero h2) {
        System.out.println(h1.heroName + " Is attacking!");
        System.out.println(h2.heroName + " took " + damageCalculation(h1.heroAttackPower, h2.heroDefense, h2.heroLevel) );
        h2.heroHP -= damageCalculation(h1.heroAttackPower, h2.heroDefense, h2.heroLevel);
    }

    int damageCalculation(int haDmg, int hdDefese, int hdLevel) {
        return haDmg - hdDefese - hdLevel;
    }

    void heroLevelUp(Hero hero) {
        System.out.println("Your Hero Level up!!!");
        hero.heroLevel++;
        hero.heroHP += 20;
        hero.heroAttackPower += 5;
        hero.heroDefense += 3;
    }

    void printHeroStats(Hero hero) {
        System.out.println("Name: " + hero.heroName);
        System.out.println("Level: " + hero.heroLevel);
        System.out.println("HP: " + hero.heroHP);
        System.out.println("Attack power: " + hero.heroAttackPower);
        System.out.println("Defensive Rating:" + hero.heroDefense);
    }



    boolean isPokemonDead(Pokemon[] team, int index) {
        if (team[index].hp <= 0){
            return true;
        }

        return false;
    }


    void makeMonster(Monster[] monsterarray, int index, String monsterName, String monsterType, int monsterLevel ) {
        monsterarray[index] = new Monster(monsterName, monsterType, monsterLevel);
    }

    int countMonsterTypes(Monster[] monsterArray){
        int count = 0;
        for(Monster monster : monsterArray) {
            if(monster.type.equalsIgnoreCase("water")) { //Do this .equalsIgnoreCase in order to ignore case sensetivity
                count++;
            }
        }
        return count;
    }
    void printPokemomTeam(Pokemon[] team) {
        for (Pokemon pokemon : team) {
            System.out.println("pokemon name: " + pokemon.name);
            System.out.println("Pokemon hp: " + pokemon.hp);
        }
    }


    void healPokemonTeam(Pokemon[] team, int amount) {
        for(int i = 0; i < team.length; i++) {
            team[i].hp += 30;
            if(team[i].hp > 100) {
                team[i].hp -= (team[i].hp - 100);
            }
        }
    }

    int findPokemonMostHP(Pokemon[] array) {
        int indexOfMax = 0;
        int maxHP = array[0].hp;
        for(int i = 1; i < array.length; i++) {
            if(array[i].hp > maxHP) {
                indexOfMax = i;
                maxHP = array[i].hp;
            }
        }
        return indexOfMax;
    }

    void printNameOfMostHp(Pokemon[] array) {
        System.out.println("The pokemon with the most hp is: " + pokemon[findPokemonMostHP(array)].name);
        System.out.println("HP" + pokemon[findPokemonMostHP(array)].hp);
    }

    boolean doesCarExsists(Car[] array, String nameOfCar) {
        for(int i = 0; i < array.length; i++) {
            if(array[i].getBrand() == nameOfCar) {
                return true;

            }
        }
        return false;
    }


    int indexOfStudent(Students[] student, String nameOfStudent) {
        for(int i = 0; i < student.length; i++){
            if(student[i].name == nameOfStudent) {
                return i;
            }
        }
       return -1;
    }

     int findSpeedingCars(Car[] array, int speed) {
            for (int i = 0; i < array.length; i++){
                if(array[i].getSpeed() >= 130) {
                    return i;
                }
            }
            return -1;
        }

    void makeCar(int index, String brand, int speed) {
        car[index] = new Car(brand, speed);
    }

    void reducePokemonHP(Pokemon[] name, int amount) {
        for(int i = 0; i < name.length; i++) {
            name[i].hp -= amount;
        }
    }

    double getAverageHP(Pokemon[] name) {
        int total = 0;
        for (int i = 0; i < name.length; i++) {
            total = total + name[i].hp;
        }
       return total / name.length;
    }

    int getHealthyPokemon() {
        int countHealthyPokemon = 0;
        for(int i  = 0; i < pokemon.length; i++) {
            if(pokemon[i].hp >= 50 ) {
                countHealthyPokemon++;
            }
        }
        return countHealthyPokemon;
    }


    void printAllStudentInformation() {
        for(Students ar : student) {
            System.out.println(ar.name);
            System.out.println(ar.age);
        }
    }

    void makeStudent(int index, String studentName, int studentAge) {
        student[index] = new Students(studentName, studentAge);

    }

    void makePokemon(int index, String pokemonName, int pokemonHP, int pokemonLevel){
        pokemon[index] = new Pokemon(pokemonName, pokemonHP, pokemonLevel);
    }


    int getAmount(){
        System.out.println("What is the amount?");
        return input.nextInt();
    }

    void printBankAccount(BankAccount name) {
        System.out.println("Owner is " + name.owner);
        System.out.println("Balance is currently: " + name.balance);
    }

    void whitdrawn(BankAccount name, int amount) {
        if(name.getBalance() > amount) {
            System.out.println("Sufficient funds");
            name.whitdrawnMoney(amount);
        }
        else {
            System.out.println("Insufficient funds");
        }

    }

    void printHighLevelPokemon(Pokemon name1, Pokemon name2) {
        if(name1.level > name2.level){
            System.out.println(name1.name + " is the highest level with it being " + name1.level);
        }
        else {
            System.out.println(name2.name + " has the highest level with it being " + name2.level);
        }
    }
    void levelUpPokemon(Pokemon name){
        name.level += 1;
        name.hp += 10;
    }
    boolean checkIfSpeeding(Car name) {
        if(name.getSpeed() > 130) {
            return true;
        }
        return false;
    }

    void printEnemy (Enemy name) {
        System.out.println(name.name);
        System.out.println(name.hp);
        System.out.println(name.damage);
    }
    void takeDmg(Enemy name, int dmg) {
        name.hp -= dmg;
    }
    boolean isAlive(Enemy name){
        if (name.hp > 0) {
            return true;
        }
        return false;
    }




        void printPokemon (Pokemon name){
            System.out.println(name.name);
            System.out.println(name.hp);
           System.out.println(name.level);
        }

}
