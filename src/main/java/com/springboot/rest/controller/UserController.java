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
		return userService.getAllUserInfo();
	}

	  @GetMapping(value = "/{userId}", produces = MediaType.APPLICATION_JSON_VALUE)
	  public UserDto getUserById(@PathVariable("userId") String userId) { 
		  return userService.getUserByUserId(userId); }

	@PostMapping(value = "/insert")
	  public String insertUserDto(@RequestBody UserDto userDto)
	  {
		  return userService.insertUserDto(userDto);
	  }



	@GetMapping(value = "/alluserwarehouse", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<UserWarehouseDto> getUserWarehouseinfo() {
		return userWarehouseService.getAllUserInfo();
	}

	@GetMapping(value = "/warehouse/{userwarehouseId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public UserWarehouseDto getUserWarehouseById(@PathVariable("userId") String userwarehouseId) {
		return userWarehouseService.getUserByUserId(userwarehouseId); }

	@PostMapping(value = "/insertwarehouse")
	public String insertUserWarehouseDto(@RequestBody UserWarehouseDto userWarehouseDto)
	{
		return userWarehouseService.insertUserDto(userWarehouseDto);
	}


	@GetMapping(value = "/alluserdispatched", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<UserDispatchedDto> getUserDispatchedinfo() {
		return userDispatchedService.getAllUserInfo();
	}

	@GetMapping(value = "/disapatched/{userdispatchedId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public UserDispatchedDto getUserDispatchedById(@PathVariable("userId") String userdispatchedId) {
		return userDispatchedService.getUserByUserId(userdispatchedId); }

	@PostMapping(value = "/insertwarehouse")
	public String insertUserDispatchedDto(@RequestBody UserDispatchedDto userDispatchedDto)
	{
		return userDispatchedService.insertUserDto(userDispatchedDto);
	}
}
