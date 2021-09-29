
package MINGGU4.Tugas;

public class GloryGame {
    private String topPlayer;
    private Server server;
   
    private Team team;

    public GloryGame(String topPlayer, Server server, Team team) {
        this.topPlayer = topPlayer;
        this.server = server;
        this.team = team;
    }

  

    public GloryGame() {
    }

    public String getTopPlayer() {
        return topPlayer;
    }

    public void setTopPlayer(String topPlayer) {
        this.topPlayer = topPlayer;
    }

    public Server getServer() {
        return server;
    }

    public void setServer(Server server) {
        this.server = server;
    }

  

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }
    
    public String info() {
        String info = "";
        info += "Top Player: " + this.topPlayer + "\n";
        info += "Team: " + this.team.info() + "\n";
        info += "Server: " + this.server.info() + "\n";
//        
        return info;
    }
}
