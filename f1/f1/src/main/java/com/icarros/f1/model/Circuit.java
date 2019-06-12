package com.icarros.f1.model;

public class Circuit {
	private String circuitId;
	private String url;
	private String circuitName;
	private Location Location;

	public String getCircuitId() {
		return circuitId;
	}

	public String getUrl() {
		return url;
	}

	public String getCircuitName() {
		return circuitName;
	}

	public Location getLocation() {
		return Location;
	}

	public void setCircuitId(String circuitId) {
		this.circuitId = circuitId;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public void setCircuitName(String circuitName) {
		this.circuitName = circuitName;
	}

	public void setLocation(Location Location) {
		this.Location = Location;
	}

	@Override
	public String toString() {
		return "{" + '\"' + "circuitId" + '\"' + ":" + '\"' + circuitId + '\"' + "," + '\"' + "url" + '\"' + ":" + '\"'
				+ url + '\"' + "," + '\"' + "circuitName" + '\"' + ":" + '\"' + circuitName + '\"' + "," + '\"'
				+ "Location" + '\"' + ":" + '\"' + Location + '\"' + "}";
	}
}