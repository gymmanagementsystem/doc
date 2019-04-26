package com.newer.gym.service.serviceImpl;

import com.github.pagehelper.PageHelper;
import com.newer.gym.bean.MemberExpense;
import com.newer.gym.bean.PageBean;
import com.newer.gym.bean.QueryVo;
import com.newer.gym.repository.AnalysisMapper;
import com.newer.gym.service.AnalysisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
* @Description:    统计分析数据服务实现类
* @Author:         HiFiYi
* @CreateDate:     2019/4/23 14:50
*/
@Service
public class AnalysisServiceImpl implements AnalysisService {
    @Autowired
    AnalysisMapper analysisMapper;
    @Override
    public PageBean<QueryVo> getStaffAchievement(int currentPage,int pageSize) {
        PageHelper.startPage(currentPage,pageSize);
        List<QueryVo> list=analysisMapper.getStaffAchievements();
        int totalNum=analysisMapper.getStaffAchievementsCount();
        PageBean<QueryVo> pg=new PageBean<>(currentPage,pageSize,totalNum);
        pg.setItems(list);
        return pg;
    }

    @Override
    public PageBean<MemberExpense> getMemberExpenses(Map<String,String> map,int currentPage, int pageSize) {
        PageHelper.startPage(currentPage,pageSize);
        if(map==null)
            map=new HashMap<>();
        List<MemberExpense> list=analysisMapper.selectMemberExpense(map);
        int totalNum=analysisMapper.selectMemberExpenseCount(map);
        PageBean<MemberExpense> pg=new PageBean<>(currentPage,pageSize,totalNum);
        pg.setItems(list);
        return pg;
    }

    @Override
    public Map<String, Object> getSales() {
        Map<String, Object> map =new HashMap<>();
        map.put("productQuantities",analysisMapper.selectProductCount());
        map.put("allSales",analysisMapper.selectAllTotalSales());
        map.put("monthSales",analysisMapper.selectMonthSales());
        map.put("memberTotalNum",analysisMapper.selectMemberCount());
        return map;
    }
}
