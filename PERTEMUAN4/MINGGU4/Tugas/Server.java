
package MINGGU4.Tugas;

public class Server {
    private String server;

    public Server(String server) {
        this.server = server;
    }

    public Server() {
    }

    public String getServer() {
        return server;
    }

    public void setServer(String server) {
        this.server = server;
    }
    
    public String info() {
        String info = "";
        info += "Server "+this.server+"\n";
        return info;
    }
}
