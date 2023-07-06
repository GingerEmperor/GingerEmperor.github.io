package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MySecondHostingProject {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        SpringApplication.run(MySecondHostingProject.class, args);
    }
}