import java.util.Scanner;

public class Feb10_2{
    public static void main(String[] args){
        System.out.println("Enter the Size of an array");

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of an array ");
        for(int i=0;i< n;i++){
            arr[i] = input.nextInt();
        }

        System.out.println("Entered elements are");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }

        int[] p_Sum = new int[n];
        p_Sum[n - 1] = arr[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            p_Sum[i] = arr[i] + p_Sum[i + 1]; // Moving backward
        }
        for(int i=0;i< n ;i++){
        System.out.println("Postfix  sum of an array\t"+p_Sum[i]+" " );
        }
        input.close();
    }
}