package ch05;

public class MethodTest2 {
    public static String getOddEven(int num)
    {
        if(num%2 == 0)
        {
            return "짝";
        }
        else
        {
            return "홀";
        }
    }
    public static void main(String[] args) {
        String oddEven = getOddEven(10);
        System.out.println("홀짝 : " + oddEven);
    }
}
