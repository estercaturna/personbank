package org.academiacodigo.thisfunctionals.exepersonbank;

public  class Card {

    private Person person;
    private  Bank bank;
    private Payments food;
    private Payments net;
    private Payments lostArk;
    public Card(Person person, Bank bank) {
        this.person =person;
        this.bank = bank;
        this.net = net;
        this.food = food;
        this.lostArk = lostArk;
    }
    public Person getPerson() {
        return person;
    }
    public Bank getBank() {
        return bank;
    }
    public Payments getNet(){
        return net;
    }
    public Payments getFood() {
        return food;
    }
    public Payments getLostArk() {
        return lostArk;
    }

    public void deposite(long moneyDep) { //Deposit money
        long depositM = bank.getPersonMoney();
        depositM += moneyDep;
        bank.setPersonMoney(depositM);
    }
    public void raiseMoney(long withDraw)  { //levantar dinheiro
        long raiseM = bank.getPersonMoney();
        raiseM -= withDraw;
        bank.setMoneyRaised(withDraw);

            if (bank.getPersonMoney() >= withDraw) {
            } else {
                System.out.println("Not possible.");
            }
    }
    public void payNet(long net) {
        long bills = bank.getPersonMoney();
        bills -= net;
        bank.setMoneyRaised(bills);
    }
    public void payFood(long foodie, String food) {
        long payfood = bank.getPersonMoney();
        payfood -= foodie;
        bank.setMoneyRaised(payfood);

    }
    public void payGames(long lostArk, long Twitch) {
        long payPrime = bank.getPersonMoney();
        payPrime -= lostArk;
        bank.setMoneyRaised(payPrime);

    }
}



