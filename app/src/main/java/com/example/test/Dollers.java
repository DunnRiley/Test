package com.example.test;

public class Dollers extends Currency {

    private int dollar;
    private int cents;
    private int total = dollar*100+cents;

    public int getDollar(){
        return dollar;
    }
    public int getCents(){
        return cents;
    }

    String getCode() {
        return "USD";
    }
    int getAmount() {
        return total;
    }

    Dollers(int dollars, int cents) {
        this.cents = cents;
        this.dollar = dollars;
    }


    public void add(Dollers other) {
        int total = (dollar * 100) + (other.getDollar() * 100) + cents + other.getCents();
        dollar = total / 100;
        cents = total % 100;
    }

    public void subtract(Dollers other) {
        int total = (dollar * 100) - (other.getDollar() * 100) + cents - other.getCents();
        dollar = total / 100;
        cents = total % 100;
    }

    public void printFormatted(){
        System.out.println("$"+ dollar+"." + cents);

    }

    public void change() {
        int total = dollar * 100 + cents;
        int qurters = total / 25;
        total -= 25 * qurters;
        int dimes = total / 10;
        total -= 10 * dimes;
        int nickles = total / 5;
        total -= nickles * 5;
        int pennies = total;

        System.out.println(Integer.toString(qurters) + " Qurters " + Integer.toString(dimes) + " Dimes " + Integer.toString(nickles) + " Nickles " + Integer.toString(pennies) + " Pennies ");

    }
}
