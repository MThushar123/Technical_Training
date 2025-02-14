import java.util.*;


class maxi {
    public static void main(String[] args) {
        System.out.println("Maximisible profit");
        
        String[] tasks = {"T1","T2","T3","T4","T5"};
        
        int[] d_line = {2,1,2,1,3};
        int[] profits = {100,50,10,20,30};
        
        int n = tasks.length;
        
        Integer[] s = new Integer[n];
    
        for(int i=0;i<n;i++){
            s[i] = i;
            
        }
        Arrays.sort(s,(a,b)-> profits[b] - profits[a]);
        
        int max=0;
        for(int i =0;i<n;i++){
            max = Math.max(max,d_line[i]);
        }
        
        String[] sch = new String[max];
        Arrays.fill(sch,null);
        int t_profit = 0;
        
        for(int i=0;i<n;i++){
            int ind = s[i];
            for(int j=d_line[ind]-1;j>=0;j--){
                if(sch[j]==null){
                    sch[j] = tasks[ind];
                    t_profit += profits[ind];
                    break;
                }        
            }
        }
       System.out.print("Scheduled Tasks = ");
        for (String task : sch) {
            if (task != null) {
                System.out.print(task + " ");
            }
        }
        System.out.println("\nMax Profit = " + t_profit); 
    }
}