package pl.sda.strukturydanych;

public class StosTab {
    private int tab[];
    private int top;

    public StosTab(int rozmiar){
        tab = new int[rozmiar];
        top =-1;
    }

    public void push(int wartosc){

        //wersja I pokazowa
//        top = top+1;
//        tab[top] = wartosc;

        //wersja II
        if(isFull()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        tab[++top]=wartosc;
    }

    public int pop(){
        //wersja I pokazowa
//        return tab[top];
//        top = top-1;

        //wersja II
        if(isEmpty()){
            System.out.println(" wyjatek");
            throw new ArrayIndexOutOfBoundsException(); // wyrzucamy wyjatek
        }
        return tab[top--];
    }

    public boolean isEmpty(){
        return top == -1;

    }

    public int peek(){
        return tab[top];
    }
    public boolean isFull(){
        return top == tab.length-1;
    }

    public void show(){
        for(int i =0;i<=top;i++){
            System.out.println(tab[i] + " ");
        }
        System.out.println();
    }

}
