package com.newer.gym.repository;

import org.apache.ibatis.jdbc.SQL;

import java.util.Map;

public class AnalysisMapperProvider {
    public String selectMemberExpense(Map<String,String> map){
        String sql=new SQL(){
            {
                SELECT("*");
                FROM("member_expense");
                if(map.get("productId")!=null && map.get("productId")!=""){
                    WHERE(" product_id =#{productId}");
                }
                if(map.get("courseId")!=null && map.get("courseId")!=""){
                    WHERE("course_id = #{courseId}");
                }
            }
        }.toString();
        return sql;
    }

    public String selectMemberExpenseCount(Map<String,String> map){
        String sql=new SQL(){
            {
                SELECT("count(*)");
                FROM("member_expense");
                if(map.get("productId")!=null && map.get("productId")!=""){
                    WHERE(" product_id =#{id}");
                }
                if(map.get("courseId")!=null && map.get("courseId")!=""){
                    WHERE("course_id = #{id}");
                }
            }
        }.toString();
        return sql;
    }

}
