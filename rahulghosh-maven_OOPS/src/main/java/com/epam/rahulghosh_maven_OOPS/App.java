package com.epam.rahulghosh_maven_OOPS;
import com.epam.rahulghosh_maven_OOPS.chocolates.Chocolate;
import com.epam.rahulghosh_maven_OOPS.chocolates.Cadbury;
import com.epam.rahulghosh_maven_OOPS.chocolates.Barone;
import com.epam.rahulghosh_maven_OOPS.chocolates.Galaxy;
import com.epam.rahulghosh_maven_OOPS.gift.Gift;
import com.epam.rahulghosh_maven_OOPS.sweets.Sweets;
import com.epam.rahulghosh_maven_OOPS.sweets.Gulabjamun;
import com.epam.rahulghosh_maven_OOPS.sweets.Kheer;
import com.epam.rahulghosh_maven_OOPS.sweets.Kajukatli;
import com.epam.rahulghosh_maven_OOPS.sweets.Rasgulla;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int choice;
        Scanner io=new Scanner(System.in);
        System.out.println("Getting chocolates....");
        Chocolate chocolate1=new Cadbury("Cadbury Dairy Milk",60,20);
        Chocolate chocolate2=new Barone("Barone",30,20);
        Chocolate chocolate3=new Galaxy("Galaxy",50,20);
        System.out.println("Getting Sweets....");
        Sweets sweets1=new Gulabjamun("Gulabjamun",300,200);
        Sweets sweets2=new Kheer("Kheer",300,100);
        Sweets sweets3=new Kajukatli("Kajukatli",300,100);
        Sweets sweets4=new Rasgulla("Rasgulla",400,100);
        Gift gift=new Gift();
        gift.addChocolates(chocolate1,chocolate2,chocolate3);
        gift.addSweets(sweets1,sweets2,sweets3,sweets4);
        System.out.println("Sorting items in gift according to price");
        gift.sort();
        System.out.println("Total Weight of Gifts : "+gift.findTotalWeight());
        do
        {
        	System.out.println("<==============Happy New Year Gifts=============> ");
            System.out.println("Enter '1' to view all candies : ");
            System.out.println("Enter '2' to view all sweets : ");
            System.out.println("Enter '3' to know most expensive chocolate and sweets : ");
            choice=io.nextInt();
            switch(choice)
            {
                case 1:
                ArrayList<Chocolate> arrayList=gift.getChocolates();
                for (Chocolate c:arrayList) {
                    System.out.println(c.toString());
                }
                break;
                case 2:
                ArrayList<Sweets> arrayList1=gift.getSweets();
                for (Sweets s:arrayList1){
                    System.out.println(s.toString());
                }
                break;
                case 3:
                System.out.println("The Expensive Chocolate : "+mostExpensive(gift.getChocolates()));
                System.out.println("The Expensive Sweet : "+mostExpensive(gift.getSweets()));
                default:
                System.out.println("Please enter a valid option!!");
                break;
            }
        }
        while(choice < 4);
        io.close();
    }
    private static <T> String mostExpensive(ArrayList<T> arrayList){
        return arrayList.get(0).toString();
    }
}