package com.newer.gym.repository;

import org.apache.ibatis.jdbc.SQL;

import java.util.Map;

public class MemberMapperProvider {

    public String selectMembers(Map<String, Object> map) {
        String sql = new SQL() {
            {
                SELECT("*");
                FROM("member_card");
                if (map.get("sex") != null) {
                WHERE("sex=#{sex}");
                }
                if(map.get("id")!=null){
                    WHERE("id=#{id}");
            }
                if(map.get("name")!=null){
                    WHERE("name like concat('%',#{name},'%')");
            }
                if(map.get("cardType")!=null){
                    WHERE("cardtype_id=#{cardType}");
                }
            }
        }.toString();
        System.out.println(sql);
        return sql;
    }

    public String selectMembersCount(Map<String, Object> map) {
        String sql = new SQL() {
            {
                SELECT("count(*)");
                FROM("member_card");
                if (map.get("sex") != null) {
                    WHERE("sex=#{sex}");
                }
                if(map.get("id")!=null){
                    WHERE("id=#{id}");
                }
                if(map.get("name")!=null){
                    WHERE("name like concat('%',#{name},'%')");
                }
                if(map.get("cardType")!=null){
                    WHERE("cardtype_id=#{cardType}");
                }
            }
        }.toString();
        return sql;
    }


}
