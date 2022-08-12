package ss3_arrays_and_methods_in_java.excercise;

import java.util.Scanner;

public class SumNumbersInASpecifiedColumn {
    int m,n;
    int[][] arrA;
    Scanner scanner = new Scanner(System.in);
    public void input(){
        System.out.println("Nhap vao so hang: ");
        m = scanner.nextInt();
        System.out.println("Nhap vao so cot: ");
        n = scanner.nextInt();
        arrA = new int[m][n];
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                arrA[i][j] = (int) (Math.random() * 10);
            }
        }
    }
    public void output(){
        System.out.println("Mang la: ");
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                System.out.println(arrA[i][j] + " ");
            }
            System.out.println();
        }
    }
    public void SumColumn(){
        System.out.println("Nhap vao so cot: ");
        int x = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < m; i++){
            sum += arrA[i][x];
        }
        System.out.println("Tong cua cot" + x + " là: " + sum);
    }

    public static void main(String[] args) {
        SumNumbersInASpecifiedColumn sum = new SumNumbersInASpecifiedColumn();
        sum.input();
        sum.output();
        sum.SumColumn();
    }
}
