import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Feb10 {
    public static void main(String[] args){
         
        int[] arr= new int[10];

        System.out.println("Enter the size of an array");

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        System.out.println("Enter the elements of an array");

        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
            
        }
        System.out.println("Entered elements of an array are: \t");
        for(int i=0;i< n;i++){
            System.out.println(arr[i]);
        }
        Set<Character> uniqueDigits = new HashSet<>();

        for (int num : arr) {
            String strNum = Integer.toString(num);
            for (char digit : strNum.toCharArray()) {
                uniqueDigits.add(digit);
            }
        }

        System.out.print("Unique digits: ");
        for (char digit : uniqueDigits) {
            System.out.print(digit + " ");
        input.close();
    }
}
}

