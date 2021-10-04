package ch06;
/*
    2가지로 구성
    - 멤버필드(변수, 상수)
    - 메소드 (생성자)
 */
public class Car {
    // 멤버필드 - 전역변수
    String nm;
    String brand;

    // 생성자
    // 1. 이름이 클래스명과 같아야함.
    // 2. 리턴 타입이 없어야 한다.
    // * 생성자가 하나도 없으면 컴파일러가 자동으로 넣어준다(기본 생성자).

    // 오버로딩 - 똑같은 이름의 메소드를 여러개 만들 수 있는 기술
    //           파라미터만 다르다면 다르게 만들 수 있다
    //           타입만 중요, 타입의 종류,갯수, 순서 중요, 리턴타입은 상관없음
    Car() {}

    Car(/* String dd */String brand, String nm) // * 지역변수(메소드 안) ,전역변수
    {
        // brand = brand; this를 안 쓸 경우 가장 가까운 brand를 씀. (호출 후 소멸)
        this.brand = brand; // 상수, this - 나 자신의 주소값에 저장.
        this.nm = nm;
        // 파라미터가 다를경우 상관없음
        // brand = dd;
    }

    void drive()
    {
        System.out.printf("%s의 %s가 달린다.\n",brand, nm);
    }

    void stop()
    {
        System.out.printf("%s의 %s가 멈춘다.\n", brand, nm);
    }
}
// stack 나올때 마지막에 들어온 것 부터 나감
// heap 들어온 순서대로 나감