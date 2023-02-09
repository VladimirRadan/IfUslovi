package main;

public class Main {

    public static void main(String[] args) {

        boolean a = !(6 == 7 || 7 > 9 && 5 !=5 || 600 < 600);


        if (true)
            System.out.println("");


        if (5==5){
            if (10>5){
                if (20>10){
                    System.out.println("");
                }
            }
        }


        if(a) {
            System.out.println("If uslov");
        }else if (10 > 50) {
            System.out.println("Prvi else if");
        }else if (15 > 15) {
            System.out.println("Drugi else if");
        }else {
            System.out.println("Nista od navedenog");
        }


    }




}
