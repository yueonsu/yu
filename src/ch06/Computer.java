package ch06;

public class Computer {
    static String brand; // 실행과 동시에 메모리에 올라감 (static)
    int cpu;

    public void print()
    {
        System.out.printf("컴퓨터 브랜드는 %s이고, cpu는 %d입니다.", brand, cpu);
    }

//    public static void print2()
//    {
//        System.out.printf("컴퓨터 브랜드는 %s이고, cpu는 %d입니다.", brand, cpu); cpu가 메모리에 안 올라감.
//    }
}
