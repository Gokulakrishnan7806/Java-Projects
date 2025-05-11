import java.text.DecimalFormat;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class TempretureConverter {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        DecimalFormat DecimalFormat = new DecimalFormat("#.##");

        while (true) {
            System.out.println("\n=== Temperature Converter ===");
            System.out.println("1. Celsius to Fahrenheit");
            System.out.println("2. Fahrenheit to Celsius");
            System.out.println("3. Celsius to Kelvin");
            System.out.println("4. Kelvin to Celsius");
            System.out.println("5. Fahrenheit to Kelvin");
            System.out.println("6. Kelvin to Fahrenheit");
            System.out.println("0. Exit");
            System.out.print("Enter your choice (0-6): ");

            if (!input.hasNextInt()) {
                System.out.println(" Invalid Input!please Enter a number");
                input.next();
                continue;
            }
            int choice = input.nextInt();
            if (choice == 0) {
                System.out.println(" Exiting the Converter.GoodBoy");
                break;
            }

            if (choice < 1 || choice > 6) {
                //System.out.println("Invalid choice! choose between 1 and 6.");
                continue;
            }
            System.out.println("Enter Temperature ");

            if (!input.hasNextDouble()) {
                System.out.println("Invalid tempreture! please Enter a Number ");
                input.next();
                continue;
            }


            double temp = input.nextDouble();
            double result = 0;
            String convertion = "";

            switch (choice) {

                case 1:
                    result = (temp * 9 / 5) + 32;
                    convertion = temp + "°C = " + DecimalFormat.format(result) + "°F";
                    break;

                case 2:
                    result = (temp - 32) * 5 / 9;
                    convertion = temp + "°F = " + DecimalFormat.format(result) + "°C";
                    break;

                case 3:
                    result = (temp + 273.12);
                    convertion = temp + "°C = " + DecimalFormat.format(result) + "°K";
                    break;

                case 4:
                    result = (temp - 273.15);
                    convertion = temp + "°K = " + DecimalFormat.format(result) + "°C";
                    break;

                case 5:
                    result = (temp - 32) * 5 / 9 + 273.15;
                    convertion = temp + "°F = " + DecimalFormat.format(result) + "°K";
                    break;

                case 6:
                    result = (temp - 273.15) * 9 / 5 + 32;
                    convertion = temp + "°K = " + DecimalFormat.format(result) + "°F";
                    break;
            }
            System.out.println("Result: " + convertion);
        }
        input.close();
    }
}
