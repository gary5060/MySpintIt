package com.vega.springit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RedditApplication {
    //private static final Logger log = Logger.getLogger(SpringApplication.class);
    public static void main(String[] args) {
        SpringApplication.run(RedditApplication.class, args);
        System.out.println("Welcome to sprintit");
    }

}
