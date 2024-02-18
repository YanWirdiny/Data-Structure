import java.util.ArrayList;

//import java.util.ArrayList;
public class tryarray {
    public  static void  main (String []args ){
        ArrayList<String> list = new ArrayList<>();
        list.add("Bonjour");
        list.add("Bonsoir");
        list.add("bye");
        for(String Salutation :list){
            System.out.println(Salutation);}
        String index2 = list.get(1);
        System.out.println(index2);
    }

}
