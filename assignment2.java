import java.util.Scanner;

class assignment2{
    public static void main(String args[]){
        System.out.println("Enter the username");
        Scanner input = new Scanner(System.in);
        
        String username = input.nextLine();

        if(username.length()>5){
            
            if(username.length()>15){
                System.out.println("Please enter character less than 15");
                
            }
            else{
                if(Character.isDigit(username.charAt(0))){

                    System.out.println("Please Enter with Alphabets");
                }
                else{
                    if(Character.isLetterOrDigit(username.charAt(0))){
                        if(username.matches("[A-Za-z0-9]+")==true){
                            System.out.println("Username Satisfied");
                        
                        }
                    }
                    else{
                        System.out.println("Please Enter with Alphabets not with special character");
                    }
                }   
            }
        }
        else{
            System.out.println("Please enter more than 5 characters");
        }
        input.close();
    }
}