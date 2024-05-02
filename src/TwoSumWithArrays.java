import java.util.Arrays;

public class TwoSumWithArrays {

    public static void main(String []args)
    {
        int[] arr = {2, 7, 3, 0, 1};
        int sum = 9;
        int[] res= Calculate(arr,sum);
        System.out.println(Arrays.toString(res));
    }
    public static int[] Calculate(int[] arr, int sum) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int complement = sum - arr[i];
                if (complement == arr[j]) {
                    return new int[]{arr[i], arr[j]};
                }
            }
        }
        return null;
    }
}