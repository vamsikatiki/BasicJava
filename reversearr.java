import java.util.Arrays;

public class reversearr {
    public static void main(String[] args) {
        int[] arr = {26, 4, 89, 65, 987};
        int start = 0;
        int end = arr.length - 1;
        System.out.println(end);
        while (start < end) {
            int temp = arr[start];
            arr [start] = arr[end];
            arr [end] = temp;
            start++;
            end--;


        }
        System.out.println(Arrays.toString(arr));
    }

}
