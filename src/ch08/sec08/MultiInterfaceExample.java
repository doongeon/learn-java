package ch08.sec08;

public class MultiInterfaceExample {
    public static void main(String[] args) {
        RemoteControl rc = new SmartTelevision();
        rc.turnOn();
        rc.turnOff();

        Searchable searchable = (Searchable) rc;
        searchable.search("youtube.com");
    }
}
