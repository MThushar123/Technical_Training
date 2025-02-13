import java.util.*;

class reverse_string {
    public static void main(String[] args) {
        Stack<Character> s = new Stack<Character>();
         
        String str = "Hello world";
         
        char[] rev_str = new char[(str.length())];
       
        for(int i=0;i<str.length();i++){
            s.push(str.charAt(i));
        }
       
        int i=0;
        while(!s.isEmpty()){
            rev_str[i++] = s.pop();
        }
       
       // while(!s.isEmpty()){
            System.out.println(rev_str);
         
    }
}