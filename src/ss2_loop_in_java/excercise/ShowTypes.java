package ss2_loop_in_java.excercise;

import java.util.Scanner;

public class ShowTypes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        while (choice != 4) {
            System.out.println("1. Print the Rectangle");
            System.out.println("2. Print the square triangle");
            System.out.println("3. Print isosceles triangle");
            System.out.println("4. Exit");
            choice = scanner.nextInt();
            switch (choice){
                case 1:
                    for (int i = 0; i < 3; i++){
                        for (int j = 0;  j < 7; i++){
                            System.out.println("*");
                        }
                        System.out.println("\n");
                    }
                    break;
                case 2:
                    for (int i = 0; i < 5; i++){
                        for (int j = 0; j < i + 1; j++){
                            System.out.println("*");
                        }
                        System.out.println("\n");
                    }
                    break;
                case 3:
                    for (int i = 0; i >= 1; i++){
                        for (int j = 1; j <= i; j++){
                            System.out.println("*");
                        }
                        System.out.println("\n");
                    }
                    break;
            }


        }
    }
}
