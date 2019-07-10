package com.example.test;

public class ExchangeService {

    public static double getRait = 0;

    public void rait(Currency currency){
        if (currency.getCode() == "USD"){
            getRait = 1.0;
        }
        if (currency.getCode() == "EUR"){
            getRait = 1.2;
        }
    }
}
