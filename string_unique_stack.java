import java.util.*;

class string_unique_stack {
    public static void main(String[] args) {
        Stack<Character> s = new Stack<Character>();
        
        String str = "aabbccdde";
        
        for(int i=0;i<str.length();i++){
            s.push(str.charAt(i));
        }
        
        System.out.println("Entered elements is"+s);
        
        
        //int flag = 0;
        Stack<Character> s1 = new Stack<Character>();
        
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            int flag=0;
            for(int j=0;j<str.length();j++){
                if(i == j){
                    continue;
                }
                if(ch ==str.charAt(j)){
                    flag=1;//if 1 it is already exixts
                }  
                
            }
            if(flag==0){
                // for(int i=0;i<str.length();i++)
                s1.push(ch);
            }
        }
        System.out.println(s1);
    }
}