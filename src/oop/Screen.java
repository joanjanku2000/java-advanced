package oop;

public class Screen {
    private float size;
    private float frequency;
    private String type;

    public Screen(float size, float frequency, String type) {
        this.size = size;
        this.frequency = frequency;
        this.type = type;
    }

    public float getSize() {
        return size;
    }

    public void setSize(float size) {
        this.size = size;
    }

    public float getFrequency() {
        return frequency;
    }

    public void setFrequency(float frequency) {
        this.frequency = frequency;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Screen{" +
                "size=" + size +
                ", frequency=" + frequency +
                ", type='" + type + '\'' +
                '}';
    }
}
