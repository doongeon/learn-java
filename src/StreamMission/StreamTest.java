package StreamMission;

import java.util.*;

public class StreamTest {
    public static void main(String[] args) {
        List<Computer> l = new ArrayList<>();

        l.add(new Computer("HP", 4));
        l.add(new Computer("Think pad", 16));
        l.add(new Computer("Asus", 8));
        l.add(new Computer("Mac", 8));
        l.add(new Computer("Dell", 16));

        while(!l.isEmpty()) {
            int newProcess = (int) (Math.random() * 3 + 1);

            Queue<Integer> results = new ArrayDeque<>(
                    l.stream().mapToInt(e -> e.runProcess(newProcess)).boxed().toList()
            );

            l.forEach(c -> {
                System.out.print(c.getName() + " " + newProcess + "GB ");
                if(!results.isEmpty()) System.out.print(results.poll() > 0 ? "할당!" : "실패..");
                System.out.println();
            });

            l = l.stream().filter(c -> c.getLeftMemory() > 0).toList();
        }
    }
}
