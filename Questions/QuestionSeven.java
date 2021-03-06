package Questions;

public class QuestionSeven {

    /**
     * printing the leaders in the array
     * @param arr our array
     * @param size the size of our array
     */
   public static void printLeaders(int[] arr, int size)
    {
        int max_from_right =  arr[size-1];


        System.out.print(max_from_right + " ");

        for (int i = size-2; i >= 0; i--)
        {
            if (max_from_right < arr[i])
            {
                max_from_right = arr[i];
                System.out.print(max_from_right + " ");
            }
        }
    }


    public static void main(String[] args)
    {

        int[] arr = new int[]{16, 17, 4, 3, 5, 2};
        int n = arr.length;
        printLeaders(arr, n);
    }
}
