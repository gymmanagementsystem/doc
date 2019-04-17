package com.newer.gym.repository;

import com.newer.gym.bean.Admin;
import com.newer.gym.bean.Logger;
import com.newer.gym.bean.Member;
import com.newer.gym.bean.Notice;
import org.apache.ibatis.jdbc.SQL;

import java.util.Map;

public class SystemMapperProvider {
    /**
     * 根据通知类的属性通知id，通知时间，通知属性等条件生成查询notice表的sql语句
     *
     * @param notice
     * @return String
     * @throws
     * @author pjun
     * @date 2019-04-17 14:19
     */
    public String selectNotices(Notice notice) {
        String sql = new SQL() {
            {
                SELECT("*");
                FROM("member");
                if (notice.getId() != 0) {
                    WHERE("id=#{id}");
                }
                if (notice.getType() != null) {
                    WHERE("type=#{type}");
                }
                if (notice.getTime() != null) {
                    WHERE("time=#{time}");
                }
            }
        }.toString();
        System.out.println("查询符合条件的sql语句为:" + sql);
        return sql;
    }

    /**
     * 根据通知类的属性通知id，通知时间，通知属性等条件生成查询notice表的数据数量的sql语句
     *
     * @param notice
     * @return
     * @throws
     * @author pjun
     * @date 2019-04-17 14:35
     */
    public String selectNoticesCount(Notice notice) {
        String sql = new SQL() {
            {
                SELECT("count(*)");
                FROM("member");
                if (notice.getId() != 0) {
                    WHERE("id=#{id}");
                }
                if (notice.getType() != null) {
                    WHERE("type=#{type}");
                }
                if (notice.getTime() != null) {
                    WHERE("time=#{time}");
                }
            }
        }.toString();
        System.out.println("查询符合条件的数量的sql语句为:" + sql);
        return sql;
    }

    /**
     * 根据日志类的条件生成查询logger表的sql语句
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
     * 据日志类的条件生成查询logger表内数据的数量的sql语句
     *
     * @param map
     * @return
     * @throws
     * @author pjun
     * @date 2019-04-17 15:38
     */
    public String selectloggersCount(Map<String, Object> map) {
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
