package IntroductionToJava.JavaCollections.Project;

import java.util.Set;

public class User{
    private String name;
    private boolean active;
    private Set<String> roles;

    public User(boolean active, String name, Set<String>roles){
        this.name = name;
        this.active = active;
        this.roles = roles;
    }

    public boolean isActive() {
        return active;
    }

    public Set<String> getRoles() {
        return roles;
    }

    public String getName() {
        return name;
    }
}

