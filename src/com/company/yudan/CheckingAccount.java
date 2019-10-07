//package com.company.yudan;
//
//public class CheckingAccount extends BankAccount {
//    private int withdrawals;
//
//
//    public CheckingAccount(){
//
//    }
//
//    @Override
//    public void withdraw(double amount) {
//        final int FREE_WITHDRAWALS = 3;
//        final int WITHDRAWAL_FREE = 1;
//
//        super.withdraw(amount);
//        withdrawals++;
//        if (withdrawals > FREE_WITHDRAWALS)
//            super.withdraw(WITHDRAWAL_FREE);
//    }
//
//    @Override
//    public void monthEnd() {
//        withdrawals = 0;
//    }
//}
