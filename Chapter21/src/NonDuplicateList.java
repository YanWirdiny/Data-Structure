import java.util.*;
import java.io.*;

public class NonDuplicateList {

    // import file  to be read via canner 
    public static  void main (String []args ){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter file location");
        String fileName = input.nextLine();

        // add file  to a treeset 
        TreeSet<String> setWord = new TreeSet<>();
        try {
            File file = new File(fileName);
            Scanner fileScanner = new Scanner(file);
            System.out.println("File contents:");

            // ignore  Uppercase letter and  comma 
            // split words
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String [] words = line.replaceAll( "[^a-zA-Z]"," ").toLowerCase().split("\\s+");
            
                for( String word : words){
                    setWord.add(word);
                }
            }
            

            fileScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } 
        // print the set where word are not repeated 
      for( String element :setWord){
        System.out.println(element);
      }
      



    }
}
