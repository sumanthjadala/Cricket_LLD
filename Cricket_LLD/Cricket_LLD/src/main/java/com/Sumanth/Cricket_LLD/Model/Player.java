package com.Sumanth.Cricket_LLD.Model;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private int id;
    private String name;
    private int runs=0;
    private int noOfSixes=0;
    private int noOfFours=0;
    private int bowlsFaced=0;
    private double strikeRate=0.0;
    private boolean isOut=false;
    private int noOfBowlsBowled=0;
    private int nowicketedTaken=0;

    private int runsConceded=0;
    private List<List<String>> overs=new ArrayList<>();

    public int getNowicketedTaken() {
        return nowicketedTaken;
    }

    public void setNowicketedTaken() {
        nowicketedTaken+=1;
    }

    public Player(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getRunsConceded() {
        return runsConceded;
    }

    public void setRunsConceded(int runsConceded) {
        this.runsConceded += runsConceded;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRuns() {
        return runs;
    }

    public void setRuns(int runs) {
        this.runs += runs;
    }

    public int getNoOfSixes() {
        return noOfSixes;
    }

    public void setNoOfSixes() {
        this.noOfSixes++;
    }

    public int getNoOfFours() {
        return noOfFours;
    }

    public void setNoOfFours() {
        this.noOfFours ++;
    }

    public int getBowlsFaced() {
        return bowlsFaced;
    }

    public void setBowlsFaced() {
        this.bowlsFaced ++;
    }

    public double getStrikeRate() {
        this.strikeRate=((double)this.runs/this.bowlsFaced)*100;
        return strikeRate;
    }

    public boolean getOut() {
        return isOut;
    }

    public void setOut() {
        isOut = true;
    }

    public int getNoOfBowlsBowled() {
        return noOfBowlsBowled;
    }

    public void setNoOfBowlsBowled() {
        this.noOfBowlsBowled ++;
    }

    public List<List<String>> getOvers() {
        return overs;
    }

    public void addOvers(List<String> over) {
        this.overs.add(over);
    }

    @Override
    public String toString() {
        String status= this.isOut ? "out" : this.bowlsFaced>0 ?"NotOut" : "Didn't Batted Yet";
        if(this.bowlsFaced>0){
            getStrikeRate();
        }
        return "Player{" +
//                "id=" + id +
                " name='" + name + '\'' +
                ", runs=" + runs +
                ", bowlsFaced=" + bowlsFaced +
                ", noOfSixes=" + noOfSixes +
                ", noOfFours=" + noOfFours +
                ",Status=" +status+
                ", strikeRate=" +strikeRate +
                '}';
    }
}
