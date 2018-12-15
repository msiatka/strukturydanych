package pl.sda.strukturydanych;

import pl.sda.strukturydanych.Lista.Lista;
import pl.sda.strukturydanych.algorytmy.BinarySearch;
import pl.sda.strukturydanych.algorytmy.ONP;
import pl.sda.strukturydanych.kolejka.KolejkaList;
import pl.sda.strukturydanych.stos.StosList;
import pl.sda.strukturydanych.stos.StosListIndexOutException;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        System.out.println(" test");
//        wywolajStosTab();

        // stos na liscie
       // wywolajStosList();
       // wywolajStosList();


        //  wywolajKolejkaList();


        // odwrócona notacja polska
       // wywolajONP();
        // wyrazenie np: 1 2 + 3 * 1 - 2 /  ...

       // wywolajBinarySearch();


        //lista dwukierunkowa
        //wywolajLista();

        wywolajZM();

    }

    public static void wywolajZM() {

        System.out.println(" koemntarz");
    }

    public static void wywolajLista(){
        Lista lista = new Lista();

        lista.addFirst(3);
        lista.addFirst(2);
        lista.addFirst(1);

        lista.addLast(4);
        lista.addLast(5);

        System.out.println(" Peak first: " + lista.peekFirst());
        System.out.println(" Peak last: " + lista.peekLast());

        lista.show();
        lista.showReverse();

        System.out.println(" Czy znajduje sie: " + lista.znajdz(1));

        lista.usun(3);

        lista.show();

//        lista.pollFirst();
//        lista.polllast();
//
//        lista.polllast();
//        lista.polllast();
//
//
//        lista.show();
    }

    public static void mojaNowaMetodaJava(){
        System.out.println("Dodałem nowa funkcje");

    }
    public static void wywolajONP(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wyrazenie w odwrotnej notacji polskiej");
        String wejscie = scanner.nextLine();

        String[] podzial = wejscie.split(" ");

        new ONP().run(podzial);

    }

    public static void wywolajBinarySearch(){
        int tab[] = new int[] {1,2,4,6,7,8,11,12,15,19};
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Podaj szukaną wartość: ");
        int szukana = scanner.nextInt();
        new BinarySearch().run(tab,szukana);
    }
    public static void wywolajKolejkaList(){
       KolejkaList kolejkaList = new KolejkaList();

        kolejkaList.add(1);
        kolejkaList.add(2);
        kolejkaList.add(3);
        kolejkaList.show();
        System.out.println("peak " + kolejkaList.peek());

        kolejkaList.poll();
        kolejkaList.poll();
        kolejkaList.show();

        kolejkaList.add(4);
        kolejkaList.add(5);
        kolejkaList.show();

        System.out.println("KONIEC");
    }
    public static void wywolajStosList(){
        StosList stosList = new StosList();
        stosList.push(1);
        stosList.push(2);
        stosList.push(3);

        stosList.show();
        try{
            stosList.pop();
            stosList.pop();
        } catch (StosListIndexOutException e){
            System.out.println(e.getMessage());
        }

       // stosList.pop();
        stosList.show();

        stosList.push(4);
        stosList.push(5);
        stosList.show();

        try{
            stosList.pop();
            stosList.pop();
            stosList.pop();
            stosList.pop();

        } catch (StosListIndexOutException e){
            System.out.println(e.getMessage());
        }
        stosList.show();

        System.out.println(" KONIEC");

    }

    public static void wywolajStosTab(){
        Scanner scanner = new Scanner(System.in);
        int tab[];
        int rozmiar;
        StosTab stosTab;

        System.out.println(" podaj rozmiar tavblicy: ");
        rozmiar =scanner.nextInt();
        tab = new int[rozmiar];

        stosTab = new StosTab(rozmiar);

//        System.out.println(" podaj elenet tablicy: ");
//        for(int i=0;i<rozmiar;i++){
//            tab[i]=scanner.nextInt();
//        }

        System.out.println(" podaj elenet tablicy: ");
        while (true){
            System.out.println(" 1 - push ( wprowadz do stosu), 2 - pop, 3 - peak, 4 -show 0 - wyjscie");
            int operacja = scanner.nextInt();

            switch (operacja){
                case 0:
                    return;
                case 1:
                    System.out.println(" Podaj waretość na stos");
                    int w = scanner.nextInt();
                    try {stosTab.push(w);}
                    catch(ArrayIndexOutOfBoundsException e){
                        System.out.println(" tablica pełna");
                    }
                    break;
                case 2:
                   // int w =stosTab.pop();
                    try {
                        System.out.println("Pop: " + stosTab.pop());
                    }catch (ArrayIndexOutOfBoundsException e){
                        System.out.println(" Tablica pusta");
                } break;
                case 3:
                    //int w = stosTab.peek();
                    System.out.println("Peek:" + stosTab.peek());
                    break;
                case 4:
                    stosTab.show();
                    break;
            }
        }


    }
}
