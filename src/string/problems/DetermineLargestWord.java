package string.problems;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class DetermineLargestWord {
    public static void main(String[] args) {
        /*
         Implement to Find the length and longest word in the given sentence below.
         Should return "10 biological".
         */
        String s="Human brain is a biological learning machine";
        Map<Integer, String> wordNLength = findTheLargestWord(s);
        //implement

        System.out.println(wordNLength);
    }

    public static Map<Integer, String> findTheLargestWord(String wordGiven){
        Map<Integer, String> map = new HashMap<Integer, String>();
        String st = "";
        //implement
        int lengthOfst = 0;
        String [] w = wordGiven.split(" ");
        for(int i =0; i<w.length;i++){
            if(w[i].length()>=st.length()){
                st=w[i];
                lengthOfst = st.length();
            }
            map.put(lengthOfst,st);

        }
        return map;
    }
}
