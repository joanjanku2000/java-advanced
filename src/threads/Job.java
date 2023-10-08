package threads;

public class Job extends Thread {

    @Override
    public void run() {
        System.out.println("Executing thread " + super.getId());
    }
}
