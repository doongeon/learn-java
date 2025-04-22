package ch08.sec08;

public class SmartTelevision implements RemoteControl, Searchable{
    @Override
    public void turnOn() {
        System.out.println("turn on th TV");
    }

    @Override
    public void turnOff() {
        System.out.println("turn off the TV");
    }

    @Override
    public void search(String url) {
        System.out.println("TV is looking for " + url);
    }
}
