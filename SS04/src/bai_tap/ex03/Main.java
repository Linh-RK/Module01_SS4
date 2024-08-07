package bai_tap.ex03;

import java.util.Arrays;
import java.util.Random;



public class Main {
    public static void main(String[] args) {
//        Viết chương trình đo thời gian thực thi của thuật toán
//        đảo ngược mảng cho 1 mảng 100.000 số.
//        StopWatch stopWatch = new StopWatch();
        StopWatch stopWatch = new StopWatch();

        int[] arr = new int[100000];
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(100);
        }
        stopWatch.start();
        for (int i = 0; i < arr.length/2; i++) {
            int tmp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = tmp;
        }
        System.out.println(stopWatch.getStartTime());
        stopWatch.stop();
        System.out.println(stopWatch.getStopTime());
        System.out.println(stopWatch.getElapsedTime());
    }
}
