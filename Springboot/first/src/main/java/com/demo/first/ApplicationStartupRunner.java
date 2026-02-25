package com.demo.first;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


// This is a CommandLineRunner implementation that will run after the application context is loaded and right before the Spring Application run method finishes. It can be used to execute code at startup.
@Component
public class ApplicationStartupRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("Application has started using CommandLineRunner");
    }
}



