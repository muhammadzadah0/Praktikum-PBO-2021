
package MINGGU4.Tugas;

public class Player {
    private String name;
    private String nickname;
    private String role;

    public Player(String name, String nickname, String role) {
        this.name = name;
        this.nickname = nickname;
        this.role = role;
    }

    public Player() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
    
    public String info() {
        String info = "";
        info += "Name: "+this.name+"\n";
        info += "Nickname: "+this.nickname+"\n";
        info += "Role: "+this.role+"\n";
        return info;
    }
}
