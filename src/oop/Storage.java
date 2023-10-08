package oop;

public class Storage {
    private Integer size;
    private String type; // hdd, apo ssd
    private String manufacturer;

    public Storage(Integer size, String type, String manufacturer) {
        this.size = size;
        this.type = type;
        this.manufacturer = manufacturer;
    }

    public Integer getSize() {
        return size;
    }

    public String getType() {
        return type;
    }

    public String getManufacturer() {
        return manufacturer;
    }
}
