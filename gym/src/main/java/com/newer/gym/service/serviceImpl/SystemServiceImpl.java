package com.newer.gym.service.serviceImpl;

import com.newer.gym.bean.Logger;
import com.newer.gym.repository.SystemMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class SystemServiceImpl {
    @Autowired
    SystemMapper systemMapper;

    public List<Logger> test(String begin, String finish, String adminName) {
        Map<String, Object> map = null;
        map.put("1", begin);
        map.put("2", finish);
        map.put("3", adminName);
        List<Logger> list = systemMapper.selectLoggers(map);
        return list;
    }
}
