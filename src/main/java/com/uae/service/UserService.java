package com.uae.service;

import java.util.List;  
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import java.util.ArrayList;  
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.uae.pojo.UserRecord;
import com.uae.repository.UserRepository;  

@Repository
@Transactional 
public class UserService {  
	
   // @Autowired  
   // private UserRepository userRepository;  
    

    @PersistenceContext
    private EntityManager entityManager;
 
    
    public List<UserRecord> getAllUsers(){  
      /*  List<UserRecord> userRecords = new ArrayList<UserRecord>();  
        
        userRepository.findAll().forEach(userRecords::add);  */
    	Query query = entityManager.createNamedQuery(
    			   "query_find_all_users", UserRecord.class);
      return query.getResultList();
        
       // return userRecords;  
    }  
    
    public void addUser(UserRecord userRecord){  
    	entityManager.persist(userRecord);
       // userRepository.save(userRecord);  
    }  
}  