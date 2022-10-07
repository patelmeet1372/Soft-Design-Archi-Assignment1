package assignment1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Apple extends Product {

    public Apple() throws FileNotFoundException {
    }

    public Apple createApple(String productName1){
        this.productName1 = productName1;
        this.price1 = "$0.00";
        System.out.println("Created " + this.productName1 + " in the main Inventory");
        return null;
    }

    public void setPrice() throws FileNotFoundException {
        String word = "mp";
        File file = new File("C:\\Users\\patel\\Desktop\\Software Design and Architech\\Assignment1\\inventory_PriceList.txt");
        Scanner input = new Scanner(file);
        for (int i=0; i<11; i++){
             word = input.next();
            if (word.equals(productName1)){
                word = input.next();
                System.out.println("Price set for "+productName1+" is: "+word);
            }
        }
    }

}