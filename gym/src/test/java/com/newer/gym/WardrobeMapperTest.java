package com.newer.gym;

import com.newer.gym.bean.Member;
import com.newer.gym.bean.Wardrobe;
import com.newer.gym.bean.WardrobeRecord;
import com.newer.gym.repository.WardrobeMapper;
import com.newer.gym.service.WardrobeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
@RunWith(SpringRunner.class)
@SpringBootTest
public class WardrobeMapperTest {
    @Autowired
    WardrobeMapper wardrobeMapper;

    @Test
    public void addWardrobe( ) {

        Wardrobe wardrobe=new Wardrobe(1,0,null,6,"A区","无");
        for(int i=0;i < 10;i++){
            wardrobeMapper.insertWardrobe(wardrobe);
        }
    }

    @Test
    public void editorWardrobe( ) {
        Member member=new Member();
        member.setId(2);
        Wardrobe wardrobe=new Wardrobe(1,0,null,6,"B区","无");
        wardrobeMapper.updateWardrobe(wardrobe);
    }

    @Test
    public void deleteWardrobe( ) {
        wardrobeMapper.deleteWardrobe(31);
    }

    @Test
    public void getWardrobes( ) {
        List<Wardrobe> list=wardrobeMapper.selectWardrobes();
        for (Wardrobe w:list
             ) {
            System.out.println(w);
        }
    }
    @Test
    public void getWardrobe( ) {
        Wardrobe w=wardrobeMapper.selectWardrobe(1);
        System.out.println(w);
    }

    @Test
    public void addWardrobeRecord( ) {
        WardrobeRecord wr=new WardrobeRecord();
    }
    @Test
    public void editorWardrobeRecord( ) {

    }

    @Test
    public void removeWardrobeRecord( ) {

    }

    @Test
    public void getWardrobeRecords( ) {

    }

    @Test
    public void getWardrobeRecord( ) {

    }
}
