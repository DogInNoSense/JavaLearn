package com.xyz;

/**
 * 账户类
 */
public class Account {
    /**
     * 成员变量 私有
     */
    private String cardId;
    private String userName;// 用户名
    private String passWord; // 密码
    private double money; // 账户余额
    private double quotaMoney; // 每次取现额度

    public String getCardId() {
        return cardId;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public double getMoney() {
        return money;
    }

    public double getQuotaMoney() {
        return quotaMoney;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public void setQuotaMoney(double quotaMoney) {
        this.quotaMoney = quotaMoney;
    }
}
