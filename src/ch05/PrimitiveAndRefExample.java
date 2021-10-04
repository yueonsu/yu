package ch05;

public class PrimitiveAndRefExample {
    public static void main(String[] args) {
//        A a = new A();
        String s1= "Hello";
        System.out.println(s1);
//        changeVal(a);
//        System.out.println(a.str);
//        a.str = "Hello";
//        System.out.println(a.str);
        System.out.println(changeVal1("안녕"));

    }

    public static void changeVal(String str)
    {
        str = "안녕";
    }

    public static String changeVal1(String strr)
    {
        strr = strr;
        return strr;
    }

}
//class A
//{
//    String str;
//}
