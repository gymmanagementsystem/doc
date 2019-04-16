package com.newer.gym;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class GymManagementSystemApplication {

    public static void main(String[] args) {

        SpringApplication.run(GymManagementSystemApplication.class, args);
        System.out.println(new Date());
    }

}
