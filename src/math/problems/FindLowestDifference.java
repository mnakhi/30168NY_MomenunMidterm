package math.problems;

import java.util.Arrays;

public class FindLowestDifference {
    public static void main(String[] args) {
        /*
         Implement in java.
         Read this below two array. Find the lowest difference between the two array cell.
         The lowest difference between cells is 1
        */
        int [] array1 = {30,12,5,9,2,20,33,1};
        int [] array2 = {18,25,41,47,17,36,14,19};

        System.out.println("Lowest difference between the two array cell is: "+minDiffElements(array1,array2));

    }
    public static int minDiffElements(int a1[], int a2[]){
        int minDifference = Integer.MAX_VALUE;
        int minOfa1 = -1;
        int minOfa2 = -1;
        int i = 0;
        int j = 0;
        int difference = 0;

        Arrays.sort(a1);
        Arrays.sort(a2);
        while(i < a1.length && j < a2.length){
            difference = Math.abs(a1[i]-a2[j]);
            if(difference < minDifference){
                minDifference = difference;
                minOfa1 = a1[i];
                minOfa2 = a2[j];
            }

            if(a1[i] < a2[j]){
                i++;
            }
            else{
                j++;
            }
        }
        return minDifference;
    }



}
