package com.icarros.f1.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Location {
	private String lat;
	@JsonProperty("long")
	private String longg;
	private String locality;
	private String country;

	public String getLat() {
		return lat;
	}

	public String getLong() {
		return longg;
	}

	public String getLocality() {
		return locality;
	}

	public String getCountry() {
		return country;
	}

	public void setLat(String lat) {
		this.lat = lat;
	}

	public void setLong(String longg) {
		this.longg = longg;
	}

	public void setLocality(String locality) {
		this.locality = locality;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "{" + '\"' + "lat" + '\"' + ":" + '\"' + lat + '\"' + "," + '\"' + "long" + '\"' + ":" + '\"' + longg
				+ '\"' + "," + '\"' + "locality" + '\"' + ":" + '\"' + locality + '\"' + "," + '\"' + "country" + '\"'
				+ ":" + '\"' + country + '\"' + "}";
	}
}