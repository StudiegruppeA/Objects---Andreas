package WeeklyTurnIn.Assignment4;

public class main {

    void main() {

        Team t1 = new Team("SKT");
        Team t2 = new Team("Spirt");

        Player p1 = new Player("Andreas", 30);
        Player p2 = new Player("Jonas", 100);
        Player p3 = new Player("Mikal", 20);

        Player p4 = new Player("faker", 20);
        Player p5 = new Player("Jul", 30);
        Player p6 = new Player("MSimone", 20);


        t1.addPlayer(p1);
        t1.addPlayer(p2);
        t1.addPlayer(p3);
        t2.addPlayer(p4);
        t2.addPlayer(p5);
        t2.addPlayer(p6);


        System.out.println(t1);
        System.out.println(t2);


        t1.bestPlayer();

        UtilPrint.divider();
    }
}
