package Level3objectinteraction;

public class main {
     void main() {

          Team t1 = new Team("Xg", 3);
          Team t2 = new Team("Falcons", 100);

          Player p1 = new Player("cri1", 100, 30);
          Player p2 = new Player("Amar", 120, 90);
          Player p3 = new Player("Malrine", 90, 20);

          Player p4 = new Player("Ame", 70, 20);
          Player p5 = new Player("xNova", 80, 30);
          Player p6 = new Player("xss", 120, 34);


          t1.addPlayer(p4);
          t1.addPlayer(p5);
          t1.addPlayer(p6);

          t2.addPlayer(p1);
          t2.addPlayer(p2);
          t2.addPlayer(p3);

         combat(t1, t2);

     }


     void combat (Team a, Team b) {
          while (a.getAliveCount() > 0 && b.getAliveCount() > 0) {
               a.battle(b);
               b.battle(a);
          }
          if(a.getAliveCount() > 0) {
               a.victoryMsg();
          }
          else {
               b.victoryMsg();
          }

     }
}
