package Questions;
import java.util.*;

public class QuestionFour {

    public static void main(String[] args) {
        int[] arr = {10, 2, -2, -20, 10};
        int n = arr.length;
        int sum = -10;
        subArraySum(arr, n, sum);

    }

    /**
     * we create a hashmap to store a key value pair, the key is sum, and the value is the index
     * we need a variable to store the current sum
     * we tranverse through the array
     * and every element we update the current sum
     * and if the sum is equal to target number we return that indexes
     * @param arr our array
     * @param n the size of our arr
     * @param sum the target value
     */
    public static void subArraySum(int[] arr, int n, int sum) {
        //our current sum
        int cur_sum = 0;
        int start = 0;
        int end = -1;
        //we instantiate our hashmap to store key and value
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            cur_sum = cur_sum + arr[i];
            //check whether cur_sum - sum = 0, if 0 it means
            //the sub array is starting from index 0- so stop
            if (cur_sum - sum == 0) {
                end = i;
                break;
            }
            //if hashMap already has the value, means we already
            // have subarray with the sum - so stop
            if (hashMap.containsKey(cur_sum - sum)) {
                start = hashMap.get(cur_sum - sum) + 1;
                end = i;
                break;
            }
            //if value is not present then add to hashmap
            hashMap.put(cur_sum, i);

        }
        // if end is -1 : means we have reached end without the sum
        if (end == -1) {
            System.out.println("not found");
        } else {
            System.out.println("sum found between indexes "
                    + start + " to " + end);
        }

    }
}
