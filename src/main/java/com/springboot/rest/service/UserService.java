package com.springboot.rest.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.springboot.rest.dto.UserDto;
import com.springboot.rest.entity.User;
import com.springboot.rest.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private ConverterService converterService;

	public List<UserDto> getAllVehicleno() {
		List<User> userDataList = userRepository.findAll();
		return userDataList.stream().map(converterService::convertToDto).collect(Collectors.toList());
	}

	
	  public UserDto getUserByVehicleno(String vehicleno) {
		  User userObj = userRepository.findByVehicleno(vehicleno);
		  return converterService.convertToDto(userObj);
	  }

	  public String insertUserDto(UserDto userDto){
		User user = new User(userDto);
		  userRepository.save(user);
		  return "done";
	  }

	 
}
