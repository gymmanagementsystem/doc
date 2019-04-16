package com.newer.gym.bean;
/**
 * @Author:        XiaoYongJun
 * @CreateDate:   2019-04-09 11:29
 * @Description:  java类作用描述
 */
public class Notice {
    private int notice_id;//通知编号    notice_id int
    private String notice_type;//通知类型	notice_type	char
    private String notice_content;//通知内容	notice_content	text
    private int notice_time;   //发布时间	notice_time	datetime
    private int notice_member;//接收通知对象	notice_member	int
}
