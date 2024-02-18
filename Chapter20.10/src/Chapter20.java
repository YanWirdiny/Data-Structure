import java.util.*;
public class Chapter20 {
    public static  void main(String []args){
     
           
                // Creating a priority queue
                PriorityQueue<Integer> priorityQueue = new java.util.PriorityQueue<java.lang.Integer>();

                // Adding elements to the priority queue
        boolean offer = priorityQueue.offer(5);
        priorityQueue.offer(2);
                priorityQueue.offer(8);
                priorityQueue.offer(1);

                // Polling elements from the priority queue (removing and returning the highest priority element)
                while (!priorityQueue.isEmpty()) {
                    System.out.println(priorityQueue.poll());
                }
            }
        }

    

