package com.newer.gym.controller;

import com.newer.gym.bean.PageBean;
import com.newer.gym.bean.Wardrobe;
import com.newer.gym.bean.WardrobeRecord;
import com.newer.gym.service.WardrobeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin
public class WardrobeController {
    @Autowired
    WardrobeService wardrobeService;
    public void addWardrobe(Wardrobe wardrobe) {

    }

    public void editorWardrobe(Wardrobe wardrobe) {

    }

    public void deleteWardrobe(int wardrobeId) {

    }

    @GetMapping("/wardrobe/getWardrobes")
    public PageBean<Wardrobe> getWardrobes(@RequestBody(required = false) Map<String,String> map, @RequestParam(defaultValue = "1") int currentPage, @RequestParam(defaultValue = "10")  int pageSize) {
        return wardrobeService.getWardrobes(map,currentPage,pageSize);
    }
    @GetMapping("/wardrobe/getFreeWardrobes")
    public List<Wardrobe> getFreeWardrobes(){
        return wardrobeService.getFreeWardrobes();
    };
    public Wardrobe getWardrobe(int wardrobeId) {
        return null;
    }

    public void addWardrobeRecord(WardrobeRecord wardrobeRecord) {
        wardrobeService.addWardrobeRecord(wardrobeRecord);
    }

    public void editorWardrobeRecord(WardrobeRecord wardrobeRecord) {

    }

    public void removeWardrobeRecord(int wardrobeRecordId) {

    }

    public List<WardrobeRecord> getWardrobeRecords(WardrobeRecord wardrobeRecord, int currentPage, int pageSize) {
        return null;
    }

    public WardrobeRecord getWardrobeRecord(int wardrobeRecordId) {
        return null;
    }
}
