package com.Sumanth.Cricket_LLD.Service;

import com.Sumanth.Cricket_LLD.Model.Player;
import com.Sumanth.Cricket_LLD.Model.Team;

public class ScoreBoard {
    public  static void matchResult(Team teamA,Team teamB){
        if(teamA.getTotalTeamScore()>teamB.getTotalTeamScore()){
            System.out.println("Match win by "+ teamA.getTeamName());
        }else if(teamA.getTotalTeamScore()<teamB.getTotalTeamScore()){
            System.out.println("Match win by "+ teamB.getTeamName());
        }else{
            System.out.println("Match was Tied");
        }
    }
    public static void inningByTeam(Team battingTeam,Team bowlingTeam){
        System.out.println(battingTeam.getTeamName()+" Batting ScoreCard");
        for(Player p:battingTeam.getTeamMembers()){
            System.out.println(p);
        }
        System.out.println("Score : "+battingTeam.getTotalTeamScore()+"/"+battingTeam.getWicketsFallen()+"  " +bowlingTeam.getNoOfOversBowled()+"."+bowlingTeam.getLastOverBowl());
        System.out.println(bowlingTeam.getTeamName()+" Bowling ScoreCard");
        System.out.println("Bowler_Name     Overs      Runs     Wickets");
        for(Player p:bowlingTeam.getTeamMembers()){
            if(p.getRunsConceded()!=0){
                System.out.println(p.getName()+"         "+p.getNoOfBowlsBowled()/6+"."+p.getNoOfBowlsBowled()%6+"           "+p.getRunsConceded()+"       "+p.getNowicketedTaken());
            }
        }
    }
}
