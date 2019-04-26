package com.newer.gym.service.serviceImpl;

import com.github.pagehelper.PageHelper;
import com.newer.gym.bean.PageBean;
import com.newer.gym.bean.Wardrobe;
import com.newer.gym.bean.WardrobeRecord;
import com.newer.gym.repository.WardrobeMapper;
import com.newer.gym.service.WardrobeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
* @Description:    衣柜数据操作服务实现类
* @Author:         HiFiYi
* @CreateDate:     2019/4/20 12:31
*/
@Service
public class WardrobeServiceImpl implements WardrobeService {
    @Autowired
    WardrobeMapper wardrobeMapper;

    @Override
    public void addWardrobe(Wardrobe wardrobe) {
        wardrobeMapper.insertWardrobe(wardrobe);
    }

    @Override
    public void editorWardrobe(Wardrobe wardrobe) {
        wardrobeMapper.updateWardrobe(wardrobe);
    }

    @Override
    public void deleteWardrobe(int wardrobeId) {
        wardrobeMapper.deleteWardrobe(wardrobeId);
    }

    @Override
    public PageBean<Wardrobe> getWardrobes(Map<String,String> map, int currentPage, int pageSize) {
        PageHelper.startPage(currentPage,pageSize);
        if(map==null)
            map=new HashMap<>();
        List<Wardrobe> list=wardrobeMapper.selectWardrobes();
        int count=wardrobeMapper.selectWardrobeCount();
        PageBean<Wardrobe> pg=new PageBean<>(currentPage,pageSize,count);
        pg.setItems(list);
        return pg;
    }

    @Override
    public List<Wardrobe> getFreeWardrobes() {
        return wardrobeMapper.selectFreeWardrobe();
    }

    @Override
    public Wardrobe getWardrobe(int wardrobeId) {
        return wardrobeMapper.selectWardrobe(wardrobeId);
    }

    @Override
    public void addWardrobeRecord(WardrobeRecord wardrobeRecord) {
        wardrobeMapper.insertWardrobeRecord(wardrobeRecord);
    }

    @Override
    public void editorWardrobeRecord(WardrobeRecord wardrobeRecord) {
        wardrobeMapper.updateWardrobeRecord(wardrobeRecord);
    }

    @Override
    public void removeWardrobeRecord(int wardrobeRecordId) {
        wardrobeMapper.deleteWardrobeRecord(wardrobeRecordId);
    }

    @Override
    public List<WardrobeRecord> getWardrobeRecords(WardrobeRecord wardrobeRecord, int currentPage, int pageSize) {
        return wardrobeMapper.selectWardrobeRecords();
    }

    @Override
    public WardrobeRecord getWardrobeRecord(int wardrobeRecordId) {
        return wardrobeMapper.selectWardrobeRecord(wardrobeRecordId);
    }
}
