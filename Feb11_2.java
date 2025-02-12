import java.util.Arrays;
import java.util.Scanner;

public class Feb11_2{
    public static int[] nextGreaterPrice(int[] prices) {
        int[] result = new int[prices.length];
        Arrays.fill(result, -1);
        finding_Greater(prices, result, 0);
        return result;
    }

    private static void finding_Greater(int[] prices, int[] result, int index) {
        if (index >= prices.length) return;
        for (int j = index + 1; j < prices.length; j++) {
            if (prices[j] > prices[index]) {
                result[index] = prices[j];
                break;
            }
        }
        finding_Greater(prices, result, index + 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of days: ");
        int n = scanner.nextInt();
        int[] prices = new int[n];
        System.out.println("Enter the stock prices for each day:");
        for (int i = 0; i < n; i++) {
            prices[i] = scanner.nextInt();
        }
        int[] result = nextGreaterPrice(prices);
        System.out.println("Next greater prices: " + Arrays.toString(result));
        scanner.close();
    }
}