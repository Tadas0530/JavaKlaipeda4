package FoodShop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Store store = new Store(5);
        Cart cart = new Cart();
        store.addProduct("Pienas", 0.99f);
        store.addProduct("Kava", 2.20f);
        store.addProduct("Duona", 1.20f);
        store.addProduct("Aliejus", 3.40f);
        store.addProduct("Grikiai", 0.50f);

        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("Enter 0 to finish shopping");
            store.listProducts();
            int selection = scanner.nextInt();
            if(selection == 0) {
                store.pay();
                break;
            }
            store.addToCart(selection);
        }
    }
}
