package com.springboot.rest.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Id;

public class UserDto{

	@JsonProperty(value = "vehicleno")
	private String vehicleno;

	@JsonProperty(value = "drivername")
	private String drivername;

	@JsonProperty(value = "driverage")
	private String driverage;

	@JsonProperty(value = "dayFrom")
	private String dayFrom;

	@JsonProperty(value = "dayTo")
	private String dayTo;

	@JsonProperty(value = "date")
	private String date;

	@JsonProperty(value = "time")
	private String time;

	public String getVehicleno() {
		return vehicleno;
	}

	public void setVehicleno(String vehicleno) {
		this.vehicleno = vehicleno;
	}

	public String getDrivername() {
		return drivername;
	}

	public void setDrivername(String drivername) {
		this.drivername = drivername;
	}

	public String getDriverage() {
		return driverage;
	}

	public void setDriverage(String driverage) {
		this.driverage = driverage;
	}

	public String getDayFrom() {
		return dayFrom;
	}

	public void setDayFrom(String dayFrom) {
		this.dayFrom = dayFrom;
	}

	public String getDayTo() {
		return dayTo;
	}

	public void setDayTo(String dayTo) {
		this.dayTo = dayTo;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}
}
