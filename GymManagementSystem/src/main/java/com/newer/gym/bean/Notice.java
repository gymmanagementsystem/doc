package com.newer.gym.bean;

import java.util.List;

/**
 * @Author:        XiaoYongJun
 * @CreateDate:   2019-04-09 11:29
 * @Description:  java类作用描述
 */
public class Notice {
    private int id;//通知编号    notice_id int
    private String type;//通知类型	notice_type	char
    private String content;//通知内容	notice_content	text
    private int time;   //发布时间	notice_time	datetime
    private List<Member> member;//接收通知对象	notice_member	int
    private String remark;//备注 remark

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public List<Member> getMember() {
        return member;
    }

    public void setMember(List<Member> member) {
        this.member = member;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Notice(int id, String type, String content,
                  int time, List<Member> member, String remark) {
        this.id = id;
        this.type = type;
        this.content = content;
        this.time = time;
        this.member = member;
        this.remark = remark;
    }

    public Notice() {
        super();
    }
}
