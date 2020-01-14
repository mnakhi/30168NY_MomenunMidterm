package string.problems;

import java.util.*;

/**
 * Created by mrahman on 04/22/17.
 */
public class DuplicateWord {

    public static void main(String[] args) {
        /*
         * Write a java program to find the duplicate words and their number of occurrences in the string.
         * Also Find the average length of the words.
         */

        String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";

        int count;
        double total=0;
        int countWord=0;
        String[] words = st.toLowerCase().split("\\W+");

        for (int i = 0; i < words.length; i++) {

            count = 1;
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    count++;
                    words[j] = "0";
                }

            }
            if (count > 1 && words[i] != "0") {
                System.out.println(words[i] + " " + count);
            }
        }
            System.out.println("*********************************");

            for (String word:words) {
                int wordLength = word.length();
                total += wordLength;
                countWord++;
            }
            double average = 0;
            if(countWord>0){
                average = total/countWord;
            }
            System.out.println("Average word length is: "+average);
            }


        }


