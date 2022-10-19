package com.game;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class Player implements PlayerInterface {

    protected static String name;
    protected static Integer gamesPlayed;
    protected static Integer totalMoves;

    public Player(String name) {
        this.name = name;
        this.gamesPlayed = 0;
        this.totalMoves = 0;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Integer getGamesPlayed() {
        return gamesPlayed;
    }

    @Override
    public void setGamesPlayed(Integer gamesPlayed) {
        this.gamesPlayed = gamesPlayed;
    }

    @Override
    public Integer getTotalMoves() {
        return totalMoves;
    }

    @Override
    public void setTotalMoves(Integer totalMoves) {
        this.totalMoves = totalMoves;

    }

    @Override
    public void createPlayerFile() {
        String[] playerInfo = { this.name, this.gamesPlayed.toString(), this.totalMoves.toString() };
        try {
            File playerFile = new File("player.txt");
            playerFile.createNewFile();
            PrintStream writer = null;
            writer = new PrintStream("player.txt");
            for (String i : playerInfo) {
                writer.println(i);
            }

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
        }
    }

    @Override
    public String getPlayerInfo() {

        try {
            File playerFile = new File("player.txt");
            Scanner reader = null;
            reader = new Scanner(playerFile);
            name = reader.nextLine();
            gamesPlayed = Integer.parseInt(reader.nextLine());
            totalMoves = Integer.parseInt(reader.nextLine());

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
        }
        return "{\nname: " + name + ", \ngamesPlayed: " + gamesPlayed + ",\ntotalMoves: " + totalMoves + "\n}";
    }
}
