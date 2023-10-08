package oop;

public class Ram {
    private Integer ramSize;
    private String ramMeasuringUnit;
    private String ramType;
    private String ramManufacturer;

    public Ram(Integer ramSize, String ramMeasuringUnit, String ramType, String ramManufacturer) {
        this.ramSize = ramSize;
        this.ramMeasuringUnit = ramMeasuringUnit;
        this.ramType = ramType;
        this.ramManufacturer = ramManufacturer;
    }

    public Integer getRamSize() {
        return ramSize;
    }

    public String getRamMeasuringUnit() {
        return ramMeasuringUnit;
    }

    public String getRamType() {
        return ramType;
    }

    public String getRamManufacturer() {
        return ramManufacturer;
    }
}
