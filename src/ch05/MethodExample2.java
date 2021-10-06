package ch05;

public class MethodExample2 {
    public static void main(String[] args) {
        //input O, output O (비void형)
        sum(200, 200);
        int result = sum(200, 200);
        System.out.println("sum : " + result);

        result = sum(10, 20);
        System.out.println("sum : " + result);
    }

    public static int sum(int n1, int n2) {
        return n1 + n2;
    }
}
