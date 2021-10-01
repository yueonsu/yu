package ch03;

public class OperatorExample2 {
    public static void main(String[] args) {
        boolean play = true;
        System.out.println(play);

        play = !play; // !는 NOT 개념 (논리연산자)
        System.out.println(play);

        play = !play;
        System.out.println(play);

        play = !play;
        System.out.println(play);
    }
}
