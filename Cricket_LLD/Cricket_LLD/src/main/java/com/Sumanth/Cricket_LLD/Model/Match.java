package com.Sumanth.Cricket_LLD.Model;

import com.Sumanth.Cricket_LLD.Enums.MatchType;

public class Match {
    private Team teamA;
    private Team teamB;
    private int totalOvers;
    private MatchType matchType;

    public Match(Team teamA, Team teamB, int totalOvers, MatchType matchType) {
        this.teamA = teamA;
        this.teamB = teamB;
        this.totalOvers = totalOvers;
        this.matchType = matchType;
    }

    public Team getTeama() {
        return teamA;
    }

    public Team getTeamb() {
        return teamB;
    }

    public int getTotalOvers() {
        return totalOvers;
    }
    public MatchType getMatchType() {
        return matchType;
    }
}
