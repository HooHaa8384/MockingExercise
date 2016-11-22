package com.example.gzh13q.mockingexample;

/**
 * Created by gzh13q on 11/4/2016.
 */

public class XPlayersOnTeamY extends BaseMessage {

    public XPlayersOnTeamY() {

    }

    /**
     * generates a truthful message stating
     * "<X> players are on team number <Y>"
     * where team <Y> is randomly selected</Y>
     * 
     * The message will can be retrieved by calling getMessage()
     *
     * @return true if truthful message can be generated, false if it cannot
     */
    @Override
    public boolean generateMessage() {
        return false;
    }
}
