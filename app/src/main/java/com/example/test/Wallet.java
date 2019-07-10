package com.example.test;

import java.util.ArrayList;
public class Wallet {
    ArrayList amount = new ArrayList();
    int totaladd = 0;
    void add(Currency currency){
        amount.add(currency.getAmount());
        totaladd = totaladd+currency.getAmount();
    }
    boolean canSpend(Currency currency){
        if(totaladd <= currency.getAmount()){
            return true;
        }
        else{
            return false;
        }
    }
    double getDallarTotal(){
        return (ExchangeService.getRait);
    }
}
