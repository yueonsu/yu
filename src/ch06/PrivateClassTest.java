package ch06;

public class PrivateClassTest {
    public static void main(String[] args) {
        PrivateClass pc = new PrivateClass();
//        pc.val = 10; 접근 불가능 (private)
        pc.defaultVal = 10;
    }
}

//      (패키지명이 같아야함)
/*          같은클래스         같은패키지           다른패키지
private         O                X                  X
default         O                O                  X
protected       O                O                상속만
public          O                O                  O
 */