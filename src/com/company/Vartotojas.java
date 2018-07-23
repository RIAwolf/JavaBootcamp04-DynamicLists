package com.company;

public class Vartotojas {

    public String vardas ="";
    public int amzius = 0;

    private Vartotojas next=null;


    public Vartotojas getNext() {
        return next;
    }

    public void setNext(Vartotojas next) {
        this.next = next;
    }
}
