package com.joycej3.backend_chips.models;

public class Game {
    private int numPlayers;
    private int gameName;
    private int gamePassword;

    public Game(){}

    public Game(int numPlayers, int gameName, int gamePassword){
        this.numPlayers = numPlayers;
        this.gameName = gameName;
        this.gamePassword = gamePassword;
    }

//    Getters and Setters
    public int getGamePassword() {
        return gamePassword;
    }
    public void setGamePassword(int gamePassword) {
        this.gamePassword = gamePassword;
    }
    public int getGameName() {
        return gameName;
    }
    public void setGameName(int gameName) {
        this.gameName = gameName;
    }
    public int getNumPlayers() {
        return numPlayers;
    }
    public void setNumPlayers(int numPlayers) {
        this.numPlayers = numPlayers;
    }
}
