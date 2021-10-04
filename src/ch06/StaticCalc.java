package ch06;

public class StaticCalc {
    // static 은 메모리에 스스로 올라간다. ( 클래스 메모리 영역 )
    // static 은 미리 메모리에 올라가있다.
    // static 은 객체화 (인스턴스(new~~))가 필요없음.
    public static int sum(int n1, int n2) {
        return n1 + n2;
    }
}

