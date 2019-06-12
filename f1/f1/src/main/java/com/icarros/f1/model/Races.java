package com.icarros.f1.model;

import java.util.ArrayList;

public class Races {
	private String season;
	private String round;
	private String url;
	private String raceName;
	private Circuit Circuit;
	private String date;
	private String time;
	private ArrayList<Results> Results = new ArrayList<Results>();

	public String getSeason() {
		return season;
	}

	public String getRound() {
		return round;
	}

	public String getUrl() {
		return url;
	}

	public String getRaceName() {
		return raceName;
	}

	public Circuit getCircuit() {
		return Circuit;
	}

	public String getDate() {
		return date;
	}

	public String getTime() {
		return time;
	}

	public ArrayList<Results> getResults() {
		return Results;
	}

	public void setSeason(String season) {
		this.season = season;
	}

	public void setRound(String round) {
		this.round = round;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public void setRaceName(String raceName) {
		this.raceName = raceName;
	}

	public void setCircuit(Circuit Circuit) {
		this.Circuit = Circuit;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public void setResults(ArrayList<Results> Results) {
		this.Results = Results;
	}

	@Override
	public String toString() {
		return "{" + '\"' + "season" + '\"' + ":" + '\"' + season + '\"' + "," + '\"' + "round" + '\"' + ":" + '\"'
				+ round + '\"' + "," + '\"' + "url" + '\"' + ":" + '\"' + url + '\"' + "," + '\"' + "raceName" + '\"'
				+ ":" + '\"' + raceName + '\"' + "," + '\"' + "Circuit" + '\"' + ":" + '\"' + Circuit + '\"' + ","
				+ '\"' + "date" + '\"' + ":" + '\"' + date + '\"' + "," + '\"' + "time" + '\"' + ":" + '\"' + time
				+ '\"' + "," + '\"' + "Results" + '\"' + ":" + '\"' + Results + '\"' + "}";
	}
}
