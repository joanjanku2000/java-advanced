package oop;

public class Motherboard {
    private String motherboardType;
    private String processorSocketType;

    public Motherboard(String motherboardType, String processorSocketType) {
        this.motherboardType = motherboardType;
        this.processorSocketType = processorSocketType;
    }

    public String getMotherboardType() {
        return motherboardType;
    }

    public String getProcessorSocketType() {
        return processorSocketType;
    }
}
