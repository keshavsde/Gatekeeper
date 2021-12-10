package com.springboot.rest.entity;

import com.springboot.rest.dto.UserDispatchedDto;
import com.springboot.rest.dto.UserDto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_dispatched_table")
public class UserDispatched {

    @Id
    @Column
    private String vehicleno;

    @Column
    private String drivername;

    @Column
    private String driverage;

    @Column
    private String dayFrom;

    @Column
    private String dayTo;

    @Column
    private String date;

    @Column
    private String time;

    public UserDispatched(String vehicleno, String drivername, String driverage, String dayFrom, String dayTo, String date, String time) {
        this.vehicleno = vehicleno;
        this.drivername = drivername;
        this.driverage = driverage;
        this.dayFrom = dayFrom;
        this.dayTo = dayFrom;
        this.date = date;
        this.time = time;
    }

    public UserDispatched(UserDispatchedDto userDispatchedDto)
    {
        this.vehicleno = userDispatchedDto.getVehicleno();
        this.drivername = userDispatchedDto.getDrivername();
        this.driverage = userDispatchedDto.getDriverage();
        this.dayFrom = userDispatchedDto.getDayFrom();
        this.dayTo = userDispatchedDto.getDayTo();
        this.date = userDispatchedDto.getDate();
        this.time = userDispatchedDto.getTime();
    }


    public UserDispatched(){

    }


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
