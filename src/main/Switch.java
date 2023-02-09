package main;

import java.util.Scanner;

public class Switch {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Unesite prvi broj: ");
        double operand1 = scanner.nextInt();

        System.out.println("Unesite drugi broj: ");
        double operand2 = scanner.nextInt();

        System.out.println("Unesite operaciju: ");
        String operator = scanner.next();

        switch (operator){
            case "+": System.out.println("Zbir je: " + (operand1 + operand2));
            break;
            case "-":{
                System.out.println("Razlika je: " + (operand1 - operand2));
            }break;
            case "*":{
                System.out.println("Proizvod je: " + (operand1 * operand2));
            }break;
            case "/":{
                if (operand2 != 0) {
                    System.out.println("Deljenje je: " + (operand1 / operand2));
                } else {
                    System.out.println("Deljenje sa nulom nije dozvoljeno!");
                }
            }break;
            default:{
                System.out.println("Greska pri unosu");
            }

        }









    }




}
