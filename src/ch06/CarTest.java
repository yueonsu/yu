package ch06;

public class CarTest {
    public static void main(String[] args) {
        Car car = new Car();
        car.brand = "현대";
        car.nm = "소나타";
        car.drive();
        car.stop();

        Car car2 = new Car();
        car2.brand = "기아";
        car2.nm = "K5";
        car2.drive();
        car2.stop();

        System.out.println(car.hashCode());
        System.out.println(car2.hashCode());
        System.out.println(car == car2);

        Car car3 = new Car();
        car3.brand = "현대";
        car3.nm = "소나타";
        car3.drive();
        car3.stop();
        System.out.println(car == car3);
    }
}