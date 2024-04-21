package com.Sumanth.Cricket_LLD.Service;

import com.Sumanth.Cricket_LLD.Model.Player;
import com.Sumanth.Cricket_LLD.Model.Team;

import java.util.ArrayList;
import java.util.Scanner;

public class FirstInnings {
    private int totalOvers;
    private Team battingTeam;
    private Team bowlingTeam;
    private Scanner sc=new Scanner(System.in);
    public FirstInnings(int totalOvers, Team battingTeam, Team bowlingTeam) {
        this.totalOvers = totalOvers;
        this.battingTeam = battingTeam;
        this.bowlingTeam = bowlingTeam;
    }
    public void innings(){
        System.out.println("--------------------------------First Innings Started-------------------------");
        Player prevBowler=null;
        Player curStriker=battingTeam.getPlayer(0);;
        Player nonStriker=battingTeam.getPlayer(1);;
        int position=2;
        for(int i=1;i<=totalOvers;i++){
            int curBowlBowled=0;
            Helper.chooseBowler(bowlingTeam,prevBowler);
            String bowler=sc.nextLine();
            Player choosenBowler=Helper.searchPlayer(bowlingTeam,bowler);
            ArrayList<String> over=new ArrayList<>();
            while(curBowlBowled<6){
                System.out.println("What happened in this Bowl");
                String score=sc.nextLine();
                int runs=Helper.getCurrentBowlScore(score);
                over.add(score);
                if(runs==1 && (score.equals("Wide") || score.equals("NB"))){
                    choosenBowler.setRunsConceded(runs);
                    battingTeam.setTotalTeamScore(runs);
                }else {
                    choosenBowler.setNoOfBowlsBowled();
                    curBowlBowled+=1;
                    bowlingTeam.setLastOverBowl();
                    if (runs == -1) {
                        battingTeam.setWicketsFallen();
                        bowlingTeam.setWicketsTaken();
                        choosenBowler.setNowicketedTaken();
                        curStriker.setBowlsFaced();
                        curStriker.setOut();
                        if (battingTeam.getWicketsFallen() == 10) {
                            return;
                        } else {
                            curStriker = battingTeam.getPlayer(position);
                            position += 1;
                            if(curBowlBowled==6){
                                Player p=curStriker;
                                curStriker =nonStriker;
                                nonStriker=p;
                            }
                        }
                    }else {
                        choosenBowler.setRunsConceded(runs);
                        battingTeam.setTotalTeamScore(runs);
                        curStriker.setBowlsFaced();
                        curStriker.setRuns(runs);
                        if (runs == 1 || runs == 3) {
                            if (curBowlBowled != 6) {
                                Player p=curStriker;
                                curStriker =nonStriker;
                                nonStriker=p;
                            }
                        } else if (runs == 4 || runs==2) {
                            if(runs==4){
                                curStriker.setNoOfFours();
                            }
                            if (curBowlBowled == 6) {
                                Player p=curStriker;
                                curStriker =nonStriker;
                                nonStriker=p;
                            }
                        }else if(runs==6){
                            curStriker.setNoOfSixes();
                            if (curBowlBowled == 6) {
                                Player p=curStriker;
                                curStriker =nonStriker;
                                nonStriker=p;
                            }

                        }
                    }
                }

            }
            choosenBowler.addOvers(over);
            prevBowler=choosenBowler;
            System.out.println("Over "+ i +" Complted");
        }
        System.out.println("--------------------------------First Innings Ended-------------------------");
    }

}
