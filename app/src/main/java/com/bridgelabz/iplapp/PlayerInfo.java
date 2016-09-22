package com.bridgelabz.iplapp;

/**
 * Created by Nadimuddin on 20/9/16.
 */
public class PlayerInfo
{
    String player_name;
    String player_batting_style;
    String player_bowling_style;
    String player_dob;
    String player_nationality;
    String player_role;

    //Default constructor
    public PlayerInfo()
    {

    }

    /*PlayerInfo(String name, String playerBatting, String playerBowling, String dOB, String nationality, String role)
    {
        player_name = name;
        player_batting_style = playerBatting;
        player_bowling_style = playerBowling;
        player_dob = dOB;
        player_nationality = nationality;
        player_role = role;
    }*/

    //get player name
    public String getPlayerName()
    {
        return  player_name;
    }

    //get player's batting style
    public String getBatting()
    {
        return "Batting style: "+player_batting_style;
    }

    //get player's bowling style
    public String getBowling()
    {
        return  "Bowling style: "+player_bowling_style;
    }

    //get DOB of player
    public  String getDOB()
    {
        return "DOB: "+player_dob;
    }

    //get player's nationality
    public String getNationality()
    {
        return "Nationality: "+player_nationality;
    }

    //get player's role
    public String getRole()
    {
        return "Role: "+player_role;
    }

    //get background image for each RecyclerView
    public int getLogoId()
    {
        return R.drawable.mumbai_indian;
    }
}