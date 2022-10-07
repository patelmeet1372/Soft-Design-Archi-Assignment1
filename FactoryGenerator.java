package assignment1;

import java.io.FileNotFoundException;

public class FactoryGenerator {


    public static Apple createAppleFactory(String type) throws FileNotFoundException {
        if (type == "Apple") {
            return new Apple();
        }
        else {
            return null;
        }
    }

    public static Banana createBananaFactory(String check2) {
        if (check2 == "Banana") {
            return new Banana();
        }
        else {
            return null;
        }
    }

}
