package com.springboot.rest.service;

import java.lang.reflect.Type;
import java.util.List;

import com.springboot.rest.dto.UserDispatchedDto;
import com.springboot.rest.dto.UserWarehouseDto;
import com.springboot.rest.entity.UserDispatched;
import com.springboot.rest.entity.UserWarehouse;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springboot.rest.dto.UserDto;
import com.springboot.rest.entity.User;

@Component
public class ConverterService {
	
	@Autowired
	private ModelMapper modelMapper;

	public UserDto convertToDto(User userObject) {
		return modelMapper.map(userObject, UserDto.class);
	}

	public UserWarehouseDto convertToDto(UserWarehouse userWarehouseObject){
		return modelMapper.map(userWarehouseObject,UserWarehouseDto.class);}

	public UserDispatchedDto convertToDto(UserDispatched userDispatchedObject){
		return modelMapper.map(userDispatchedObject,UserDispatchedDto.class);}
	
	/*
	 * public UserDto convertToDto(List<User> userListDatas) { return
	 * modelMapper.map(userListDatas, UserDto.class); }
	 */

}
