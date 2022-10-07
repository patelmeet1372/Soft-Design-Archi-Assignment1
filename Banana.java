package assignment1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Banana extends Product{

    public Banana createBanana(String productName2){
        this.productName2 = productName2;
        this.price2 = price2;
        System.out.println("Created " + this.productName2 + " in the main Inventory");
        return null;
    }

    public void setPrice() throws FileNotFoundException {
        String word = "mp";
        File file = new File("C:\\Users\\patel\\Desktop\\Software Design and Architech\\Assignment1\\inventory_PriceList.txt");
        Scanner input = new Scanner(file);
        for (int i=0; i<11; i++){
            word = input.next();
            if (word.equals(productName2)){
                word = input.next();
                System.out.println("Price set for "+productName2+" is: "+word);
            }
        }
    }
}
