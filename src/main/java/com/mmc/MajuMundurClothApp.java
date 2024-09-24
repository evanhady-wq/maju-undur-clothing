package com.mmc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MajuMundurClothApp {
    public static void main(String[] args) {
        SpringApplication.run(MajuMundurClothApp.class, "--spring.profiles.active=prod");
    }
}
