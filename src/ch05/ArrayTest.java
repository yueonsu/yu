package ch05;

public class ArrayTest {
    public static void main(String[] args) {
        int[] scores = { 100, 87, 56, 23, 28, 98, 30, 32 };
        //점수가 짝수인 친구들만 점수 프린트
        //점수가 홀수인 친구들의 합계점수도 프린트
        int sum = 0;

        for(int i=0; i< scores.length; i++)
        {
            if((scores[i]%2) == 0)
            {
                System.out.println(scores[i]);
            }
            else
            {
                sum += scores[i];
            }
        }
        System.out.println("Sum : " + sum);
    }
}
