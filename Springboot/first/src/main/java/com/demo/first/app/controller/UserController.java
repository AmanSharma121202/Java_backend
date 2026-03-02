package com.demo.first.app.controller;


import com.demo.first.app.model.User;
import com.demo.first.app.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Response Entity is a wrapper for the HTTP response, it allows us to control the status code, headers and body of the response. It is used to represent the entire HTTP response and can be used to customize the response sent back to the client.
@RestController
@RequestMapping("/user")
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user){
        User createdUser = userService.createUser(user);
        return new ResponseEntity<>(createdUser, HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<User> updateUser(@RequestBody User user){
        User updated = userService.updateUser(user);
        if(updated == null){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.ok(updated);
    }

    @DeleteMapping ("/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable int id){
        boolean isDeleted = userService.deleteUser(id);
        if(isDeleted){
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        }
        return ResponseEntity.notFound().build();
    }

    @GetMapping
    public List<User> getUsers(){
        return userService.getAllUsers();
    }

    @GetMapping ("/{userId}")
    public ResponseEntity<User> getUser(@PathVariable(value = "userId", required = false) int id){
        User user = userService.getUserById(id);
        if(user == null){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.ok(user);
    }

    @GetMapping ("/{userId}/orders/{orderId}")
    public ResponseEntity<User>getUserOrder(
            @PathVariable("userId") int id,
            @PathVariable int orderId
    ){
        User user = userService.getUserById(id);
        if(user == null){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.ok(user);
    }

    @GetMapping("/search")
    public ResponseEntity<List<User>>searchUsers(
            @RequestParam(required = false,defaultValue="alice") String name,
            @RequestParam(required = false,defaultValue="email") String email){
        return ResponseEntity.ok(userService.searchUsers(name,email));
    }

    @GetMapping("/info")
    public String getInfo(@RequestHeader("User-Agent") String userAgent){
        return "user Agent: "+ userAgent;
    }

}




