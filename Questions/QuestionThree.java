package Questions;

public class QuestionThree {

    public static void main(String[] args)
    {

        int[] arr = {1, 4, 20, 3, 10, 5};

        System.out.println(subArraySum(arr, arr.length, 33));
    }

    /**
     * we loop through our array, and we add to current sub array,
     * if it exceeded, we remove the first element and we continue to find the sum or return not found
     * @param arr our array
     * @param n the size of our array
     * @param sum the target number
     * @return if we found the index start and ending, otherwise return not found
     */
   public static int subArraySum(int[] arr, int n, int sum)
    {
        int curr_sum = arr[0], start = 0, i;

        for (i = 1; i <= n; i++) {
            while (curr_sum > sum && start < i - 1) {
                curr_sum = curr_sum - arr[start];
                start++;
            }

            if (curr_sum == sum) {
                int p = i - 1;
                System.out.println(
                        "sum is between indexes " + start
                                + " and " + p);
                return 1;
            }

            // we add this element to curr_sum
            if (i < n)
                curr_sum = curr_sum + arr[i];
        }

        System.out.println("not found");
        return 0;
    }
}
