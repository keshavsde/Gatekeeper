package com.springboot.rest.service;

import com.springboot.rest.dto.UserDispatchedDto;
import com.springboot.rest.dto.UserDto;
import com.springboot.rest.dto.UserWarehouseDto;
import com.springboot.rest.entity.User;
import com.springboot.rest.entity.UserDispatched;
import com.springboot.rest.entity.UserWarehouse;
import com.springboot.rest.repository.UserDispatchedRepository;
import com.springboot.rest.repository.UserWarehouseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserDispatchedService {
    @Autowired
    private UserDispatchedRepository userDispatchedRepository;

    @Autowired
    private ConverterService converterService;

    public List<UserDispatchedDto> getAllVehicleno() {
        List<UserDispatched> userDataList = userDispatchedRepository.findAll();
        return userDataList.stream().map(converterService::convertToDto).collect(Collectors.toList());
    }


    public UserDispatchedDto getUserByVehicleno(String vehicleno) {
        UserDispatched userObj = userDispatchedRepository.findByVehicleno(vehicleno);
        return converterService.convertToDto(userObj);
    }

    public String insertUserDto(UserDispatchedDto userDispatchedDto){
        UserDispatched user = new UserDispatched(userDispatchedDto);
        userDispatchedRepository.save(user);
        return "done";
    }
}
