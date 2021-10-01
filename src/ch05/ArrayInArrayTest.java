package ch05;

public class ArrayInArrayTest {
    /*
        김영희 총점: , 평균:
        김철수 총점: , 평균:
        홍길동 총점: , 평균:
        수학 총점: , 평균 :
        영어 : , 평균:
        국어 : , 평균:
     */
    public static void main(String[] args) {
        int[][] scores = {
                                {75, 100, 88}, //수학
                                {98, 100, 76}, //영어
                                {100, 90, 100} //국어
                         };
        int No = scores.length * scores[0].length;
        int sum = 0;


        String[] names = {"김영희", "김철수", "홍길동"};
        int[] nameint = new int[names.length];
        String[] object = {"수학", "영어", "국어"};
        int[] objectInt = new int[object.length];
        for(int i=0; i<nameint.length; i++)
        {
            for(int z=0; z<objectInt.length; z++)
            {
                sum+=scores[z][i];
            }
            System.out.printf("%s 총점 : %d\t평균: %.1f\n", names[i], sum, (double)sum / scores.length);
            sum = 0;
        }

        for(int i=0; i<objectInt.length; i++)
        {
            for(int z=0; z<scores[i].length; z++)
            {
                sum += scores[i][z];
            }
            System.out.printf("%s 총점: %d\t평균: %.1f\n", object[i], sum, (double) sum / scores[i].length);

            sum = 0;
        }

    }
}
