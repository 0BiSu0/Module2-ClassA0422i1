package ss1_Introduction_java.excercise;

import java.util.Scanner;

public class Currencyconverterapp {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your monney VND: ");
        usd = sc.nextDouble();
        double quydoi = usd * 23000;
        System.out.print("VND value: " + quydoi);
    }
}
