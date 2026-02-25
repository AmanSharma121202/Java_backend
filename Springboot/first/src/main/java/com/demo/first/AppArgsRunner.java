package com.demo.first;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

// This is an ApplicationRunner implementation that will run after the application context is loaded and right before the Spring Application run method finishes. It can be used to execute code at startup and it provides access to the application arguments.
@Component
public class AppArgsRunner implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("Options"+args.getOptionNames());
    }
}



