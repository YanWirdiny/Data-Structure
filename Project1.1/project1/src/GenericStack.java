import java.util.ArrayList;
import java.util.Scanner;

public class GenericStack <E> extends ArrayList<E> {

      public  GenericStack(){
          super();   //invoke constructuctor Arraylist in GenericStack
      }
      public int getSize(){
          return super.size(); //obtain class of  the stack
      }
      public E peek(){
          return
                  super.get(getSize()-1);}  // return the top element of the stack
    public  E  pop(){
          E value =  super.get(getSize()-1);
            super.remove(getSize()-1);
            return value;

    }
          public void push(E element){
          super.add(element);    //add a new element to the top of the stack

      }
      @Override
    public String toString(){
          return super.toString();
    }
      public static void main( String [] args ){
          GenericStack<String> stack1 = new GenericStack<>();
          Scanner input = new Scanner(System.in);
          String index;
           for(int a = 0; a < 5; a++){
               System.out.println("Please enter a string ");
                index = input.nextLine();
               stack1.push(index);
           }

           for( int k = 0 ; k<5 ; k++){
               System.out.println(stack1.pop());
           }


      }

}
