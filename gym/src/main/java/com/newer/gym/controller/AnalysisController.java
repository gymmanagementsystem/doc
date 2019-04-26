package com.newer.gym.controller;

import com.newer.gym.bean.MemberExpense;
import com.newer.gym.bean.PageBean;
import com.newer.gym.bean.QueryVo;
import com.newer.gym.service.AnalysisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.security.PublicKey;
import java.util.HashMap;
import java.util.Map;

@RestController
@CrossOrigin
public class AnalysisController {
    @Autowired
    AnalysisService analysisService;

    @GetMapping("/analysis/getStaffAchievement")
    public PageBean<QueryVo> getStaffsAchievement(@RequestParam(defaultValue = "1") int currentPage,
                                                  @RequestParam(defaultValue = "10") int pageSize){
        return analysisService.getStaffAchievement(currentPage,pageSize);
    }

    @RequestMapping("/analysis/getMemberExpenses")
    public PageBean<MemberExpense> getMemberExpenses(@RequestParam(required = false) Map<String,String> map
                                                     ,@RequestParam(defaultValue = "1") int currentPage,
                                                     @RequestParam(defaultValue = "10") int pageSize){
        if(map==null) map=new HashMap<>();
        for (Object key:map.keySet()){
            System.out.println(key+":"+map.get(key));
        }
        return analysisService.getMemberExpenses(map,currentPage,pageSize);

    };

    @GetMapping("/analysis/getSalesInformation")
    public Map<String,Object> getSalesInformation(){
        return analysisService.getSales();
    }
}
