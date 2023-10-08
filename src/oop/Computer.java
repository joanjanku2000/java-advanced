package oop;

public class Computer {

    private Processor processor;
    private Ram ram;
    private Storage storage;
    private Motherboard motherboard;

    public Computer(Processor processor, Ram ram, Storage storage, Motherboard motherboard) {
        this.processor = processor;
        this.ram = ram;
        this.storage = storage;
        this.motherboard = motherboard;
    }

    public Processor getProcessor() {
        return processor;
    }

    public Ram getRam() {
        return ram;
    }

    public Storage getStorage() {
        return storage;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }
}
