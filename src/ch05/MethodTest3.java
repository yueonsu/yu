package ch05;

public class MethodTest3 {
    public static int getRandom(int fst, int sec)
    {
        if(fst > sec) {return 0;}
        return (int)(Math.random() * (sec-fst+1)) + fst;
//                                      나오는수     최소값
    }


    public static void main(String[] args) {
        int rVal = getRandom(30, 40);
        System.out.println(rVal);
    }
}
