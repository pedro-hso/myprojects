package com.icarros.f1.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "results")
public class Results {
	@Id
	private String id;
	private String number;
	private String position;
	private String positionText;
	private String points;
	private Driver Driver;
	private Constructor Constructor;
	private String grid;
	private String laps;
	private String status;
	private Time Time;
	private FastestLap FastestLap;

	public String getId() {
		return id;
	}

	public String getNumber() {
		return number;
	}

	public String getPosition() {
		return position;
	}

	public String getPositionText() {
		return positionText;
	}

	public String getPoints() {
		return points;
	}

	public Driver getDriver() {
		return Driver;
	}

	public Constructor getConstructor() {
		return Constructor;
	}

	public String getGrid() {
		return grid;
	}

	public String getLaps() {
		return laps;
	}

	public String getStatus() {
		return status;
	}

	public Time getTime() {
		return Time;
	}

	public FastestLap getFastestLap() {
		return FastestLap;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public void setPositionText(String positionText) {
		this.positionText = positionText;
	}

	public void setPoints(String points) {
		this.points = points;
	}

	public void setDriver(Driver Driver) {
		this.Driver = Driver;
	}

	public void setConstructor(Constructor Constructor) {
		this.Constructor = Constructor;
	}

	public void setGrid(String grid) {
		this.grid = grid;
	}

	public void setLaps(String laps) {
		this.laps = laps;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void setTime(Time Time) {
		this.Time = Time;
	}

	public void setFastestLap(FastestLap FastestLap) {
		this.FastestLap = FastestLap;
	}

	@Override
	public String toString() {
		return "{" + /* '\"' + "id" + '\"' + ":" + '\"' + id + '\"' + "," + */'\"' + "number" + '\"' + ":" + '\"'
				+ number + '\"' + "," + '\"' + "position" + '\"' + ":" + '\"' + position + '\"' + "," + '\"'
				+ "positionText" + '\"' + ":" + '\"' + positionText + '\"' + "," + '\"' + "points" + '\"' + ":" + '\"'
				+ points + '\"' + "," + '\"' + "Driver" + '\"' + ":" + '\"' + Driver + '\"' + "," + '\"' + "Constructor"
				+ '\"' + ":" + '\"' + Constructor + '\"' + "," + '\"' + "grid" + '\"' + ":" + '\"' + grid + '\"' + ","
				+ '\"' + "laps" + '\"' + ":" + '\"' + laps + '\"' + "," + '\"' + "status" + '\"' + ":" + '\"' + status
				+ '\"' + "," + '\"' + "Time" + '\"' + ":" + '\"' + Time + '\"' + "," + '\"' + "FastestLap" + '\"' + ":"
				+ '\"' + FastestLap + '\"' + "}";
	}
}
