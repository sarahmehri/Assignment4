package Questions;

import java.sql.SQLOutput;

public class QuestionOne {



    public static void main(String[] args){
        int[] arr = {-1, -3, 4, -1, -20, 1, 5, -3};
        System.out.println(largestSum(arr));
    }

    /**
     * Write an efficient program
     * to find the sum of contiguous subarray within a one-dimensional
     * array of numbers which has the largest sum.
     * @param arr the array of target
     * @return the integer of sum of largest subarray
     */
    public static int largestSum(int arr[]){

        //we instantiate the final value to min value
        int finalLargestValue = Integer.MIN_VALUE;
        //we save every sub array sum and instantiate it with 0
        int subLargestValue = 0;

        //then loop through our array, and in every iteration we sub up
        //then update our largest sum
        for (int j : arr) {
            subLargestValue = subLargestValue + j;
            if (finalLargestValue < subLargestValue) {
                finalLargestValue = subLargestValue;
            }
            if (subLargestValue < 0) {
                subLargestValue = 0;
            }


        }
        //finallly we return our final largest subarray sum
        return finalLargestValue;

    }

}
