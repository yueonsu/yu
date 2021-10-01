package ch04;

public class StringEqualsExample {
    public static void main(String[] args) {
//        문자열값 비교, 절대 == 비교하면 안된다.
//                            새로운 객체 생성 (주소값)
        String str1 = new String("안녕하세요");
        String str2 = new String("안녕하세요"); //str1 str2의 주소값은 다르다.
        System.out.println(str1 == str2); // ==비교는 주소값이 같은지 비교
//                  =은 뒤에값을 복사해서 변수에 넣는거이기 때문에 주소가 같다.
        String str3 = str2;
        System.out.println(str3 == str2);

//      문자열이 같은지 비교.
        System.out.println("str1.equals(str2) : " + str1.equals(str2));
        System.out.println("str2.equals(str1) : " + str2.equals(str1));
        System.out.println("str3.equals(str1) : " + str3.equals(str1));
    }
}
