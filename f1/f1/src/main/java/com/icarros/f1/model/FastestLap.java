package com.icarros.f1.model;

public class FastestLap {
	private String rank;
	private String lap;
	private TimeFastestLap Time;
	private AverageSpeed AverageSpeed;

	public String getRank() {
		return rank;
	}

	public String getLap() {
		return lap;
	}

	public TimeFastestLap getTime() {
		return Time;
	}

	public AverageSpeed getAverageSpeed() {
		return AverageSpeed;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	public void setLap(String lap) {
		this.lap = lap;
	}

	public void setTime(TimeFastestLap Time) {
		this.Time = Time;
	}

	public void setAverageSpeed(AverageSpeed AverageSpeed) {
		this.AverageSpeed = AverageSpeed;
	}

	@Override
	public String toString() {
		return "{" + '\"' + "rank" + '\"' + ":" + '\"' + rank + '\"' + "," + '\"' + "lap" + '\"' + ":" + '\"' + lap
				+ '\"' + "," + '\"' + "Time" + '\"' + ":" + '\"' + Time + '\"' + "," + '\"' + "AverageSpeed" + '\"'
				+ ":" + '\"' + AverageSpeed + '\"' + "}";
	}
}