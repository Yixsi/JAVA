package test;
import domain.*;

public class mundopc {
    public static void main(String[] args) {
        Mouse mouse1 = new Mouse("USB", "hp");
        Keyboard keyboard1 = new Keyboard("USB", "hp");
        Monitor monitor1 = new Monitor("lenovo", 14.5);
        Computer computer1 = new Computer("Lenovo", monitor1, keyboard1, mouse1);

        Mouse mouse2 = new Mouse("Bluetooth", "hp");
        Keyboard keyboard2 = new Keyboard("USB", "hp");
        Monitor monitor2 = new Monitor("Asus", 14.5);
        Computer computer2 = new Computer("Asus", monitor1, keyboard2, mouse2);
        Computer computer3 = new Computer("Dell", monitor2, keyboard2, mouse2);

        Order orden1 = new Order();
        orden1.addComputer(computer1);
        orden1.addComputer(computer2);
        orden1.addComputer(computer3);
        orden1.generateOrder();
    }
}

