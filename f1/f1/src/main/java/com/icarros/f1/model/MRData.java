package com.icarros.f1.model;

public class MRData {
	private String xmlns;
	private String series;
	private String url;
	private String limit;
	private String offset;
	private String total;
	private RaceTable RaceTable;

	public String getXmlns() {
		return xmlns;
	}

	public String getSeries() {
		return series;
	}

	public String getUrl() {
		return url;
	}

	public String getLimit() {
		return limit;
	}

	public String getOffset() {
		return offset;
	}

	public String getTotal() {
		return total;
	}

	public RaceTable getRaceTable() {
		return RaceTable;
	}

	public void setXmlns(String xmlns) {
		this.xmlns = xmlns;
	}

	public void setSeries(String series) {
		this.series = series;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public void setLimit(String limit) {
		this.limit = limit;
	}

	public void setOffset(String offset) {
		this.offset = offset;
	}

	public void setTotal(String total) {
		this.total = total;
	}

	public void setRaceTable(RaceTable RaceTable) {
		this.RaceTable = RaceTable;
	}

	@Override
	public String toString() {
		return "{" + '\"' + "xmlns" + '\"' + ":" + '\"' + xmlns + '\"' + "," + '\"' + "series" + '\"' + ":" + '\"'
				+ series + '\"' + "," + '\"' + "url" + '\"' + ":" + '\"' + url + '\"' + "," + '\"' + "limit" + '\"'
				+ ":" + '\"' + limit + '\"' + "," + '\"' + "offset" + '\"' + ":" + '\"' + offset + '\"' + "," + '\"'
				+ "total" + '\"' + ":" + '\"' + total + '\"' + "," + '\"' + "RaceTable" + '\"' + ":" + '\"' + RaceTable
				+ '\"' + "}";
	}
}