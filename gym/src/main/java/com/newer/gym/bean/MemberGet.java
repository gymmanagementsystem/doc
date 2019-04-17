package com.newer.gym.bean;

import java.util.Date;

/**
* @Description:    会员来访
 *                  记录每个会员来店的时间，来一次记录一次
* @Author:         HiFiYi
* @CreateDate:     2019/4/16 14:04
*/
public class MemberGet {

    private int id;             // 会员来访记录的编号
    private Member member;      // 来访的会员
    private Date time;          // 来访时间
    private String remark;      //备注

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public MemberGet(int id, Member member, Date time, String remark) {
        this.id = id;
        this.member = member;
        this.time = time;
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "MemberGet{" +
                "id=" + id +
                ", member=" + member +
                ", time=" + time +
                ", remark='" + remark + '\'' +
                '}';
    }

    public MemberGet() {
        super();
    }
}
