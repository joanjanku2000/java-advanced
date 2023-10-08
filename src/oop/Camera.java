package oop;

public class Camera {
    private float aperature;
    private float resolution;
    private int zoom;

    public Camera(float aperature, float resolution, int zoom) {
        this.aperature = aperature;
        this.resolution = resolution;
        this.zoom = zoom;
    }

    public float getAperature() {
        return aperature;
    }

    public void setAperature(float aperature) {
        this.aperature = aperature;
    }

    public float getResolution() {
        return resolution;
    }

    public void setResolution(float resolution) {
        this.resolution = resolution;
    }

    public int getZoom() {
        return zoom;
    }

    public void setZoom(int zoom) {
        this.zoom = zoom;
    }

    @Override
    public String toString() {
        return "Camera{" +
                "aperature=" + aperature +
                ", resolution=" + resolution +
                ", zoom=" + zoom +
                '}';
    }
}
