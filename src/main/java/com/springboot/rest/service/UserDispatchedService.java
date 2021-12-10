package com.springboot.rest.service;

import com.springboot.rest.dto.UserDispatchedDto;
import com.springboot.rest.dto.UserWarehouseDto;
import com.springboot.rest.entity.UserDispatched;
import com.springboot.rest.entity.UserWarehouse;
import com.springboot.rest.repository.UserDispatchedRepository;
import com.springboot.rest.repository.UserWarehouseRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.stream.Collectors;

public class UserDispatchedService {
    @Autowired
    private UserDispatchedRepository userDispatchedRepository;

    @Autowired
    private ConverterService converterService;

    public List<UserDispatchedDto> getAllUserInfo() {
        List<UserDispatched> userDataList = userDispatchedRepository.findAll();
        return userDataList.stream().map(converterService::convertToDto).collect(Collectors.toList());
    }


    public UserDispatchedDto getUserByUserId(String userId) {
        UserDispatched userObj = userDispatchedRepository.findById(userId).orElse(null);
        return converterService.convertToDto(userObj);
    }

    public String insertUserDto(UserDispatchedDto userDispatchedDto){
        UserDispatched user = new UserDispatched(userDispatchedDto.getUserId(), userDispatchedDto.getUserName());
        userDispatchedRepository.save(user);
        return "done";
    }
}
