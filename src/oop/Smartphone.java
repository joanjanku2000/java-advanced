package oop;

public class Smartphone {
    private final Screen screen;
    private final Camera camera;

    public Smartphone(Screen screen, Camera camera) {
        this.screen = screen;
        this.camera = camera;
    }

    public Screen getScreen() {
        return screen;
    }

    public Camera getCamera() {
        return camera;
    }


    @Override
    public String toString() {
        return "Smartphone{" + "screen=" + screen + ", camera=" + camera + '}';
    }
}
