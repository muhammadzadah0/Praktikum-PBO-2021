package MINGGU4.Tugas;

public class Team {

    private String team;
    private Player player;

   

    public Team(String team, Player player) {
        this.team = team;
        this.player = player;
    }

    

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
    
public String info() {
        String info = "";
        info += "Team: "+this.team+"\n";
        info += "Player: "+this.player.info()+"\n";
        return info;
    }
}


