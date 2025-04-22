package ch08.sec04;

public class Audio implements RemoteControl {
    private int volume = 5;

    @Override
    public void turnOn() {
        System.out.println("turn on the Audio");
    }

    @Override
    public void turnOff() {
        System.out.println("turn off the Audio");
    }

    @Override
    public void setVolume(int volume) {
        if(volume > MAX_VOLUME) this.volume = MAX_VOLUME;
        else if(volume < MIN_VOLUME) this.volume = MIN_VOLUME;
        else this.volume = volume;
        System.out.println("current Audio volume: " + this.volume);
    }
}
