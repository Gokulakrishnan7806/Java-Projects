package mobile;

import java.util.Scanner;

public class MobileStore {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Create a few mobiles for the store
        Mobile[] store = new Mobile[5];
        store[0] = new Mobile("Samsung", "Galaxy S23", 50000);
        store[1] = new Mobile("Apple", "iPhone 14", 90000);
        store[2] = new Mobile("OnePlus", "OnePlus 11", 60000);
        store[3] = new Mobile("Google", "Pixel 7", 75000);
        store[4] = new Mobile("Xiaomi", "Mi 13", 40000);

        int choice;
        boolean exit = false;

        do {
            System.out.println("\nWelcome to the Mobile Store!");
            System.out.println("1. View All Mobiles");
            System.out.println("2. Buy a Mobile");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();
            input.nextLine();  // Consume newline character

            switch (choice) {
                case 1: // View all mobiles in the store
                    System.out.println("\nAvailable Mobiles in the Store:");
                    for (int i = 0; i < store.length; i++) {
                        store[i].displayInfo();
                    }
                    break;

                case 2: // Buy a mobile
                    System.out.println("\nEnter the number of the mobile you want to buy:");
                    for (int i = 0; i < store.length; i++) {
                        System.out.println((i + 1) + ". " + store[i].model);
                    }

                    System.out.print("Enter your choice (1-5): ");
                    int modelChoice = input.nextInt();
                    input.nextLine();

                    if (modelChoice >= 1 && modelChoice <= 5) {
                        Mobile selectedMobile = store[modelChoice - 1];
                        System.out.println("\nYou have selected the " + selectedMobile.model + "!");
                        System.out.println("Price: " + selectedMobile.price + " INR");
                        System.out.print("Would you like to buy this mobile? (Yes/No): ");
                        String buyChoice = input.nextLine();

                        if (buyChoice.equalsIgnoreCase("Yes")) {
                            System.out.println("Thank you for purchasing the " + selectedMobile.model + "!");
                        } else {
                            System.out.println("No worries! Feel free to check other options.");
                        }
                    } else {
                        System.out.println("Invalid choice, please try again.");
                    }
                    break;

                case 3: // Exit the program
                    System.out.println("Exiting the Mobile Store. Thank you for visiting!");
                    exit = true;
                    break;

                default:
                    System.out.println("Invalid choice, please try again.");
            }
        } while (!exit);


    }
}


