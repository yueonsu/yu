package ch03;

public class OperatorExample5 {
    public static void main(String[] args) {
        //삼항식
        int n1 = 10;
        int n2 = 11;
        String result = n1 >= n2 ? "n1이 n2랑 같거나 크다" : "n2가 n1보다 크다";
        System.out.println(result);

        //mod (나머지)
        System.out.println(10 % 2);
        System.out.println(11 % 2);
        System.out.println(12 % 2);
        System.out.println(13 % 2);

        String str = 10 + "";
        String str1 = Integer.toString(n2);
        String str2 = String.valueOf(n2);
    }
}
