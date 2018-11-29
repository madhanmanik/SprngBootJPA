package com.uae.repository;

import org.springframework.data.repository.CrudRepository;

import com.uae.pojo.UserRecord;  

public interface UserRepository extends CrudRepository<UserRecord, String> {  
}  