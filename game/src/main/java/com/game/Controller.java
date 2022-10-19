package com.game;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    private Game game = null;
    private Player player = null;

    // to create a new player in the game server, parameter player name
    @PostMapping("player")
    public void createPlayer(@RequestParam String name) {
        player = new Player(name);
        player.createPlayerFile();

    }

    // to get player information from the playerInfo file

    @GetMapping("/player")
    public String getPlayer() {

        return player.getPlayerInfo();
    }

    // to create and play a new game in the server
    @PostMapping("/game")
    public void createGame() {
        game = new Game(player);
    }

    // get the information of the game
    @GetMapping("/game")
    public Game getGame() {
        return game;
    }

    // make moves
    @PutMapping("/game")
    public String giveMove(@RequestParam Integer move) {

        if (move > game.getSecretNumber()) {
            game.setMoveNumber(game.getMoveNumber() + 1);
            player.setTotalMoves(player.getTotalMoves() + 1);
            game.setTotalMoves(player.getTotalMoves());
            player.createPlayerFile();
            return "The number is smaller.";
        } else if (move < game.getSecretNumber()) {
            game.setMoveNumber(game.getMoveNumber() + 1);
            player.setTotalMoves(player.getTotalMoves() + 1);
            game.setTotalMoves(player.getTotalMoves());
            player.createPlayerFile();

            return "The number is bigger.";

        } else {
            game.setMoveNumber(game.getMoveNumber() + 1);
            player.setTotalMoves(player.getTotalMoves() + 1);
            game.setTotalMoves(player.getTotalMoves());
            player.setGamesPlayed(player.getGamesPlayed() + 1);
            game.setGamesPlayed(player.getGamesPlayed());
            player.createPlayerFile();
            return "Correct! You used " + game.getMoveNumber() + " moves.";
        }
    }
}
