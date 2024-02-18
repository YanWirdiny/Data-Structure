import java.util.*;
public class Demo
 {
  
    public static void main(String[] args) {
        // Creating a priority queue
        PriorityQueue<String> queue1 = new PriorityQueue<>();
        queue1.offer(" George ");
        queue1.offer(" Jim ");
        queue1.offer(" John ");
        queue1.offer(" Blake ");
        queue1.offer(" Kevin ");
        queue1.offer(" Michael ");
      
        PriorityQueue<String> queue2 = new PriorityQueue<>();
        queue2.offer(" George ");
        queue2.offer(" Katie ");
        queue2.offer(" Kevin ");
        queue2.offer(" Michelle ");
        queue2.offer(" Ryan ");
        
        // print the union the difference and the intersection of  the two priorityqueues
       System.out.println("the union of queue1 and queue2 " + unionQueue(queue1,queue2));
       System.out.println(differenceQueue(queue1, queue2));
       System.out.println(IntersectionQueue(queue1, queue2));
      
       
       
    }
    
   public static <E> PriorityQueue <E> unionQueue(PriorityQueue<E> newQueue , PriorityQueue<E> newQueue2 ){
            PriorityQueue<E> union = newQueue;
            union.addAll(newQueue2);
            return union;
      }


   public static <E> PriorityQueue <E> differenceQueue(PriorityQueue<E> newQueue , PriorityQueue<E> newQueue2 ){
        PriorityQueue<E> difference = newQueue;
       difference.removeAll(newQueue2);
        return difference;
  }
    /**
     * @param <E>
     * @param newQueue
     * @param newQueue2
     * @return
     */
    public static <E> PriorityQueue <E> IntersectionQueue(PriorityQueue<E> newQueue, PriorityQueue<E> newQueue2 ){
        PriorityQueue<E> intersection = new PriorityQueue<>();
          
        PriorityQueue <E> cloneQueue = new PriorityQueue<>(newQueue);
        
        for( E element : cloneQueue){
          if(newQueue2.contains(element)){
            intersection.offer(element);
          }
        }
        return intersection;
      
       }
      }
    




    

