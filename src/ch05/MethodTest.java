package ch05;

public class MethodTest {
    // Method
    public static void printMyself(String name, int age, float height, char bloodType)
    {
        System.out.printf("%s의 나이는 %d세, 키는 %.2fcm, 혈액형은 %c 형이다.", name, age, height, bloodType);
    }
    // Method
    public static void printSeason(int mon)
    {
        if(mon < 3 || mon == 12)
        {
            System.out.println("겨울");
        }
        else if(mon < 6)
        {
            System.out.println("봄");
        }
        else if(mon < 9)
        {
            System.out.println("여름");
        }
        else if(mon < 12)
        {
            System.out.println("가을");
        }
        else
        {
            System.out.println("알 수 없음"); // 예외처리
        }
    }

    public static void main(String[] args) {
//        printMyself("황장군", 17, 180.82f, 'A');
        int mon = (int)(Math.random() * 12) + 1;
        System.out.println(mon);
        printSeason(mon);
    }
}
