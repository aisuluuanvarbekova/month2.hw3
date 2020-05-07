package com.company;

public class Main {

    public static void main(String[] args) throws LimitException {
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(10000);
        for (int i = 0; ; i++) {
            try {
                bankAccount.withDraw( 6000);


            } catch (LimitException tt) {
                System.out.println(" Сейчас "  + bankAccount.getAmount());
                System.out.println("---------------------------------");
                bankAccount.withDraw ((int) bankAccount.getAmount());


                System.out.println(tt.getMessage());

                System.out.println(" Сейчас "  + bankAccount.getAmount());
                System.out.println("---------------------------------");
                break;


            }
        }
    }
}

