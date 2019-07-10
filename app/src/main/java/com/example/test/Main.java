package com.example.test;

public class Main {
    public static void main(String[] args){
        Dollers d1 = new Dollers(3, 28);
        Dollers d2 = new Dollers(1, 96);
        d1.subtract(d2);
        d2.change();
        d1.printFormatted();
        d1.getCode();
    }
}
