package MINGGU4.Tugas;

public class TugasMain {

    public static void main(String[] args) {
        Player p = new Player("Ye Xiu", "Lord Grim", "Unspecialized");
        Team t = new Team("Happy", p);
        Server s = new Server("10");
        GloryGame g = new GloryGame("Lord Grim", s, t);

        g.informasi();
    }

}
