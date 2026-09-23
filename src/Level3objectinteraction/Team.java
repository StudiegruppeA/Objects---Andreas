package Level3objectinteraction;

public class Team {
    String name;
    Player[] players;
    int playerCount;

    Team(String name, int maxPlayers) {
        this.name = name;
        this.playerCount = 0;
        this.players = new Player[maxPlayers];
    }

    void addPlayer(Player p) {
        if(playerCount < players.length) {
           players[playerCount] = p;
           playerCount++;
           System.out.println(p.name + " has been added to " + name);
        }
        else {
            System.out.println("The team is full sadly");
        }
    }

    void removePlayer (Player[] p) {
        if(p[0] == null) {
            System.out.println("There are no players to be removed");
        }
        else {
            System.out.println(p[playerCount].name + " has been removed");
            p[playerCount] = null;
            playerCount--;
        }
    }

    void battle(Team target) {
        int random = (int) (Math.random() * players.length - 1);
        int randomTarget = (int) (Math.random() * target.players.length - 1);
        if(target.players[randomTarget] != null && players[random] != null) {
            System.out.println(players[random].name + " is attcking " + target.players[randomTarget].name);
            System.out.println(players[random].name + " Delt " + players[random].attackPower + " damage " + target.players[randomTarget].name);
            target.players[randomTarget].health -= players[random].attackPower;
            System.out.println(target.players[randomTarget].name + " HP: " + target.players[randomTarget].health);
            if (target.players[randomTarget].health < 0) {
                System.out.println(target.players[randomTarget].name + " has died!");
                target.players[randomTarget] = null;
                for (int i = randomTarget; i < target.players.length - 1; i++) {
                    target.players[i] = target.players[i + 1];
                    target.players[i + 1] = null;
                }
            }
        }
    }

    void victoryMsg() {
        System.out.println("Congratz: " + name);
        System.out.println("These brave soldiers survived");
        for(Player p : players) {
            if(p == null) {
                break;
            }
            System.out.println("- " + p.name);
        }
    }

    int getAliveCount() {
       int count = 0;
        for(Player p : this.players) {
            if(p == null) {
                break;
            }
            if(p.health > 0) {
                count++;
            }
        }
        return count;
    }

    /*
    int getTotalScore() {
        int sum = players[0].score;
        for(int i = 1; i < players.length; i++) {
            if(players[i] == null) {
                break;
            }
            sum += players[i].score;
        }
        return sum;
    }

    void printTeam() {
        System.out.println("Team:" + name);
        System.out.println("Players:");
        for(Player p : players) {
            if(p == null) {
                break;
            }
            System.out.println("-" + p.name + " " + p.score);
        }
    }
     */
}
