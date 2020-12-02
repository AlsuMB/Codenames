package sample.models;

import java.util.ArrayList;


public class Game {
    private Team teamBlue;
    private Team teamRed;
    private ArrayList<String> allWords;
    private ArrayList<TeamColors> wordsColor;
    private int port;
    private String host;

    public Game(Team teamBlue, Team teamRed, ArrayList<String> allWords, ArrayList<TeamColors> wordsColor, int port, String host) {
        this.teamBlue = teamBlue;
        this.teamRed = teamRed;
        this.allWords = allWords;
        this.wordsColor = wordsColor;
        this.port = port;
        this.host = host;
    }

    public void setTeamBlue(Team teamBlue) {
        this.teamBlue = teamBlue;
    }

    public void setTeamRed(Team teamRed) {
        this.teamRed = teamRed;
    }

    public void setAllWords(ArrayList<String> allWords) {
        this.allWords = allWords;
    }

    public void setWordsColor(ArrayList<TeamColors> wordsColor) {
        this.wordsColor = wordsColor;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public Team getTeamBlue() {
        return teamBlue;
    }

    public Team getTeamRed() {
        return teamRed;
    }

    public ArrayList<String> getAllWords() {
        return allWords;
    }

    public ArrayList<TeamColors> getWordsColor() {
        return wordsColor;
    }

    public int getPort() {
        return port;
    }

    public String getHost() {
        return host;
    }
}
