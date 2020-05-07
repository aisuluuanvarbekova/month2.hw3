package com.company;

public class BankAccount {
   private double amount;


    public BankAccount() {
    }

    public BankAccount(double amount) {
        this.amount = amount;
    }
    public  double getAmount(){
        return amount;


    }
    public double deposit(double sum){
        amount = amount + sum;


        System.out.println("_________________________________________________");
        System.out.println(" Ваш счет на данный момент " + sum +  " Сом ");



        return sum;
    }
    public void withDraw(int sum) throws LimitException {
        if(amount < sum){
            throw  new  LimitException(" Не достаточный баланс денег ", getAmount());
        }


        amount = amount -sum;
        System.out.println(" снято сумма " + sum);

    }

}







