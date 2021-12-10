package com.springboot.rest.service;

import com.springboot.rest.dto.UserDto;
import com.springboot.rest.dto.UserWarehouseDto;
import com.springboot.rest.entity.User;
import com.springboot.rest.entity.UserWarehouse;
import com.springboot.rest.repository.UserWarehouseRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.stream.Collectors;

public class UserWarehouseService {

    @Autowired
    private UserWarehouseRepository userWarehouseRepository;

    @Autowired
    private ConverterService converterService;

    public List<UserWarehouseDto> getAllUserInfo() {
        List<UserWarehouse> userDataList = userWarehouseRepository.findAll();
        return userDataList.stream().map(converterService::convertToDto).collect(Collectors.toList());
    }


    public UserWarehouseDto getUserByUserId(String userId) {
        UserWarehouse userObj = userWarehouseRepository.findById(userId).orElse(null);
        return converterService.convertToDto(userObj);
    }

    public String insertUserDto(UserWarehouseDto userWarehouseDto){
        UserWarehouse user = new UserWarehouse(userWarehouseDto.getUserId(), userWarehouseDto.getUserName());
        userWarehouseRepository.save(user);
        return "done";
    }

}
