package Questions;

public class QuestionFive {

    static void printArr(int[] arr, int n)
    {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    /**
     * the method to sort the array of 0, 1, 2
     * @param arr our array
     * @param n the length of our array
     */

  public static void sortArr(int[] arr, int n)
    {
        int i, cnt0 = 0, cnt1 = 0, cnt2 = 0;

        // count the number of 0s, 1s and 2s in the array
        for (i = 0; i < n; i++) {
            switch (arr[i]) {
                case 0:
                    cnt0++;
                    break;
                case 1:
                    cnt1++;
                    break;
                case 2:
                    cnt2++;
                    break;
            }
        }

        // update the array
        i = 0;

        // zeros
        while (cnt0 > 0) {
            arr[i++] = 0;
            cnt0--;
        }

        // ones
        while (cnt1 > 0) {
            arr[i++] = 1;
            cnt1--;
        }

        // twos
        while (cnt2 > 0) {
            arr[i++] = 2;
            cnt2--;
        }

        // print them out
        printArr(arr, n);
    }


    public static void main(String[] args)
    {
        int[] arr = { 0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1 };
        int n = arr.length;
        sortArr(arr, n);
    }
}
