package Questions;

public class QuestionTwo {

    public static void main(String[] args){
        int[] arr = {1, 2, 4, 5};
        System.out.println(findMissingInteger(arr));
    }
    public static int findMissingInteger(int[] arr){

        //by using this formula we can find out the missing number
        //((size of array + 1)* (size of array + 2)) / 2
        int sum = ((arr.length + 1) * (arr.length + 2)) / 2;
        for (int i = 0; i < arr.length; i++) {
            sum -= arr[i];

        }
        return sum;
    }
}
