package com.newer.gym.service;

import com.newer.gym.bean.MemberExpense;
import com.newer.gym.bean.PageBean;
import com.newer.gym.bean.QueryVo;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
* @Description:    统计分析数据服务类
* @Author:         HiFiYi
* @CreateDate:     2019/4/23 14:33
*/
@Service
public interface AnalysisService {

    PageBean<QueryVo> getStaffAchievement(int currentPage,int pageSize);

    PageBean<MemberExpense> getMemberExpenses(Map<String,String> map,int currentPage,int pageSize);

    Map<String,Object> getSales();
}
