package ss3_arrays_and_methods_in_java.excercise;

public class FindTheMinimunValueInArray {
    public static void main(String[] args) {
        int numbers[] = new int[]{1,2,3,4,5,6,7,8,9};
        int min = numbers[0];
        for (int i = 0; i < numbers.length; i++){
            if(numbers[i]< min){
                min = numbers[i];
            }
        }
        System.out.println("Giá trị nhỏ nhất là: " + min);
    }
}
