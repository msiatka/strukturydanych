package pl.sda.strukturydanych.stos;

public class StosList {

    private StosElem top;

    public void StosList(){
        top = null;
    }

    public void push(int wartosc){
        top = new StosElem(wartosc,top);
        //argument top - to stary - biezacy top -> za chwile bedziemy mieli nowy top

    }

    public int pop() throws StosListIndexOutException
    {
        if(isEmpty()){
            throw new StosListIndexOutException(" Stos pusty");
        }
        int value = top.getValue();
        top = top.getPrev();
        return value;
    }

    public boolean isEmpty(){
        return top == null;
//        if(top==null) {
//            return true;
//        } else{
//                return false;
//            }

    }

    public int peek(){

        return 0;
    }

    public void show(){
        StosElem elemTmp = top;

        while (elemTmp!=null){
            int wartoscNaEkran = elemTmp.getValue();
            System.out.print(wartoscNaEkran + " ");
            elemTmp = elemTmp.getPrev();

        }

        System.out.println();
    }

}
