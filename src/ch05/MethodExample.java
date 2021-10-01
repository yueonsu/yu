package ch05;

public class MethodExample {

//                 리턴타입     파라미터(매개변수)
    public static   void  main(String[] args) {//--> 메소드 선언부
//                       메소드명


        sum(10, 20); // 메소드 선언부
        sum(50, 120); // 메소드 선언부
        minus(100, 50); // 메소드 선언부

    }

    public static void sum(int n1, int n2)
    {
        System.out.println("Sum: " + (n1 + n2));    // 메소드선언부
    }
    public static void minus(int n1, int n2)
    {
        System.out.println("minus : " + (n1 - n2));
    }
}
