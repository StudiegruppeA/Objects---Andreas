package WeeklyTurnIn.Assignment4;

import java.util.ArrayList;

public class Team {
    private String teamName;
    private ArrayList<Player> players;

    public Team(String teamName) {
        this.teamName = teamName;
        this.players = new ArrayList<Player>();
    }

    public void addPlayer(Player p) {
        System.out.println("player" + p.getName());
        players.add(p);
    }

    public double getAverageskill() {
        double average = 0;

        for (Player p : players) {
            average += p.getSkill();
        }
        System.out.println("The average skill on " + teamName + " is: " + average/players.size());
        return  average/players.size();
    }

    public void compete(Team target) {
        if(this.getAverageskill() > target.getAverageskill()) {
            System.out.println(this.teamName + " IS THE WINNER ");
            System.out.println(this.getAverageskill() - target.getAverageskill() + " more points!");

        }


    }
    public String toString() {
        return "Team name: " + teamName + "\n Players: \n" +players;
    }

    public void bestPlayer() {
        Player best = players.get(0);

        for(Player p : players) {
            if(p.getSkill() > best.getSkill()) {
                best = p;
            }
        }
        System.out.println(best);
    }

}
