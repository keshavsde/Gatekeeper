package com.springboot.rest.controller;

import java.util.List;

import com.springboot.rest.dto.UserDispatchedDto;
import com.springboot.rest.dto.UserWarehouseDto;
import com.springboot.rest.entity.UserDispatched;
import com.springboot.rest.entity.UserWarehouse;
import com.springboot.rest.service.UserDispatchedService;
import com.springboot.rest.service.UserWarehouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import com.springboot.rest.dto.UserDto;
import com.springboot.rest.entity.User;
import com.springboot.rest.service.UserService;


@RestController
@RequestMapping(value = "/userinfo")
public class UserController {
	
	@Autowired
	private UserService userService;

	@Autowired
	private UserWarehouseService userWarehouseService;

	@Autowired
	private UserDispatchedService userDispatchedService;

	@GetMapping(value = "/alluser", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<UserDto> getUserinfo() {
		return userService.getAllVehicleno();
	}

	  @GetMapping(value = "/{vehicleno}", produces = MediaType.APPLICATION_JSON_VALUE)
	  public UserDto getUserById(@PathVariable("vehicleno") String vehicleno) {
		  return userService.getUserByVehicleno(vehicleno); }

	@PostMapping(value = "/insert")
	  public String insertUserDto(@RequestBody UserDto userDto)
	  {
		  return userService.insertUserDto(userDto);
	  }



	@GetMapping(value = "/alluserwarehouse", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<UserWarehouseDto> getUserWarehouseinfo() {
		return userWarehouseService.getAllVehicleno();
	}

	@GetMapping(value = "/warehouse/{vehicleno}", produces = MediaType.APPLICATION_JSON_VALUE)
	public UserWarehouseDto getUserWarehouseById(@PathVariable("vehicleno") String vehicleno) {
		return userWarehouseService.getUserByVehicleno(vehicleno); }

	@PostMapping(value = "/insertwarehouse")
	public String insertUserWarehouseDto(@RequestBody UserWarehouseDto userWarehouseDto)
	{
		return userWarehouseService.insertUserDto(userWarehouseDto);
	}


	@GetMapping(value = "/alluserdispatched", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<UserDispatchedDto> getUserDispatchedinfo() {
		return userDispatchedService.getAllVehicleno();
	}

	@GetMapping(value = "/disapatched/{vehicleno}", produces = MediaType.APPLICATION_JSON_VALUE)
	public UserDispatchedDto getUserDispatchedById(@PathVariable("vehicleno") String vehicleno) {
		return userDispatchedService.getUserByVehicleno(vehicleno); }

	@PostMapping(value = "/insertdispatched")
	public String insertUserDispatchedDto(@RequestBody UserDispatchedDto userDispatchedDto)
	{
		return userDispatchedService.insertUserDto(userDispatchedDto);
	}




}
