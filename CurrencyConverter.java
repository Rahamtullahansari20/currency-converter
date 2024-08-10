import java.util.Scanner;

public class CurrencyConverter {
    // convertion rate (these are the example rates; in practices ,use up-to-date)
    private static final double INR_TO_USD_RATE = 0.012;
    private static final double USD_TO_INR_RATE = 83.33;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Currency Converter");
        System.out.println("1:Convert INR to USD");
        System.out.println("2:Convert USD to INR");
        int choice = scanner.nextInt();
        if (choice == 1) {
            // Convert INR to USD
            System.out.print("Enter amount in INR:");
            double inrAmount = scanner.nextDouble();
            double usdAmount = convertInrToUsd(inrAmount);
            System.out.printf("%.2f INR is equivalent to %.2f USD%n", inrAmount, usdAmount);
        } else if (choice == 2) {
            // convert USD To INR
            System.out.print("Enter amount in USD");
            double usdAmount = scanner.nextDouble();
            double inrAmount = convertUsdToInr(usdAmount);
            System.out.printf("%.2f USD is equivalent to %.2f INR%n", usdAmount, inrAmount);
        } else {
            System.out.printf("Invalid option.Please choice 1 or 2");
        }
        scanner.close();
    }

    private static double convertInrToUsd(double inrAmount) {
        return inrAmount *
                INR_TO_USD_RATE;
    }

    private static double convertUsdToInr(double usdAmount) {
        return usdAmount *
                USD_TO_INR_RATE;

    }

}
