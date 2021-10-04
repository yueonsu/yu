package ch05;

public class PrimitiveAndRefExample2 {
    public static void main(String[] args) {
        int val = 10;

        Box box = new Box();
        box.val = 10;

        Box box2 = box; //--> 주소값 복사 box, box2는 같은 곳을 가리킨다
        

        System.out.println("val : " + val);
        changeVal(val);
        System.out.println("val : " + val);
        System.out.println("------");
        System.out.println("box.val : " + box.val);
        changeVal(box);
        System.out.println("box.val : " + box2.val);

    }

    public static void changeVal(int pval)
    {
        pval = 30;
    }

    public static void changeVal(Box pbox)
    {
        pbox.val = 30;
    }
}

class Box
{
    int val;
}