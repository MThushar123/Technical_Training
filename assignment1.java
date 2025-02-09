import java.util.Scanner;

class assignment1 {
    public static void main(String args[]){
    System.out.println("Enter the statement:-");
    Scanner input = new Scanner(System.in);

    String word = input.nextLine();

    word = word.replace("hte", "the");
    word = word.replace("recieve", "receive");

    System.out.println(word);
    
    input.close();
    }
}