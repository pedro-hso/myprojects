package com.icarros.f1.model;

public class TimeFastestLap {
	private String time;

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	@Override
	public String toString() {
		return "{" + '\"' + "time" + '\"' + ":" + '\"' + time + '\"' + "}";
	}
}
