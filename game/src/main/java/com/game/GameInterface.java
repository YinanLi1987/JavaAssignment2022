package com.game;

interface GameInterface {

    Integer getSecretNumber();

    void setSecretNumber(Integer secretNumber);

    Integer getMove();

    Integer getMoveNumber();

    void setMove(Integer move);

    void setMoveNumber(Integer moveNumber);

    Player getPlayer();

    void setPlayer(Player player);

}
