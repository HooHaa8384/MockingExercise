package com.example.gzh13q.mockingexample;

/**
 * Created by gzh13q on 11/21/2016.
 */

public class LastPlayerOnTeam extends BaseMessage{
    public LastPlayerOnTeam(){

    }

    /**
     * generates a truthful message stating
     * "<Player Name> is the only player on team <X>"
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
