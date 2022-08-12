package ss3_arrays_and_methods_in_java.excercise;

import java.util.Scanner;

public class CountCharacterInAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhao vao chuoi: ");
        String str = scanner.nextLine();
        System.out.println("Nhap Keyword: ");
        String keyword = scanner.nextLine();
        System.out.println(Count(str, keyword));
    }
    public static int Count(String str, String keyword){
        String[] arrStr = str.split("");
        int count = 0;
        for( int i = 0; i < arrStr.length; i++){
            if (arrStr[i].equals(keyword)){
                count++;
            }
        }
        return count;
    }
}
