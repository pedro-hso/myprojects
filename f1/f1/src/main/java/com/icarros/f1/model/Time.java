package com.icarros.f1.model;

public class Time {
	private String millis;
	private String time;

	public String getMillis() {
		return millis;
	}

	public String getTime() {
		return time;
	}

	public void setMillis(String millis) {
		this.millis = millis;
	}

	public void setTime(String time) {
		this.time = time;
	}

	@Override
	public String toString() {
		return "{" + '\"' + "millis" + '\"' + ":" + '\"' + millis + '\"' + "," + '\"' + "time" + '\"' + ":" + '\"'
				+ time + '\"' + "}";
	}
}