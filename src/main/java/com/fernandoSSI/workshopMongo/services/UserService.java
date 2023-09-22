package com.fernandoSSI.workshopMongo.services;

import com.fernandoSSI.workshopMongo.domain.User;
import com.fernandoSSI.workshopMongo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;
    public List<User> findAll(){
        return repo.findAll();
    }

}
