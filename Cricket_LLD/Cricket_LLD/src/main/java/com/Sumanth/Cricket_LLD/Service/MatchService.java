package com.Sumanth.Cricket_LLD.Service;

import com.Sumanth.Cricket_LLD.Model.Match;
import com.Sumanth.Cricket_LLD.Model.Player;
import com.Sumanth.Cricket_LLD.Model.Team;

import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

public class MatchService {
    private Match match;
    public MatchService(Match match){
        this.match=match;
    }
    public void Start(){
        FirstInnings firstInnings=new FirstInnings(match.getTotalOvers(),match.getTeama(),match.getTeamb());
        SecondInnings secondInnings=new SecondInnings(match.getTotalOvers(),match.getTeamb(),match.getTeama());
        firstInnings.innings();
        System.out.println("Innings Over");
        secondInnings.innings();
        ScoreBoard.inningByTeam(match.getTeama(),match.getTeamb());
        ScoreBoard.inningByTeam(match.getTeamb(),match.getTeama());
        ScoreBoard.matchResult(match.getTeama(),match.getTeamb());
    }
}
