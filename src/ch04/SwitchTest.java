package ch04;

public class SwitchTest {
    public static void main(String[] args) {
        int mon = (int)(Math.random() * 14) + 1; // 1~12
        System.out.printf("%d월 ", mon);
        //swtich문에 mon변수를 활용하여서
        //12, 1, 2 > "겨울"
        //3, 4, 5 > "봄"
        //6, 7, 8 > "여름"
        //9, 10, 11 > "가을"
        //1~12 사이값이 아닌 값이 들어오면 "알 수 없음"
        switch(mon) {
            case 12: case 1: case 2:
                System.out.println("겨울");
                break;
            case 3: case 4: case 5:
                System.out.println("봄");
                break;
            case 6: case 7: case 8:
                System.out.println("여름");
                break;
            case 9: case 10: case 11:
                System.out.println("겨울");
                break;                
            default:
                System.out.println("알 수 없음");
                break;
        }

    }
}
