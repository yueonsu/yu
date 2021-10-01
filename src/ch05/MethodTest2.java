package ch05;

public class MethodTest2 {
    public static void main(String[] args) {
        String oddEven = getOddEven(0);
        System.out.println("결과 : " + oddEven);
    }


    public static String getOddEven(int num)
    {
        if(num%2 == 0)
        {
            return "짝";
        }
        return "홀";
        
    }
}