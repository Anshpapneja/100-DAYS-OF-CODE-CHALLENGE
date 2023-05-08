//REVERSING A STRING:

import java.util.*;
public class string {
 
    /**
     * @param args
     */
    public static void main(String[] args) {
    String str = "geeks";
    String rev = "";
    

    for(int i = str.length()-1; i>=0; i--){
        rev = rev + str.charAt(i);
    }
    System.out.println(rev);
    }
}
