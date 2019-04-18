package com.newer.gym.bean;

import java.util.Date;

/**
* @Description:    会员卡实体类
* @Author:         HiFiYi
* @CreateDate:     2019/4/15 16:16
*/
public class Member {
    private int id;                 // 会员卡号     --id
    private String name;            // 会员姓名     --name
    private CardType cardType;      // 会员卡类型   --cardType_id
    private int sex;                // 性别         --sex
    private Date openTime;          // 开卡时间     --openTime
    private Date closeTime;         // 到期时间     --closeTime
    private double balance;         // 会员卡余额   --balance
    private String tel;               // 电话号码     --tel
    private int state;              // 会员状态     --state
    private Date birthday;          // 会员生日     --birthday
    private Staff coach;            // 教练         --coach
    private Wardrobe wardrobe;      // 衣柜         --wardrobe_id
    private Staff counselor;        // 会籍顾问     --counselor
    private int identify;           // 证件类型     --identify
    private String idCard;            // 证件编号     --idCard
    private String address;         // 联系地址     --address
    private String remark;          //备注          --remark

    public Member() {
        super();
    }

    @Override
    public String toString() {
        return "Member{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cardType=" + cardType +
                ", sex=" + sex +
                ", openTime=" + openTime +
                ", closeTime=" + closeTime +
                ", balance=" + balance +
                ", tel=" + tel +
                ", state=" + state +
                ", birthday=" + birthday +
                ", coach=" + coach +
                ", wardrobe=" + wardrobe +
                ", counselor=" + counselor +
                ", identify=" + identify +
                ", idCard=" + idCard +
                ", address='" + address + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }

    public Member(int id, String name, CardType cardType,
                  int sex, Date openTime, Date closeTime,
                  double balance, String tel, int state,
                  Date birthday, Staff coach, Wardrobe wardrobe,
                  Staff counselor, int identify, String idCard,
                  String address, String remark) {
        this.id = id;
        this.name = name;
        this.cardType = cardType;
        this.sex = sex;
        this.openTime = openTime;
        this.closeTime = closeTime;
        this.balance = balance;
        this.tel = tel;
        this.state = state;
        this.birthday = birthday;
        this.coach = coach;
        this.wardrobe = wardrobe;
        this.counselor = counselor;
        this.identify = identify;
        this.idCard = idCard;
        this.address = address;
        this.remark = remark;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CardType getCardType() {
        return cardType;
    }

    public void setCardType(CardType cardType) {
        this.cardType = cardType;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public Date getOpenTime() {
        return openTime;
    }

    public void setOpenTime(Date openTime) {
        this.openTime = openTime;
    }

    public Date getCloseTime() {
        return closeTime;
    }

    public void setCloseTime(Date closeTime) {
        this.closeTime = closeTime;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Staff getCoach() {
        return coach;
    }

    public void setCoach(Staff coach) {
        this.coach = coach;
    }

    public Wardrobe getWardrobe() {
        return wardrobe;
    }

    public void setWardrobe(Wardrobe wardrobe) {
        this.wardrobe = wardrobe;
    }

    public Staff getCounselor() {
        return counselor;
    }

    public void setCounselor(Staff counselor) {
        this.counselor = counselor;
    }

    public int getIdentify() {
        return identify;
    }

    public void setIdentify(int identify) {
        this.identify = identify;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
