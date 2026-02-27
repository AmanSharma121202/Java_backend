package com.demo.first.app;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Response Entity is a wrapper for the HTTP response, it allows us to control the status code, headers and body of the response. It is used to represent the entire HTTP response and can be used to customize the response sent back to the client.
@RestController
@RequestMapping("/user")
public class UserController {
    private Map<Integer,User> userDb = new HashMap<>();
    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user){
        System.out.println("User received: " + user.getName() + ", " + user.getEmail());
        userDb.putIfAbsent(user.getId(),user);
//        return ResponseEntity.status(HttpStatus.CREATED).body(user);

        return new ResponseEntity<>(user, HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<User> updateUser(@RequestBody User user){
        if(!userDb.containsKey(user.getId())){
//            return ResponseEntity.notFound().build();
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        userDb.put(user.getId(),user);
        return ResponseEntity.status(HttpStatus.OK).body(user);

    }

    @DeleteMapping ("/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable int id){
        if(!userDb.containsKey(id)){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        userDb.remove(id);
//        return ResponseEntity.ok("User Deleted");
           return ResponseEntity.noContent().build();
    }

    @GetMapping
    public List<User> getUser(){
        return new ArrayList<>(userDb.values());
    }
}


