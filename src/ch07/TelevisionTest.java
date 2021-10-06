package ch07;

public class TelevisionTest {
    public static void main(String[] args) {
        Television tv = new Television();
        RemoteControl rc = tv;
//        rc.volumeState(); 알고있는 값만 호출 가능
        Television tv2 = (Television) rc;
        tv.volumeState();
        for(int i=0; i<3; i++) {
            tv.volumeUp();
        }
        tv.volumeState();
        for(int i=0; i<200; i++) {
            tv.volumeDown();
        }
        tv.volumeState();
    }
}
