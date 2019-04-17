package com.newer.gym;

import com.newer.gym.bean.Logger;
import com.newer.gym.service.serviceImpl.SystemServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GymApplicationTests {
@Autowired
SystemServiceImpl systemServiceImpl;
    @Test
    public void contextLoads() {
        List<Logger> list=systemServiceImpl.test("2019-04-01","2019-05-02","admin");
        System.out.println(list);
    }
}
