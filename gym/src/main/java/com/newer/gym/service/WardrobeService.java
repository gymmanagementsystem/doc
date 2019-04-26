package com.newer.gym.service;

import com.newer.gym.bean.PageBean;
import com.newer.gym.bean.Wardrobe;
import com.newer.gym.bean.WardrobeRecord;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
* @Description:    衣柜信息服务接口
* @Author:         HiFiYi
* @CreateDate:     2019/4/20 12:30
*/
@Service
public interface WardrobeService {

    void addWardrobe(Wardrobe wardrobe);

    void editorWardrobe(Wardrobe wardrobe);

    void deleteWardrobe(int wardrobeId);

    PageBean<Wardrobe> getWardrobes(Map<String,String> map, int currentPage, int pageSize);

    List<Wardrobe> getFreeWardrobes();


    Wardrobe getWardrobe(int wardrobeId);

    void addWardrobeRecord(WardrobeRecord wardrobeRecord);

    void editorWardrobeRecord(WardrobeRecord wardrobeRecord);

    void removeWardrobeRecord(int wardrobeRecordId);

    List<WardrobeRecord> getWardrobeRecords(WardrobeRecord wardrobeRecord,int currentPage,int pageSize);

    WardrobeRecord getWardrobeRecord(int wardrobeRecordId);
}
