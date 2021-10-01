package ch03;

public class OperatorExample3 {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 10;
        int n3 = 20;
        int n4 = 20;

        boolean result1 = n1 >= n2;     // true
        boolean result2 = n3 > n4;      // false

        System.out.println(result1 && result2);     // 모두 true여야 true. false가 날 가능성이 높은걸 앞쪽에 배치.
        System.out.println(result1 || result2);     // 하나라도 true가 있으면 true. true가 나올 가능성이 높은걸 앞쪽에 배치.


    }
}
