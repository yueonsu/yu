package ch05;

public class ArrayCopyExample {
    public static void main(String[] args) {
        int[] arr1 = {10, 20, 30};
        int[] arr2 = arr1; //  얕은 복사(shallow copy) 둘다 {10, 20, 30}에 접근할 수 있다, 주소값도 같다 (stack 메모리 복사)

        System.out.println("arr1[0] : " + arr1[0]);
        System.out.println("arr2[0] : " + arr2[0]);

//        arr1[0] = 5;
        arr2[0] = 5; // arr1 값도 바뀜

        System.out.println("arr1[0] : " + arr1[0]);
        System.out.println("arr2[0] : " + arr2[0]);

        System.out.println(arr1 == arr2);
    }
}
