package ch02;

public class VariableTest {
    public static void main(String[] args) {
        //1. 정수는 실수값을 저장할 수 없다.
        //2. 작은타입에서 큰타입으로는 자동형변환이 이뤄진다. (물론 수동도 된다.)
        //3. 큰타입에서 작은타입으로는 자동형변환이 안 된다. (무조건 수동으로 해야 된다.)
        int n1 = 10, n2 = 3, n3, n4, n5;
        String str1, str2, str3;

        double result = (double)n1 / (double)n2;
        System.out.println("결과3 : " + result);
    }
}
