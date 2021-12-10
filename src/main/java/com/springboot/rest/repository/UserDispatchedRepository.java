package com.springboot.rest.repository;

import com.springboot.rest.entity.User;
import com.springboot.rest.entity.UserDispatched;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDispatchedRepository extends JpaRepository<UserDispatched,String> {
    public UserDispatched findByVehicleno(String vehicleno);

}
