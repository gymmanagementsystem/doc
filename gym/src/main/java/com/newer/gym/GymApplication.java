package com.newer.gym;

import com.newer.gym.repository.SystemMapper;
import com.newer.gym.service.serviceImpl.SystemServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import com.newer.gym.bean.CardType;
import com.newer.gym.bean.Member;
import com.newer.gym.bean.Staff;
import com.newer.gym.service.MemberService;
import com.newer.gym.service.PersonnelService;
import com.newer.gym.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class GymApplication {


    public static void main(String[] args) {
        SpringApplication.run(GymApplication.class, args);
        System.out.println("22222222222222");
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
