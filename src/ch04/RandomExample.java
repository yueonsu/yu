package ch04;

import java.util.Random;

public class RandomExample {
    public static void main(String[] args) {
        int num = (int)(Math.random() * 6);
        System.out.println("num : " + num);

        // 2~7
        int num2 = (int)(Math.random() * 6) + 2; //0~5 > 2~7

        // 55~108
        int num3 = (int)(Math.random() * 54) + 55; //0~53 > 55 ~ 108
    }
}
