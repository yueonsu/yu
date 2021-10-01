package ch05;

public class ArrayExample2 {
    public static void main(String[] args) {
        int[] arr = new int[5]; // 숫자형들은 기본적으로 0으로 세팅됨, 레퍼런스타입은 NULL이 들어감.


        for(int i=0; i<arr.length; i++)
        {
            arr[i] = (i+1)*100;
        }

        for(int i=0; i<arr.length; i++)
        {
            System.out.println(arr[i]);
        }
    }
}
