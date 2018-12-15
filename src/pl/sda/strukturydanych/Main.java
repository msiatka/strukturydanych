package pl.sda.strukturydanych;

import pl.sda.strukturydanych.Lista.Lista;
import pl.sda.strukturydanych.algorytmy.BinarySearch;
import pl.sda.strukturydanych.algorytmy.ONP;
import pl.sda.strukturydanych.kolejka.KolejkaList;
import pl.sda.strukturydanych.stos.StosList;
import pl.sda.strukturydanych.stos.StosListIndexOutException;

import java.util.Random;
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

//        wywolajZM();
//
//        int tab[] = new int[10];
//        tab[0] = 3;
//        tab[1] = 4;
//        tab[2] = 5;
//        tab[3] = 6;
//        tab[4] = 7;
//        tab[5] = 9;
//        tab[6] = 40;
//        tab[7] = 45;
//        tab[8] = 48;
//        tab[9] = 78;

//        System.out.println(" Czy tablica jest posortowana rosnąco ? -> " + testTabSort(tab));
//        utworzTabele();
//        System.out.println("------------");

//        printTab(sumaEltablic(utworzTabele(),utworzTabele()));
//
//        printTab(sumaEltablicNierow(utworzTabele(),utworzTabele()));

        System.out.println(" czy pierwsza: " + czyPierwsza());
    }

    public static boolean czyPierwsza(){
        Boolean czyPierwsza = false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe: ");
        int i=0;
        int j=1;
        String liczba = scanner.next();
        try{ int x = Integer.parseInt(liczba);
            for(j=1;j<x+1;j++){
                if (x % j == 0) {
                    i++;
                }
            }
            if(i>2){ czyPierwsza = false; }

            if(i==2){czyPierwsza = true;}

        }catch (IllegalArgumentException e) {
            System.out.println(" LIPA");
        }
        return czyPierwsza;
    }

    public static void wywolajZM() {

        System.out.println(" koemntarz");
    }

    public static boolean testTabSort(int tab[]){

        for(int i=0;i<(tab.length-1);i++){
            if(!(tab[i]<tab[i+1])){return false;}
        }
        return true;

    }

    public static void printTab(int[] tab){
        System.out.println();
        System.out.println("++++++++++++++++++++");
        System.out.println(" ");
        for(int j=0;j<tab.length;j++){
            System.out.print(tab[j]+ " ");
        }
    }

    public static int[] utworzTabele() {
        int licznik=0;
        System.out.println("");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj wymiar tablicy: ");
        int size = scanner.nextInt();
        int[] tab = new int[size];

//        System.out.println("Podaj elementy tablicy:");
//
//        while(licznik!=size){
//            tab[licznik]=scanner.nextInt();
//            licznik++;
//        }
//
//        System.out.println(" ");
//        for(int j=0;j<tab.length;j++){
//            System.out.print(tab[j]+ " ");
//        }

        int[] tab2 = new int[size];
        Random generator = new Random();

        System.out.println(" ");
        for(int j=0;j<tab2.length;j++){
           tab2[j]=generator.nextInt(100);
        }

        for(int j=0;j<tab2.length;j++){
            System.out.print(tab2[j]+ " ");
        }

        return tab2;
    }

    public static int[] sumaEltablic(int[] x, int[] y){
        int[] tab = new int[x.length];
        if(x.length==y.length){
            for(int i=0;i<x.length;i++){
                tab[i]=x[i]+y[i];
            }
        }else {
            System.out.println(" wymiary podanych tablic nie są równe - nie mozna ich zsumowac");
            tab = null;
            System.out.println(" NULL");
        }

        return tab;
    }

    public static int[] sumaEltablicNierow(int[] x, int[] y){
        int[] tab;
        int wym;

        if(x.length<y.length) {
           tab = new int[x.length];
           wym = x.length;
        } else {
           tab = new int[y.length];
            wym = y.length;
        }

        for(int i=0;i<wym;i++) {
            tab[i] = x[i] + y[i];
        }

        return tab;
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
