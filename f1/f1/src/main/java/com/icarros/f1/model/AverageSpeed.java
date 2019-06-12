package com.icarros.f1.model;

public class AverageSpeed {
	private String units;
	private String speed;

	public String getUnits() {
		return units;
	}

	public String getSpeed() {
		return speed;
	}

	public void setUnits(String units) {
		this.units = units;
	}

	public void setSpeed(String speed) {
		this.speed = speed;
	}

	@Override
	public String toString() {
		return "{" + '\"' + "units" + '\"' + ":" + '\"' + units + '\"' + "," + '\"' + "speed" + '\"' + ":" + '\"'
				+ speed + '\"' + "}";
	}
}