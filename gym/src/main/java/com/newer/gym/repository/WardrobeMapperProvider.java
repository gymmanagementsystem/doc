package com.newer.gym.repository;

import org.apache.ibatis.jdbc.SQL;

import java.util.Map;

public class WardrobeMapperProvider {
    public String selectWardrobes(Map<String,Object> map){
        String sql=new SQL() {
            {
                SELECT("*");
                FROM("wardrobe");
                if (map.get("state") != null) {
                    WHERE("state=#{state}");
                }
                if (map.get("id") != null) {
                    WHERE("id=#{id}");
                }
            }
        }.toString();
        return sql;
    }

    public String selectWardrobesCount(Map<String,Object> map){
        String sql=new SQL() {
            {
                SELECT("count(*)");
                FROM("wardrobe");
                if (map.get("state") != null) {
                    WHERE("state=#{state}");
                }
                if (map.get("id") != null) {
                    WHERE("id=#{id}");
                }
            }
        }.toString();
        return sql;
    }



}
