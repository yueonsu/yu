package ch06;

public class CalcTest {
    public static void main(String[] args) {

        String str = "10";
        int intStr = Integer.parseInt(str);
        System.out.println(intStr + 10);

        int result = StaticCalc.sum(10, 20);
        System.out.println("static sum : " + result);

        Calc c = new Calc();
        c.n1 = 10;
        c.n2 = 20;

        int result2 = c.sum();
        System.out.println("instance sum : " + result2);

        int result3 = Calc.sum(10, 20);
    }
}
