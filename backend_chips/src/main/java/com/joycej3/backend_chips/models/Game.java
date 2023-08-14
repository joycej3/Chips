package com.joycej3.backend_chips.models;

public class Game {
    private int numPlayers;
    private int dealer;
    private int gameName;
    private int gamePassword;

    public Game(){}

    public Game(int numPlayers, int dealer, int gameName, int gamePassword){
        this.numPlayers = numPlayers;
        this.dealer = dealer;
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
    public int getDealer() {
        return dealer;
    }
    public void setDealer(int dealer) {
        this.dealer = dealer;
    }
    public int getNumPlayers() {
        return numPlayers;
    }
    public void setNumPlayers(int numPlayers) {
        this.numPlayers = numPlayers;
    }
}
