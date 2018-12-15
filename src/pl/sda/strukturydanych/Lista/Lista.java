package pl.sda.strukturydanych.Lista;

import java.sql.SQLOutput;
import java.util.List;


// lista dwukierunkowa
// linked list - dziala na takiej zasadzie
// ArrayList dziala na tablicach - roznice ?
public class Lista {

    private ListaElem first; //head
    private ListaElem last; //tail
    public Lista(){
        first = last = null;
    }

    public void addLast(int wartosc){
        ListaElem newListElem = new ListaElem(wartosc);
        if (last == null){
            first = last = newListElem;
        } else {
            last.setNext(newListElem);
            newListElem.setPrev(last);

            last = newListElem;
        }
    }



    public void addFirst(int wartosc) {
        ListaElem newListElem = new ListaElem(wartosc);
        if (first == null) {
            first = last = newListElem;
        } else {
            first.setPrev(newListElem);
            newListElem.setNext(first);
            first = newListElem;

        }
    }

    public int peekFirst(){
            return first.getValue();
        }

        public int peekLast(){
          return last.getValue();
        }

        public int pollFirst(){
        if(first == null){
            //TODO EXCEPTION
        }

        if(first.getNext() == null){
           // last.setValue(null);
            last = null;
        }

        int value = first.getValue();
        first = first.getNext();

        if(first != null){
            first.setPrev(null);
        }

        return value;

        }

        public int polllast(){

        if(last == null){
            //TODO EXCEPTION
        }
        if(last.getPrev() == null){
            first = null;
        }

        int value = last.getValue();
        last = last.getPrev();

        if(last != null){
            last.setNext(null);
        }

        return value;
        }

        public void show(){
          ListaElem listaElemTmp = first;
          while (listaElemTmp != null){
              System.out.print(listaElemTmp.getValue() + " ");
              listaElemTmp = listaElemTmp.getNext();
          }
            System.out.println();

        }

        public void showReverse(){
         ListaElem listElemTmp = last;
         while(listElemTmp != null){
            System.out.print(listElemTmp.getValue() + " ");
            listElemTmp = listElemTmp.getPrev();
        }
            System.out.println();

        }

        public ListaElem znajdz(int wartosc){
        ListaElem listaElemTmp = first;


        //ciekawe zwaracamy od razu do metody - wychodzimy z petli
        while(listaElemTmp != null){
            if (listaElemTmp.getValue() == wartosc){
                return listaElemTmp;
            }
            listaElemTmp = listaElemTmp.getNext();
        }

        return null;
        }

        public boolean usun(int wartosc){
        ListaElem szukanyElement = znajdz(wartosc);

        if(szukanyElement == null) {
            return false;
        } else if (wartosc == first.getValue()){
            pollFirst();
        } else if (wartosc == last.getValue()){
            polllast();
        } else {
            szukanyElement.getPrev().setNext(szukanyElement.getNext());
            szukanyElement.getNext().setPrev(szukanyElement.getPrev());
        }
            return true;

}

}
