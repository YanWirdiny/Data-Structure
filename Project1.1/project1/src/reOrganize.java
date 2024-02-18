import java.io.File;
import java.io.FileReader;
import  java.util.*;
import java.io.BufferedReader;
import java.util.ArrayList;

public class reOrganize   {


    public static  void main (String [] args) throws Exception {
        //import and read text file
        File file = new File("C:\\Users\\drawd\\Downloads\\Gettysburg_Address.txt");
        BufferedReader text = new BufferedReader( new FileReader(file));

        String stext;

//        create ann arraylist to hold each element of the text
        ArrayList<String> speech = new ArrayList<>();
//    read text if it not empty  split it by words while ignoring  , and upperCase character;
        while ((stext = text.readLine())!= null){
            String [] words=stext.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+");

//        add each words to the Arraylist
        speech.addAll(Arrays.asList(words));

        }

//        sorting and printing
        Collections.sort(speech);
//        iterate through the array list
        for( String i : speech){
            System.out.println(i + " " );

        }
    }
}

