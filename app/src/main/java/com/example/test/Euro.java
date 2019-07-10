package com.example.test;

public class Euro extends Currency {

    private int euro;
    private int cents;
    private int total = euro*100+cents;

    public int getEuro(){
        return euro;
    }
    public int getCents(){
        return cents;
    }

    String getCode() {
        return "EUR";
    }
    int getAmount() {
        return total;
    }

    Euro(int euro, int cents) {
        this.cents = cents;
        this.euro = euro;
    }


    public void add(Euro other) {
        int total = (euro * 100) + (other.getEuro() * 100) + cents + other.getCents();
        euro = total / 100;
        cents = total % 100;
    }

    public void subtract(Euro other) {
        int total = (euro * 100) - (other.getEuro() * 100) + cents - other.getCents();
        euro = total / 100;
        cents = total % 100;
    }

    public void printFormatted(){
        System.out.println("$"+ euro+"." + cents);

    }

    public void change() {
        int total = euro * 100 + cents;
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
