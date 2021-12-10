package com.springboot.rest.repository;

import com.springboot.rest.entity.User;
import com.springboot.rest.entity.UserWarehouse;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserWarehouseRepository extends JpaRepository<UserWarehouse, String> {
    public UserWarehouse findByUserId(String userId);
}
