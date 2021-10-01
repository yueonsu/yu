package ch05;

public class MethodTest3 {
    public static int getRandom(int fst, int sec) {
        if (fst > sec) {return 0;}
        return (int) (Math.random() * (sec - fst + 1)) + fst;
    }//                              나오는숫자들의 갯수     최소값

    public static int getABS(int num)
    {
        return num < 0 ? -num : num;
    }

    public static void main(String[] args) {
        int rVal = getRandom(30, 40);
        System.out.println(rVal);

        int absVal = getABS(10);
        int absVal2 = getABS(-10);
        System.out.println(absVal);
        System.out.println(absVal2);

    }
}
