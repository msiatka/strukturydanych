package pl.sda.strukturydanych.kolejka;

import pl.sda.strukturydanych.stos.StosListIndexOutException;

public class KolejkaList {
    KolejkaElem first;
    KolejkaElem last;


    public KolejkaList(){
        first = last = null;
    }

    public void show(){
        KolejkaElem elemTmp = first;

        while (elemTmp !=null){
            System.out.print(elemTmp.getValue() + " ");
            elemTmp=elemTmp.getNext();
        }
        System.out.println();
    }

    public void add(int wartosc){
        //dodajemy nowy element na koniec kolejki
        KolejkaElem newLastElem = new KolejkaElem(wartosc,null);

        if(first==null){
            first = last = newLastElem;
        } else {
            last.setNext(newLastElem);
            last = newLastElem;
        }
    }

    public int poll(){
         if(first==null){
             //TODO EXCEPTION
         }

         if(first.getNext()==null){
             last=null;
         }
        //pobieramy pierwsza wartosc z kolejki
        int value = first.getValue();
        first = first.getNext();
        return value;
    }

    public boolean isEmpty(){
        //kolejka jest pusta kiedy nie ma zadnego pierwszego elementu
        return first==null;
    }

    public int peek(){
        return first.getValue();

    }



}
