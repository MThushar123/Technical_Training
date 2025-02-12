import java.util.Scanner;

class feb11_1 {
    public static void main(String[] args) {
        System.out.println("Enter the IP address:");

        Scanner input = new Scanner(System.in);
        String ip = input.nextLine();
        
        System.out.println("You entered IP address: " + ip);

        String[] num = ip.split("\\.");

        int[] ip_add = new int[4];

        for (int i = 0; i < num.length; i++) {
                int a = Integer.parseInt(num[i]);
                
                ip_add[i] = a;

                if (a > 255) {
                    System.out.println("Invalid IP address:" + a);
                    break;
                }
                else{
                System.out.println("The IP address is valid.");
            }
        }
        input.close();
    }
}


