package ch06;

public class CarTest3 {
    public static void main(String[] args) {

        Car car = new Car();
        car.brand = "현대";
        car.nm = "소나타";
//       (stack)-주소값             (Heap)
        Car car2 = new Car("현대", "그랜저");
        System.out.println("car2.brand : " + car2.brand);
        System.out.println("car2.nm : " + car2.nm);
    }
}