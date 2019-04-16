package com.newer.gym.bean;

import java.util.Date;

/**
* @Description:    日志类
* @Author:         HiFiYi
* @CreateDate:     2019/4/16 14:42
*/
public class Logger {
    private int id;         // 日志编号
    private String module;  // 模块类别
    private String type;    // 操作乐行
    private String operater;    // 操作人员
    private Date time;          // 操作时间
    private String remark;      // 备注

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Logger{" +
                "id=" + id +
                ", module='" + module + '\'' +
                ", type='" + type + '\'' +
                ", operater='" + operater + '\'' +
                ", time=" + time +
                ", remark='" + remark + '\'' +
                '}';
    }

    public String getModule() {
        return module;
    }

    public Logger() {
        super();
    }

    public void setModule(String module) {
        this.module = module;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getOperater() {
        return operater;
    }

    public void setOperater(String operater) {
        this.operater = operater;
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

    public Logger(int id, String module, String type, String operater, Date time, String remark) {
        this.id = id;
        this.module = module;
        this.type = type;
        this.operater = operater;
        this.time = time;
        this.remark = remark;
    }
}
