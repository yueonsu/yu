package ch07;

public interface RemoteControl {
    public static final int MAX_VOLUME = 10;
    int MIN_VOLUME = 0;

    public abstract void turnOn();
    public void turnOff();
    abstract void volumeUp();
    void volumeDown();
//  자동으로 public abstract가 붙는다
}
