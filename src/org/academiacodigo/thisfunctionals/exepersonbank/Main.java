package org.academiacodigo.thisfunctionals.exepersonbank;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class Main {

    public static void  main(String[] args) {

        Person p1 = new Person("Yoshi");
        Bank b1 = new Bank(5000);
        Card c1 = new Card(p1, b1);
        Scanner sc = new Scanner(System.in);

        System.out.println("Hello, "+p1.getName()+ "\nEnter the amount you want to deposit €€: " );
        System.out.println("###################################################");
        sc.next();
        c1.deposite(500);
        System.out.println("Hello, " + p1.getName()+ "\nEnter the amount you want to raise €€: " );
        System.out.println("###################################################");
        c1.raiseMoney(1000);
        sc.next();
        System.out.println(p1.getName()+", tell me your expenses €: (Net, Games, Food)" );
        c1.payNet(55);
        c1.payFood(400, "Supermarket");
        c1.payGames(4,4);
        sc.next();
        System.out.println("Your balance " + b1.getPersonMoney()+"€");
        System.out.println(b1.getPersonMoney());


        //System.out.println("Hello, "+p1.getName()+ "\nEnter the amount you want to deposit: " );

        //System.out.println("Hello, " + p1.getName()+ "\nEnter the amount you want to raise: " );







        // System.out.println(p1.getName()+ ": Enter the amount you want to deposit: ");
        //System.out.println ("Enter the amount you want to raise: ")
        //System.out.println("Failing raise: " + cardPer +" you " + "have less money in the bank!");
    }
    }






