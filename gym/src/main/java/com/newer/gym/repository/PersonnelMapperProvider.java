package com.newer.gym.repository;

import org.apache.ibatis.jdbc.SQL;

import java.util.Map;

import static org.springframework.http.HttpHeaders.FROM;

public class PersonnelMapperProvider {

    public String selectStaffs(Map<String,Object> map){
//        for (String key : map.keySet()) {
//            System.out.println(key + " ：" + map.get(key)=="" );
//        }
        String sql=new SQL( ){{
            SELECT("*");
            FROM("staff");
            if(map.get("id")!=null && map.get("id")!=""  ){
                WHERE("id=#{id}");
            }
            if(map.get("name")!=null&& map.get("name")!="" ){
                WHERE("name like concat('%',#{name},'%')");
            }
            if(map.get("sex")!=null&& map.get("sex")!="" ){
                WHERE("sex=#{sex}");
            }
//            if(map.get("date")!=null&& map.get("date")!="" ){
//                WHERE("time=#{date}");
//            }
            if(map.get("job")!=null&& map.get("job")!="" ){
                WHERE("job=#{job}");
            }
        }}.toString();
        System.out.println(sql);
        return sql;
    }
    public String selectStaffsCount(Map<String,Object> map){
        String sql=new SQL( ){{
            SELECT("count(*)");
            FROM("staff");
            if(map.get("id")!=null && map.get("id")!=""  ){
                WHERE("id=#{id}");
            }
            if(map.get("name")!=null&& map.get("name")!="" ){
                WHERE("name like concat('%',#{name},'%')");
            }
            if(map.get("sex")!=null&& map.get("sex")!="" ){
                WHERE("sex=#{sex}");
            }
//            if(map.get("date")!=null&& map.get("date")!="" ){
//                WHERE("time=#{date}");
//            }
            if(map.get("job")!=null&& map.get("job")!="" ){
                WHERE("job=#{job}");
            }
        }}.toString();
        System.out.println(sql);
        return sql;
    }
}
