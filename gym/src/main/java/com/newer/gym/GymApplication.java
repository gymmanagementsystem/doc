package com.newer.gym;

import com.newer.gym.repository.SystemMapper;
import com.newer.gym.service.serviceImpl.SystemServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GymApplication {


    public static void main(String[] args) {
        SpringApplication.run(GymApplication.class, args);
    }
    @Bean
    public CommandLineRunner test(){
    return  new CommandLineRunner() {
        @Override
        public void run(String... args) throws Exception {

        }
    };
    }
}
