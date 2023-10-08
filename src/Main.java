import exceptions.MyCustomException;
import oop.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args)  {
//        Lion lion = new Lion();
//        lion.roar();
//        Processor processor = new Processor("Intel Core i7", 4, 2.3F, 20, 30, "Intel", "RISC");
//        Ram ram = new Ram(8, "GigaBytes", "LPDDR5", "Kingston");
//        Ram ram2 = new Ram(16, "GigaBytes", "LPDDR5", "Kingston");
//        Storage storage = new Storage(512, "SSD", "Kingstone");
//        Motherboard motherboard = new Motherboard("ASUS", "LGA775");
//
//        Computer computer = new Computer(processor, ram, storage, motherboard);
//        Computer c2 = new Computer(processor,ram2,storage,motherboard);

//        Screen oled = new Screen(6.3f,120.0f,"OLED");
//        Camera camera = new Camera(1.7f,48.0f,5);
//        Smartphone apple = new Smartphone(oled,camera);
//
//        System.out.println(apple);
//
//        List<Integer> integersList = new ArrayList<>();
        int a = 3;
        int b = 0;
        System.out.println(divide(a,b));

    }

    public int sumOf2Numbers(int a,int b){
        return a + b;
    }

    public static int divide(int a, int b)  {
        if (b == 0) {
            throw new RuntimeException("Nuk mund te pjesetosh me 0");
        }
        return a / b;
    }

}
