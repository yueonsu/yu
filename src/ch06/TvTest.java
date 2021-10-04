package ch06;

public class TvTest {
    public static void main(String[] args) {
        Tv tv = new Tv();
        tv.setBrand("삼성");
        tv.setInch(50);
        System.out.println("Tv brand : " + tv.getBrand());
        System.out.println("Tv Inch : " + tv.getInch());
        //tv.brand = "삼성"; 이렇게 direct 로 변수를 사용하면 안 된다.

        Tv tv2 = new Tv();
        tv2.setBrand("LG");
        tv2.setInch(60);
        System.out.println("Tv2 brand : " + tv2.getBrand());
        System.out.println("Tv2 Inch : " + tv2.getInch());
        //tv.brand = "LG";
    }
}
