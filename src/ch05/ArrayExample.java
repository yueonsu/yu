package ch05;

public class ArrayExample {
    public static void main(String[] args) {
        // 배열(Array)

        /*
        같은 타입의 값을 여러개 저장할 때 좋음.
        for문과 함께 사용하면 개꿀
         */

        int[] scores = { 83, 90, 87, 100, 50 }; // int형 배열( 레퍼런스타입 ( 주소값이 저장 ) , 원시타입 아님 )
//        scores[0] = 11;
//        System.out.println(scores[0]);
        System.out.println(scores.length);

      for(int i=0; i<scores.length; i++)
      {
          System.out.println(scores[i]);
      }
    }
}
