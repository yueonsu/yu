package ch04;

import java.util.Random;

public class RandomExample {
    public static void main(String[] args){
        int num = (int)(Math.random() * 6);
        System.out.println("num : " + num);

        int num2 = (int)((Math.random() * 6)+2);
        System.out.println(num2);

        int num3 = (int)((Math.random() * 54) + 55);
        System.out.println(num3);

    }
}
