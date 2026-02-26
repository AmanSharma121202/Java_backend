package com.demo.first.app;


//POJO CLASS: Plain old java objects (class which does not extend any frameWork).
// In springboot, jackson is used to convert java objects to json and vice versa. So, when we return a java object from a controller method, it will be automatically converted to json and sent as a response to the client. Similarly, when we receive a json request body, it will be automatically converted to a java object and passed as a parameter to the controller method.
// And jackson want access to the private variable that is why we need to provide getter and setter method for the private variable. If we do not provide getter and setter method, then jackson will not be able to access the private variable and it will throw an error.

public class User {
    private int id;
    private String name;
    private String email;

    public User(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
