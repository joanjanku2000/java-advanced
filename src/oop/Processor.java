package oop;

public class Processor {
    private String type;
    private Integer numberOfCores;
    private float frequency;
    private Integer l1CacheSize;
    private Integer l2CacheSize;
    private String manufacturer;
    private String instructionSet;

    public Processor(String type, Integer numberOfCores, float frequency, Integer l1CacheSize, Integer l2CacheSize, String manufacturer, String instructionSet) {
        this.type = type;
        this.numberOfCores = numberOfCores;
        this.frequency = frequency;
        this.l1CacheSize = l1CacheSize;
        this.l2CacheSize = l2CacheSize;
        this.manufacturer = manufacturer;
        this.instructionSet = instructionSet;
    }

    public String getType() {
        return type;
    }

    public Integer getNumberOfCores() {
        return numberOfCores;
    }

    public float getFrequency() {
        return frequency;
    }

    public Integer getL1CacheSize() {
        return l1CacheSize;
    }

    public Integer getL2CacheSize() {
        return l2CacheSize;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getInstructionSet() {
        return instructionSet;
    }
}
