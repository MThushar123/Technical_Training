import java.util.Scanner;

public class Feb10_1 {
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
        p_Sum[0] = arr[0];

        for(int i=1;i<n;i++){
            p_Sum[i] = p_Sum[i - 1] + arr[i];

        }
        for(int i=0;i< n ;i++){
        System.out.println("Predix sum of an array\t"+p_Sum[i]+" " );
        }
        input.close();
    }
}