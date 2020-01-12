package string.problems;

import java.util.Arrays;

/**
 * Created by mrahman on 04/22/17.
 */
public class Anagram {

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".
        System.out.println(areAnagram("CAT","ACT"));
        System.out.println(areAnagram("ARMY","MARY"));
    }
    public static boolean areAnagram(String word1, String word2){
        if(word1.length() != word2.length()){
            return false;
        }

        char[] word1array = word1.toLowerCase().toCharArray();
        char[] word2array = word2.toLowerCase().toCharArray();

        Arrays.sort(word1array);
        Arrays.sort(word2array);

        for(int i = 0; i<word1array.length;i++){
            if(word1array[i]!= word2array[i]){
                return false;
            }
        }
        return true;
    }
}
