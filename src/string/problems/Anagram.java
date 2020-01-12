package string.problems;

import java.util.Arrays;

/**
 * Created by mrahman on 04/22/17.
 */
public class Anagram {

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".
        System.out.println(checkIfAnagram("CAT","ACT"));
        System.out.println(checkIfAnagram("ARMY","MARY"));
    }
    public static boolean checkIfAnagram(String firstWord, String secondWord){
        if(firstWord.length() != secondWord.length()){
            return false;
        }

        char[] firstWordArray = firstWord.toLowerCase().toCharArray();
        char[] secondWordArray = secondWord.toLowerCase().toCharArray();

        Arrays.sort(firstWordArray);
        Arrays.sort(secondWordArray);

        for(int i = 0; i<firstWordArray.length;i++){
            if(firstWordArray[i]!= secondWordArray[i]){
                return false;
            }
        }
        return true;
    }
}
