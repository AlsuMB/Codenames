package sample.models;

public class User {
    private String name;
    private boolean is_captain;
    private TeamColors colorTeam;
    private String host;
    private int port;

    public User(String name, boolean is_captain, TeamColors colorTeam, String host, int port) {
        this.name = name;
        this.is_captain = is_captain;
        this.colorTeam = colorTeam;
        this.host = host;
        this.port = port;
    }

    public String getName() {
        return name;
    }

    public boolean isIs_captain() {
        return is_captain;
    }

    public TeamColors getColorTeam() {
        return colorTeam;
    }

    public String getHost() {
        return host;
    }

    public int getPort() {
        return port;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIs_captain(boolean is_captain) {
        this.is_captain = is_captain;
    }

    public void setColorTeam(TeamColors colorTeam) {
        this.colorTeam = colorTeam;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public void setPort(int port) {
        this.port = port;
    }
}
