package interfaces;

/**
 * Loose Coupling
 */
public interface ElectronicDevice {
    void start();
    void stop();

    default void restart(){
        System.out.println("Restarting...");
    }

    static void sayHi(){
        System.out.println("HII");
    }

}
