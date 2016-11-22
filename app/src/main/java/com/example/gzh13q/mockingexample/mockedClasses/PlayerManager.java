package com.example.gzh13q.mockingexample.mockedClasses;
/**
 * Created by gzh13q on 11/3/2016.
 */

import java.util.List;

/**
 * Stubbed class that exposes the API of a PlayerManager
 */
public class PlayerManager {
    public PlayerManager(){

    }


    /**
     * Get all players ordered by when they were added
     * @return an ordered list of all the Players
     */
    public List<Player> getPlayers(){
        throw new UnsupportedOperationException("This method needs to be Mocked");
    }

    /**
     * Get all the players in a random order
     * @return a randomized list of all the Players
     */
    public List<Player> getRandomPlayers(){
        throw new UnsupportedOperationException("This method needs to be Mocked");
    }
}
