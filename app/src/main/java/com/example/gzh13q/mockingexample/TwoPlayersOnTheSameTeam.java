package com.example.gzh13q.mockingexample;

/**
 * Created by gzh13q on 11/3/2016.
 */

/**
 * Class
 */
public class TwoPlayersOnTheSameTeam extends BaseMessage{
    public TwoPlayersOnTheSameTeam(){

    }

    /**
     * generates a truthful message stating
     * "<Player1> and <Player2> are on the same team"
     * where <Player1> and <Player2> are randomly selected.
     *
     * The message will can be retrieved by calling getMessage()
     *
     * @return true if truthful message can be generated, false if it cannot
     */
    @Override
    public boolean generateMessage(){
        return false;
    }
}
