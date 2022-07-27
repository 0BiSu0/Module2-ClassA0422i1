package ss2_loop_in_java.excercise;

import java.util.Scanner;

public class Showprimeslessthan100 {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter N = :");
        int n = scanner.nextInt();
        System.out.println("Tất cả các số nguyên tố nhỏ hơn %D là \n");
        if (n >= 2) {
            System.out.print(2);
        }
        for (int i = 3; i < n; i++)
            if (isPrimeNumber(i)) {
                System.out.print(" " + i);
            }

    }
    public static boolean isPrimeNumber(int n){
        if(n < 2){
            return false;
        }
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++){
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }
}
