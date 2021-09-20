package task3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Candy candy1 = new Candy("Lolypop", 20.5, 5.7, "lolypop");
        Candy candy2 = new Candy ("Toffee", 30.8, 12.0, "toffee");
        Candy candy3 = new Candy ("Nougat", 16.9, 7.3, "nougat");
        Candy candy4 = new Candy("Chocolate", 38.2, 24.8, "chocolate");
        Biscuit biscuit1 = new Biscuit("Ovsyanoe", 68.3, 16.3,"Svitoch");
        Biscuit biscuit2 = new Biscuit("With Coffee", 45.3, 22.0, "Nestle");

        Sweet[] sweets = {
                candy1, candy2, candy3, candy4, biscuit1, biscuit2, candy1, candy2, candy3, candy4, biscuit1, biscuit2,
                candy1, candy2, candy3, candy4, biscuit1, biscuit2, candy1, candy2, candy3, candy4, biscuit1, biscuit2,
                candy1, candy2, candy3, candy4, biscuit1, biscuit2, candy1, candy2, candy3, candy4, biscuit1, biscuit2
        };
        Present present = new Present(sweets);
        present.presentWeight();

        Arrays.sort(sweets);
        for (Sweet sweet : sweets ){
            System.out.println(sweet.toString());
        }

        present.findSweet(7.0, 17.4);
    }
}
