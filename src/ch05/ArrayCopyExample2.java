package ch05;

public class ArrayCopyExample2 {
    public static void main(String[] args){
        int[] arr1 = {10, 20, 30, 100, 110};
        System.out.println(arr1.hashCode()); // 주소값

        int[] arr2 = new int[arr1.length];
        System.out.println(arr2.hashCode()); // 주소값

        // 깊은 복사 (deep copy) (heap 메모리 복사)
        // arr2 = arr1; // 이것은 얕은복사
        System.out.println(arr1 == arr2);

        for(int i=0; i<arr1.length; i++)
        {
            arr2[i] = arr1[i];
        }
        for(int i=0; i<arr2.length; i++)
        {
            System.out.println(arr2[i]);
        }
        System.out.println(arr1 == arr2);

        int[] arr3 = arr1;
        System.out.println(arr1 == arr3);
    }
}
