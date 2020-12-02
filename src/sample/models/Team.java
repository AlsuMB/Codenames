package sample.models;

import java.util.List;

public class Team {
    private TeamColors colorTeam;
    private User captain;
    private List<User> otherTeam;
    private int port;
    private String host;

    public Team(TeamColors colorTeam, User captain, List<User> otherTeam, int port, String host) {
        this.colorTeam = colorTeam;
        this.captain = captain;
        this.otherTeam = otherTeam;
        this.port = port;
        this.host = host;
    }

    public void setColorTeam(TeamColors colorTeam) {
        this.colorTeam = colorTeam;
    }

    public void setCaptain(User captain) {
        this.captain = captain;
    }

    public void setOtherTeam(List<User> otherTeam) {
        this.otherTeam = otherTeam;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public TeamColors getColorTeam() {
        return colorTeam;
    }

    public User getCaptain() {
        return captain;
    }

    public List<User> getOtherTeam() {
        return otherTeam;
    }

    public int getPort() {
        return port;
    }

    public String getHost() {
        return host;
    }
}
