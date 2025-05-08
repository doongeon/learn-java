package StreamMission;

public class Computer {
    private String name;
    private String os;
    private final int totalMemory;
    private int usedMemory;

    public Computer(String name, int totalMemory) {
        this.name = name;
        this.totalMemory = totalMemory;
    }

    public Computer(String name, String os, int totalMemory) {
        this.name = name;
        this.os = os;
        this.totalMemory = totalMemory;
    }

    public String getName() {
        return name;
    }

    public String getOs() {
        return os;
    }

    public int getTotalMemory() {
        return totalMemory;
    }

    public int getUsedMemory() {
        return usedMemory;
    }

    public int runProcess(int memory) {
        if(totalMemory - usedMemory >= memory) {
            usedMemory += memory;
            return 1;
        }

        return -1;
    }

    public void closeProcess(int memory) {
        usedMemory = Math.max(0, usedMemory - memory);
    }

    public int getLeftMemory() {
        return totalMemory - usedMemory;
    }
}
