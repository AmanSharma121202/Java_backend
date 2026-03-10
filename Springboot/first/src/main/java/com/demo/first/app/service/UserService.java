package com.demo.first.app.service;

import com.demo.first.app.controller.UserController;
import com.demo.first.app.exception.UserNotFoundException;
import com.demo.first.app.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserService {
    private Map<Integer, User> userDb = new HashMap<>();

    // Using logging framework to log messages at different levels (INFO, DEBUG, TRACE, ERROR) to help with debugging and monitoring the application. This allows us to track the flow of the application and identify any issues that may arise.
    private final Logger logger = LoggerFactory.getLogger(UserService.class);

    public User createUser(User user) {
        logger.info("creating user....INFO");
        logger.debug("Creating user....DEBUG");
        logger.trace("Creating user....TRACE");
        logger.error("Creating user....ERROR");
       userDb.putIfAbsent(user.getId(),user);
       return user;
    }
    public User updateUser(User user) {
        if(!userDb.containsKey(user.getId()))
            throw new UserNotFoundException("User doesn't exist");
        userDb.put(user.getId(),user);
        return user;
    }

    public boolean deleteUser(int id) {
        if(!userDb.containsKey(id)){
            throw new UserNotFoundException("User doesn't exist");
        }
        userDb.remove(id);
        return true;
    }

    public List<User> getAllUsers(){
        if(userDb.isEmpty())
            throw new NullPointerException("No users found in the database");
        return new ArrayList<>(userDb.values());
    }

    public User getUserById(int id) {
        if(!userDb.containsKey(id))
            throw new IllegalArgumentException("User doesn't exist");
        return userDb.get(id);
    }
    public List<User> searchUsers(String name, String email) {
        return userDb.values().stream()
                .filter(u->u.getName().equalsIgnoreCase(name))
                .filter(u->u.getEmail().equalsIgnoreCase(email))
                .toList();
    }
}



