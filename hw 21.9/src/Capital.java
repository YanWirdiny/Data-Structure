import java.util.*;
public class Capital {

    public static  void main (String []args){
//  enter the state  and  capital be sure that the sate is the kaey and the capital the value 
        Map<String, String> CapitalMap = new HashMap<>();
        CapitalMap.put("Alabama","Montgomery");
        CapitalMap.put("Arizona","Phoenix");
        CapitalMap.put("Florida","Tallahassee");
        CapitalMap.put("Delaware","Dover");
        CapitalMap.put("Hawaii","Honolulu");
        CapitalMap.put("Massachusetts","Boston");
        CapitalMap.put("Kansas","Topeka");
        CapitalMap.put("Mississippi","Jackson");
        CapitalMap.put("New Jersey ","Trenton");
        CapitalMap.put("South Carolina","Columbia");

    // iteration through   hahmap aand print key and value 
        for(String key :CapitalMap.keySet()){
            System.out.println(key + "      " + CapitalMap.get(key));
        }
      
        


    }
}
