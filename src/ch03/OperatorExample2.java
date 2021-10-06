package ch03;

public class OperatorExample2 {
    public static void main(String[] args) {
        boolean play = true;
        System.out.println(play); //true

        play = !play;
        System.out.println(play); //false

        play = !play;
        System.out.println(play); //true

        play = !play;
        System.out.println(play); //false


    }
}
