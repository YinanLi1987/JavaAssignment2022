package com.game;

import java.util.Random;

public class Game extends Player implements GameInterface {
    private Integer secretNumber;
    private Integer move;
    private Integer moveNumber;
    private Player player;

    Random rand = new Random();

    public Game(Player player) {
        super(name);
        this.secretNumber = rand.nextInt(10) + 1;
        this.move = move;
        this.moveNumber = 0;

    }

    @Override
    public Integer getSecretNumber() {
        return secretNumber;
    }

    @Override
    public void setSecretNumber(Integer secretNumber) {
        this.secretNumber = secretNumber;
    }

    @Override
    public Integer getMove() {
        return move;
    }

    @Override
    public void setMove(Integer move) {
        this.move = move;
    }

    @Override
    public Integer getMoveNumber() {
        return moveNumber;
    }

    @Override
    public void setMoveNumber(Integer moveNumber) {
        this.moveNumber = moveNumber;
    }

    @Override
    public Player getPlayer() {
        // TODO Auto-generated method stub
        return player;
    }

    @Override
    public void setPlayer(Player player) {
        // TODO Auto-generated method stub

    }

}
