package pl.sda.strukturydanych.kolejka;

public class KolejkaElem {

    private int value;
    private KolejkaElem next;

    public KolejkaElem(int value, KolejkaElem nest){
        this.value = value;
        this.next = next;
    }

    public int getValue() {
        return value;
    }

    public KolejkaElem getNext() {
        return next;
    }

    public void setNext(KolejkaElem next) {
        this.next = next;
    }
}
