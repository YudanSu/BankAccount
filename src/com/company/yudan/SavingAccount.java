//package com.company.yudan;
//
//public class SavingAccount extends BankAccount {
//    private double interestRate;
//    private double minBalance;
//
//    public SavingAccount(){
//
//    }
//    public void setInterestRate(double rate){
//
//    }
//
//    @Override
//    public void withdraw(double amount) {
//        super.withdraw(amount);
//        double balance = getBalance();
//        if ( balance < minBalance)
//            minBalance = balance;
//    }
//
//    @Override
//    public void monthEnd() {
//        double interest = minBalance *interestRate / 100;
//        deposit(interest);//when one month end, calculate the interest, and store it(deposit), then set the current
//        //balance as the minbalance.
//        minBalance = getBalance();//
//    }
//}//end of class
