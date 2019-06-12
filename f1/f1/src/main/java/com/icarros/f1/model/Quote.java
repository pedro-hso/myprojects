package com.icarros.f1.model;

public class Quote {
	private MRData MRData;

	public MRData getMRData() {
		return MRData;
	}

	public void setMRData(MRData MRData) {
		this.MRData = MRData;
	}

	@Override
	public String toString() {
		return "{" + '\"' + "MRData" + '\"' + ":" + MRData + "}";
	}
}