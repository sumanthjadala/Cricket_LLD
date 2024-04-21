package com.Sumanth.Cricket_LLD;

import com.Sumanth.Cricket_LLD.Enums.MatchType;
import com.Sumanth.Cricket_LLD.Model.Match;
import com.Sumanth.Cricket_LLD.Model.Player;
import com.Sumanth.Cricket_LLD.Model.Team;
import com.Sumanth.Cricket_LLD.Service.MatchService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


public class CricketLldApplication {

	public static void main(String[] args) {
		Team teamA=new Team(1,"India");
		Team teamB=new Team(2,"Australia");
		for(int i=1;i<=11;i++){
			teamA.setTeamMembers(new Player(i,"TeamA"+i));
			teamB.setTeamMembers(new Player(i,"TeamB"+i));
		}
//		System.out.println(teamA.getTeamMembers());
		Match match=new Match(teamA,teamB,2, MatchType.SHORT_MATCH);
		MatchService matchService=new MatchService(match);
		matchService.Start();
	}

}
