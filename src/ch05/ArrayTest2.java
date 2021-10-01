package ch05;

import java.util.Scanner;

public class ArrayTest2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("몇 개의 숫자를 사용할 것 입니까?");
        int LEN = sc.nextInt();
        int[] numberArr = new int[LEN];
        int sum = 0;
        System.out.printf("숫자 %d개를 입력해 주세요\n", LEN); // 하드코딩 지양.
        for(int i=0; i<numberArr.length; i++)
        {
            System.out.printf("숫자 [%d] : ", i+1);
            numberArr[i] = sc.nextInt();
        }

        for(int i=0; i<numberArr.length; i++)
        {
            sum += numberArr[i];
        }
        System.out.printf("합계 : %d\n평균 : %.6f", sum, (float) sum / numberArr.length);


    }
}
