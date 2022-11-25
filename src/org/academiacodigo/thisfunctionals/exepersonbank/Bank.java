package org.academiacodigo.thisfunctionals.exepersonbank;

public class Bank {

    private static long bankMoney;
    private static long moneyRaised;

    public Bank(long bankMoney) {
        this.bankMoney = bankMoney;
        this.moneyRaised = moneyRaised;
    }
    public long getPersonMoney() {
        return bankMoney;
    }
    public void setPersonMoney(long money) {
        this.bankMoney += money;
    }
    public long setMoneyRaised (long monRaise) {
        return bankMoney -= monRaise;
    }



}