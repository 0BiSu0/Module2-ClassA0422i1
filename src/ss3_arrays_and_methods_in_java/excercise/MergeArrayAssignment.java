package ss3_arrays_and_methods_in_java.excercise;

import java.util.Arrays;

public class MergeArrayAssignment {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6,7,8,9};
        int[] arr2 = {9,8,7,6,5,4,3,2,1};
        int lenght3 = arr1.length + arr2.length;
        int[] arr3 = new int[lenght3];
        int pop = 0;
        for (int element: arr1){
            arr3[pop] = element;
            pop++;
        }
        for (int element: arr2){
            arr3[pop] = element;
            pop++;
        }
        System.out.println("Array after Merge is: " + Arrays.toString(arr3));
    }
}
