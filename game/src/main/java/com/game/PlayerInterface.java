package com.game;

interface PlayerInterface {
    String getName();

    void setName(String name);

    Integer getGamesPlayed();

    void setGamesPlayed(Integer gamesPlayed);

    Integer getTotalMoves();

    void setTotalMoves(Integer totalMoves);

    void createPlayerFile();

    /**
     * @return
     */
    String getPlayerInfo();

}
