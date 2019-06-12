package com.icarros.f1.model;

import java.util.ArrayList;

public class RaceTable {
	private String season;
	private String round;
	private ArrayList<Races> Races = new ArrayList<Races>();

	public String getSeason() {
		return season;
	}

	public String getRound() {
		return round;
	}

	public ArrayList<Races> getRaces() {
		return Races;
	}

	public void setSeason(String season) {
		this.season = season;
	}

	public void setRound(String round) {
		this.round = round;
	}

	public void setRaces(ArrayList<Races> Races) {
		this.Races = Races;
	}

	@Override
	public String toString() {
		return "{" + '\"' + "season" + '\"' + ":" + '\"' + season + '\"' + "," + '\"' + "round" + '\"' + ":" + '\"'
				+ round + '\"' + "," + '\"' + "Races" + '\"' + ":" + '\"' + Races + '\"' + "}";
	}
}