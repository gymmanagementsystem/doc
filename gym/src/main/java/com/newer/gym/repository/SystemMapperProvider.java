package com.newer.gym.repository;

import com.newer.gym.bean.Admin;
import com.newer.gym.bean.Logger;
import com.newer.gym.bean.Member;
import com.newer.gym.bean.Notice;
import org.apache.ibatis.jdbc.SQL;

import java.sql.Date;
import java.util.Map;

public class SystemMapperProvider {
    /**
     * 根据时间和类型筛选,返回通知id和通知内的member字段数据
     *
     * @param
     * @return String
     * @throws
     * @author pjun
     * @date 2019-04-17 14:19
     */
    public String selectMembers(Map<String, Object> map) {
        String sql = new SQL() {
            {
                SELECT("id，member");
                FROM("notice");
                if (map.get("type")!=null) {
                    WHERE("type='#{type}'");
                }
                if (map.get("date")!=null) {
                    WHERE("date<'#{date}'");
                }
            }
        }.toString();
        System.out.println("查询符合条件的sql语句为:" + sql);
        return sql;
    }

    /**
     * 根据条件查询获得符合条件的notice数量
     *
     * @param
     * @return
     * @throws
     * @author pjun
     * @date 2019-04-17 14:35
     */
    public String selectNoticesCount(Map<String, Object> map) {
        String sql = new SQL() {
            {
                SELECT("count(*)");
                FROM("notice");
                if (map.get("type")!=null) {
                    WHERE("type='#{type}'");
                }
                if (map.get("date")!=null) {
                    WHERE("date<'#{date}'");
                }
            }
        }.toString();
        System.out.println("查询符合条件的数量的sql语句为:" + sql);
        return sql;
    }

    /**
     * 根据日志类的条件查询出符合条件的logger
     *
     * @param map
     * @return
     * @throws
     * @author pjun
     * @date 2019-04-17 14:49
     */
    public String selectLoggers(Map<String, Object> map) {
        String sql = new SQL() {
            {
                SELECT("*");
                FROM("logger");
                if (map.get("begin") != null) {
                    WHERE("time>#{begin}");
                }
                if (map.get("finish") != null) {
                    WHERE("time<#{finish}");
                }
                if (map.get("adminName") != null) {
                    WHERE("operater=#{adminName}");
                }
            }
        }.toString();
        System.out.println("查询符合条件的数量的sql语句为:" + sql);
        return sql;
    }

    /**
     * 根据日志类的条件查询出符合条件的logger数量
     *
     * @param map
     * @return
     * @throws
     * @author pjun
     * @date 2019-04-17 15:38
     */
    public String selectLoggersCount(Map<String, Object> map) {
        String sql = new SQL() {
            {
                SELECT("count(*)");
                FROM("logger");
                if (map.get("begin") != null) {
                    WHERE("time>#{begin}");
                }
                if (map.get("finish") != null) {
                    WHERE("time<#{finish}");
                }
                if (map.get("adminName") != null) {
                    WHERE("operater=#{adminName}");
                }
            }
        }.toString();
        System.out.println("查询符合条件的数量的sql语句为:" + sql);
        return sql;
    }
}
