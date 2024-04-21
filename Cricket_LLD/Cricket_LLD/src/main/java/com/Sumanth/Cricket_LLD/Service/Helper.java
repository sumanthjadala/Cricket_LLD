package com.Sumanth.Cricket_LLD.Service;

import com.Sumanth.Cricket_LLD.Model.Player;
import com.Sumanth.Cricket_LLD.Model.Team;

public class Helper {
    public static void chooseBowler(Team bowlingTeam, Player prevBowler) {
        System.out.println("Avaliable Bowlers :");
        for(Player p:bowlingTeam.getTeamMembers()){
            if(prevBowler==null || !p.equals(prevBowler)){
                System.out.print(p.getName()+" ");
            }
        }
        System.out.println();

    }
    public static Player searchPlayer(Team  bowlingTeam,String name){
        for(Player p:bowlingTeam.getTeamMembers()){
            if(p.getName().equals(name)){
                return p;
            }
        }
        return null;
    }
    public static int getCurrentBowlScore(String bowl){
        int score=0;
        switch (bowl){
            case "0":
                score=0;
                break;
            case "1":
                score=1;
                break;
            case "2":
                score=2;
                break;
            case "3":
                score=3;
                break;
            case "4":
                score=4;
                break;
            case "6":
                score=6;
                break;
            case "Wide":
                score=1;
                break;
            case "Wicket":
                score=-1;
                break;
            case "NB":
                score=1;
                break;

        }
        return score;
    }

}
