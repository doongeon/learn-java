package ch08.sec04;

public class Television implements RemoteControl {
    private int volume = 5;

    @Override
    public void turnOn() {
        System.out.println("turn on the Television");
    }

    @Override
    public void turnOff() {
        System.out.println("turn off the Television");
    }

    @Override
    public void setVolume(int volume) {
        if(volume > MAX_VOLUME) this.volume = MAX_VOLUME;
        else if(volume < MIN_VOLUME) this.volume = MIN_VOLUME;
        else this.volume = volume;

        System.out.println("current TV volume: " + this.volume);
    }
}
