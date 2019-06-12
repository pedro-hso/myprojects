package com.icarros.f1.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Constructor {
	private String constructorId;
	private String url;
	private String name;
	private String nationality;

	public String getConstructorId() {
		return constructorId;
	}

	public String getUrl() {
		return url;
	}

	public String getName() {
		return name;
	}

	public String getNationality() {
		return nationality;
	}

	public void setConstructorId(String constructorId) {
		this.constructorId = constructorId;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	@Override
	public String toString() {
		return "{" + '\"' + "constructorId" + '\"' + ":" + '\"' + constructorId + '\"' + "," + '\"' + "url" + '\"' + ":"
				+ '\"' + url + '\"' + "," + '\"' + "name" + '\"' + ":" + '\"' + name + '\"' + "," + '\"' + "nationality"
				+ '\"' + ":" + '\"' + nationality + '\"' + "}";
	}
}