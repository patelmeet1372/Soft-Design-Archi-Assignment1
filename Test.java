package assignment1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws FileNotFoundException {

        Apple appleFactory = FactoryGenerator.createAppleFactory("Apple");


        //Creating Products for inventory;
        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();

        Banana banana1 = new Banana();
        Banana banana2 = new Banana();
        Banana banana3 = new Banana();

        System.out.println("--------------------------------------------------");

        //Apple Production;
        apple1.createApple("RedApple");
        apple2.createApple("RoyalGalaApple");
        apple3.createApple("GreenApple");

        System.out.println("--------------------------------------------------");

        //Banana Production;
        banana1.createBanana("RawBanana");
        banana2.createBanana("MexicanBanana");
        banana3.createBanana("RipeBanana");

        System.out.println("--------------------------------------------------");

        //Setting Price for the products from the Database (text (inventory_PriceList.txt) file in this case);

        apple3.setPrice();
        apple1.setPrice();
        apple2.setPrice();

        System.out.println("--------------------------------------------------");

        banana2.setPrice();
        banana3.setPrice();
        banana1.setPrice();

//        Apple apple1 = appleFactory.createApple("RedApple");
//        Apple apple2 = appleFactory.createApple("RoyalGalaApple");
//        Apple apple3 = appleFactory.createApple("GreenApple");
//
//        System.out.println("---------------------------------------------");
//
        Banana bananaFactory = FactoryGenerator.createBananaFactory("Banana");
//
//        Banana banana1 = bananaFactory.createBanana("RawBanana");
//        Banana banana2 = bananaFactory.createBanana("RawBanana");
//        Banana banana3 = bananaFactory.createBanana("RawBanana");

//
//        apple1.setPrice();
//        apple2.setPrice();
//        apple3.setPrice();


    }
}
