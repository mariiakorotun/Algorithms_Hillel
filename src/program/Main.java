package program;

import java.util.Scanner;

public class Main {
    private final static int allDaysOfWeek = 7;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] prices = new double[allDaysOfWeek];

        System.out.println("Insert the price of a given product: ");
        for (int i = 0; i < allDaysOfWeek; i++) {
            prices[i] = scanner.nextDouble();
        }

            for (int i = 0; i < prices.length; i++) {
                for (int j = 1; j <= prices.length - i - 1; j++) {
                    if (prices[j - 1] > prices[j]) {
                        double temp = prices[j - 1];
                        prices[j - 1] = prices[j];
                        prices[j] = temp;
                    }
                }
            }
            int avgCounter = 0;
            System.out.println("Sorted prices:");
            for (double price : prices) {
                if(price < 0){
                    continue;
                }
                else{
                    System.out.print(price + " ");
                    avgCounter++;
                }
            }

            double sum = 0;
            for (double price : prices) {
                if(price < 0){
                    continue;
                }
                sum += price;
            }
            double avg = sum / avgCounter;

            System.out.printf("%nThe average sum = %.2f", avg);
            scanner.close();
        }
    }
