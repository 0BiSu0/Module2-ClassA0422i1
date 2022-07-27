package ss4_classes_and_objects_in_java.excercise.stopwatch;

import java.util.Arrays;

public class Teststopwatch {
    public static void main(String[] args) {
        int[] arr = new int[1000000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10000000);
        }
        Classstopwatch sw = new Classstopwatch();
        sw.start();
        Arrays.sort(arr);
        sw.stop();
        System.out.println("Elapsedtime " + sw.getElapsedTime() + " ms");
    }
}
