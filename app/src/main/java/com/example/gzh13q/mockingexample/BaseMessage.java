package com.example.gzh13q.mockingexample;

/**
 * Created by gzh13q on 11/4/2016.
 */

public abstract class BaseMessage {
    public BaseMessage(){

    }

    public String getMessage(){
        return "This needs to be implemented";
    }

    public abstract boolean generateMessage();
}
