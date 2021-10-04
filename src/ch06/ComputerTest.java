package ch06;

public class ComputerTest {
    public static void main(String[] args) {
        Computer.brand = "삼성"; // 한 값만 저장 가능
        System.out.println("Computer brand : " + Computer.brand);

        Computer c1 = new Computer();
        c1.cpu = 10;
        System.out.println("C1 brand : " + c1.brand);
        System.out.println("Computer.brand : " + Computer.brand);
        System.out.println("c1.cpu : " + c1.cpu);

        Computer c2 = new Computer(); // 객체마다 다른 값을 저장 가능
        c2.brand = "애플";
        c2.cpu = 20;
        System.out.println("C2 brand : " + c2.brand);
        System.out.println("C2 cpu : " + c2.cpu);
        System.out.println("-----");

        System.out.println("Computer brand : " + c1.brand);
        System.out.println("c1.cpu : " + c1.cpu);
    }
}
