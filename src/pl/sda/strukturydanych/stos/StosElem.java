package pl.sda.strukturydanych.stos;

public class StosElem {
    private int value;
    private StosElem prev;
    public StosElem(int value, StosElem prev){
        this.value = value;
        this.prev = prev;
    }

    public int getValue() {
        return value;
    }

    public StosElem getPrev() {
        return prev;
    }
}
