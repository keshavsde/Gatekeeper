package com.springboot.rest.entity;

import com.springboot.rest.dto.UserDispatchedDto;
import com.springboot.rest.dto.UserWarehouseDto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserWarehouse {

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

    public UserWarehouse(String vehicleno, String drivername, String driverage, String dayFrom, String dayTo, String date, String time) {
        this.vehicleno = vehicleno;
        this.drivername = drivername;
        this.driverage = driverage;
        this.dayFrom = dayFrom;
        this.dayTo = dayTo;
        this.date = date;
        this.time = time;
    }

    public UserWarehouse(UserWarehouseDto userWarehouseDto)
    {
        this.vehicleno = userWarehouseDto.getVehicleno();
        this.drivername = userWarehouseDto.getDrivername();
        this.driverage = userWarehouseDto.getDriverage();
        this.dayFrom = userWarehouseDto.getDayFrom();
        this.dayTo = userWarehouseDto.getDayTo();
        this.date = userWarehouseDto.getDate();
        this.time = userWarehouseDto.getTime();
    }


    public UserWarehouse(){

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
