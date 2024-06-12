import java.util.Scanner;

public class CurrencyConverter{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to currency Converter");
        System.out.println("Available currencies: USD, EUR, GBP, INR");

        System.out.print("Enter the amount in you currency:");
        double amount = scanner.nextDouble();

        System.out.print("Enter you currency (USD, INR, EUR, GBP):");
        String fromCurrency = scanner.next().toUpperCase();

        System.out.print("Enter the currency you want to convert to (USD, GBP, EUR, INR):");
        String toCurrency = scanner.next().toUpperCase();

        double result = convertCurrency(amount, fromCurrency, toCurrency);
        System.out.println("Converted amount:" +result +" "+toCurrency);

        scanner.close();

    }


    public static double convertCurrency(double amount, String fromCurrency, String toCurrency) {
        double UsdToEurRate = 0.85;
        double UsdToGbpRate = 0.72;
        double EurToUsdRate = 1.18;
        double EurToGbpRate = 0.85;
        double GbpToUsdRate = 1.39;
        double GbpToEurRate = 1.17;
        double UsdToInrRate = 83.50;
        double InrToUsdRate = 0.012;
        double EurToInrRate = 89.74;
        double InrToEurRate = 0.011;
        double InrToGbpRate = 0.0094;
        double GbpToInrRate = 106.17;


        if (fromCurrency.equals("USD") && toCurrency.equals("EUR")) {
            return amount * UsdToEurRate;

        } else if (fromCurrency.equals("USD") && toCurrency.equals("GBP")) {
            return amount * UsdToGbpRate;

        } else if (fromCurrency.equals("EUR") && toCurrency.equals("USD")) {
            return amount * EurToUsdRate;

        } else if (fromCurrency.equals("EUR") && toCurrency.equals("GBP")) {
            return amount * EurToGbpRate;

        } else if (fromCurrency.equals("GBP") && toCurrency.equals("USD")) {
            return amount * GbpToUsdRate;

        } else if (fromCurrency.equals("GBP") && toCurrency.equals("EUR")) {
            return amount * GbpToEurRate;

        } else if (fromCurrency.equals("USD") && toCurrency.equals("INR")) {
            return amount * UsdToInrRate;

        } else if (fromCurrency.equals("INR") && toCurrency.equals("USD")) {
            return amount * InrToUsdRate;

        } else if (fromCurrency.equals("EUR") && toCurrency.equals("INR")) {
            return amount * EurToInrRate;

        } else if (fromCurrency.equals("INR") && toCurrency.equals("EUR")) {
            return amount * InrToEurRate;

        } else if (fromCurrency.equals("INR") && toCurrency.equals("GBP")) {
            return amount * InrToGbpRate;

        } else if (fromCurrency.equals("GBP") && toCurrency.equals("INR")) {
            return amount * GbpToInrRate;

        } else if (fromCurrency.equals(toCurrency)){
            return amount;

        }else{
            System.out.println("Invalid....Conversion not Supported");
            return 0;
        }

    }
}