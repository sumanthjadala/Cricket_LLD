package com.Sumanth.Cricket_LLD.Model;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private int id;
    private String teamName;
    private int totalTeamScore=0;
    private int wicketsTaken=0;
    private int wicketsFallen=0;
    private int noOfOversBowled=0;
    private int lastOverBowl=0;
    private List<Player> teamMembers=new ArrayList<>();
    public Team(int id, String teamName) {
        this.id = id;
        this.teamName = teamName;
    }

    public int getId() {
        return id;
    }



    public String getTeamName() {
        return teamName;
    }



    public int getTotalTeamScore() {
        return totalTeamScore;
    }

    public void setTotalTeamScore(int Score) {
        this.totalTeamScore+=Score;
    }

    public int getWicketsTaken() {
        return wicketsTaken;
    }

    public void setWicketsTaken() {
        this.wicketsTaken++;
    }

    public int getWicketsFallen() {
        return wicketsFallen;
    }

    public void setWicketsFallen() {
        this.wicketsFallen+=1;
    }

    public int getNoOfOversBowled() {
        return noOfOversBowled;
    }

    public void setNoOfOversBowled() {
        this.noOfOversBowled ++;
    }
    public int getLastOverBowl() {
        return lastOverBowl;
    }
    public void setLastOverBowl() {
        this.lastOverBowl++;
        if(lastOverBowl==6){
            setNoOfOversBowled();
            lastOverBowl=0;
        }
    }
    public List<Player> getTeamMembers() {
        return teamMembers;
    }
    public Player getPlayer(int position){
        return teamMembers.get(position);

    }
    public void setTeamMembers(Player teamMember) {
        this.teamMembers.add(teamMember);
    }
}
