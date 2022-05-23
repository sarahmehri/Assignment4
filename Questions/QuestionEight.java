package Questions;

import java.util.Arrays;

public class QuestionEight {

    /**
     * a method to return  the kth smallest element
     * @param arr our array
     * @param k the k element
     * @return the kth smallest
     */
    public static int kthSmallest(Integer[] arr,
                                  int k)
    {
        // sorting the array
        Arrays.sort(arr);

        // Return k'th element in
        // the sorted array
        return arr[k - 1];
    }


    public static void main(String[] args)
    {
        Integer[] arr = new Integer[] { 12, 3, 5, 7, 19 };
        int k = 2;
        System.out.print("K'th smallest element is " + kthSmallest(arr, k));
    }
}
