package com.example.gzh13q.mockingexample.mockedClasses;

/**
 * Created by gzh13q on 11/3/2016.
 */

public class Player {
    private String mName;
    private int mRole;
    private int mTeam;

    Player(int team){
        this(team, -1);
    }

    Player(int team, int role){
        this(team, role, null);
    }

    Player(int team, int role, String name){
        mName = name;
        mRole = role;
        mTeam = team;
    }

    public String getName() {return mName; }
    public int getRole() {
        return mRole;
    }
    public int getTeam() {
        return mTeam;
    }
}
