package ch05;

public class MethodTest3 {
    public static void main(String[] args) {
        int rVal = getRandom(40, 42);
        System.out.println(rVal);

        int absVal = getABS(10);
        int absVal2 = getABS(-10);
        System.out.println("absVal : " + absVal);
        System.out.println("absVal2 : " + absVal2);
    }
    public static int getABS(int val) {
        return val < 0 ? -val : val;
    }

    public static int getRandom(int n1, int n2) {
        return (int)(Math.random() * (n2 - n1 + 1)) + n1;
    }
}
