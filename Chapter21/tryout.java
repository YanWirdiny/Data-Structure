import java.util.Arrays;
import java.util.PriorityQueue;

public class tryout{
  
    
    public static void main ( String []args){
        PriorityQueue<Integer> queue= new PriorityQueue<>(Arrays.asList(60,10,50,30,40,20));


             for(int i : queue){
                System.out.print(i);
             }
    }
}