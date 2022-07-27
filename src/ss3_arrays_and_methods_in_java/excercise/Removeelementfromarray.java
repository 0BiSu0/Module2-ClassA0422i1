package ss3_arrays_and_methods_in_java.excercise;
import java.util.*;
public class RemoveElementFromArray {
    public static void main(String args[]) {
        String[] arr = {"1", "5" , "3", "4", "2", "5"};
        System.out.println("Mang ban dau:\n"+Arrays.toString(arr));
        List<String> testList = new ArrayList<>(Arrays.asList(arr));
        System.out.println("ArrayList chua mang:\n"+ testList);
        testList.remove("5");
        System.out.println("Xoa phan tu co giá tri bang 5 tu ArrayList:\n"+ testList);
        arr = testList.toArray(new String[0]);
        System.out.println("Mang ket qua :\n"+Arrays.toString(arr));
    }
}
