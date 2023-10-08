package threads;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Thread> threadList = new ArrayList<>();
        for (int i = 0 ; i < 7; i++) {
            threadList.add(new Job());
        }

        for (Thread thread : threadList) {
            thread.start();
        }
    }
}
